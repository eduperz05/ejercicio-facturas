package com.empresa;

import com.empresa.factory.EmpresaFactory;
import com.empresa.models.empresa.Empresa;
import com.empresa.utils.Reader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Reader file = new Reader("prueba.txt");
        try {
            String rawText = file.read();
            ArrayList<Empresa> empresas = EmpresaFactory.createEmpresasFromRaw(rawText, "\\*");
            for (Empresa empresa : empresas) {
                System.out.println(empresa.getNombre());
                System.out.println(empresa.getCIF());
                System.out.println(empresa.sumaFacturas());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
