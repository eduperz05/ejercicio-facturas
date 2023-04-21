package com.empresa.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {
    private String rutaFactura;
    private String fileName;
    private ArrayList<String> lines = new ArrayList<String>();

    public Reader(String fileName) {
        this.fileName = fileName;
    }

    public String read() throws FileNotFoundException {
        StringBuilder contenido = new StringBuilder();
        try {
            File file = new File ("public/" + this.fileName);
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()) {
                String data = reader.nextLine();
                contenido.append(data).append("\n");
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ha ocurrido un error al leer el fichero");
            e.printStackTrace();
        }
        return contenido.toString();
    }

}