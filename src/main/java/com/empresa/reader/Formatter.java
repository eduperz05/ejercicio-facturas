package com.empresa.reader;

import com.empresa.Empresa;
import com.empresa.facturas.Factura;
import com.empresa.facturas.FacturaConIVA;
import com.empresa.facturas.FacturaSinIVA;
import java.util.ArrayList;

public class Formatter {

    public static ArrayList<Empresa> rawToFormat(String rawText, String separador){
        // Raw Empresas
        String[] rawEmpresas = rawText.split(separador);
        // Raw Facturas
        ArrayList<String[]> rawFacturas = new ArrayList<>();
        for (String rawEmpresa: rawEmpresas) {
           rawFacturas.add(rawEmpresa.split("\n"));
        }

        // Raw field
        ArrayList<Empresa> empresasFormated = new ArrayList<>();
        int cont = 0;
        String nombreEmpresa = "Empresa";
        for (String[] facturas : rawFacturas ) {
            ArrayList<Factura> facturasFormated = new ArrayList<>();
            for(String fact : facturas) {
                String[] factura = fact.split(",");
                switch (factura[0]) {
                    case "IVA" -> {
                        Factura facturaConIVA = new FacturaConIVA(Integer.parseInt(factura[1]), factura[2], Double.parseDouble(factura[3]));
                        facturasFormated.add(facturaConIVA);
                    }
                    case "SINIVA" -> {
                        Factura facturaSinIVA = new FacturaSinIVA(Integer.parseInt(factura[1]), factura[2], Double.parseDouble(factura[3]));
                        facturasFormated.add(facturaSinIVA);
                    }
                    default -> {
                    }
                }
            }
            Empresa empresaFormated = new Empresa(nombreEmpresa+cont, cont++);
            empresaFormated.addFactura(facturasFormated);
            empresasFormated.add(empresaFormated);
        }
        return empresasFormated;
    }
}
