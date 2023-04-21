package com.empresa.reader;

import java.io.FileNotFoundException;
public class PrincipalRead {
    public static void main(String[] args) {
        Reader file = new Reader("prueba.txt");
        try {
            String entireFile = file.read();
            System.out.println(entireFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
