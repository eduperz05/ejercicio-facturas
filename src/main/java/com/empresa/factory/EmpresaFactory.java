package com.empresa.factory;

import com.empresa.models.empresa.Empresa;
import com.empresa.models.facturas.Factura;

import java.util.ArrayList;

public class EmpresaFactory {

  public static ArrayList<Empresa> createEmpresasFromRaw(String rawText, String separador) {
    String[] rawEmpresas = rawText.split(separador);
    ArrayList<Empresa> empresas = new ArrayList<>();

    for (String rawEmpresa : rawEmpresas){
      String[] facturasArray = rawEmpresa.trim().split("\n");
      ArrayList<Factura> facturas = new ArrayList<>();

      for (String facturaStr : facturasArray) {
        Factura factura = FacturaFactory.createFacturaFromString(facturaStr);
        facturas.add(factura);
      }
      Empresa empresa = new Empresa(nameEmpresaGenerator(), CIFGenerator(), facturas);
      empresas.add(empresa);
    }
    return empresas;
  }

  public static String nameEmpresaGenerator() {
    return "Empresa " + (int) (Math.random() * 1000);
  }

  public static String CIFGenerator() {
    return "CIF " + (int) (Math.random() * 1000);
  }
}
