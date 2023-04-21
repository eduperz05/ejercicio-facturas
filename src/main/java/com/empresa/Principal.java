package com.empresa;
import com.empresa.facturas.Factura;
import com.empresa.facturas.FacturaConIVA;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Empresa e1 = new Empresa("PwC", 4324352);
        Factura f1 = new FacturaConIVA(1, "proyecto1", 100.50);
        Factura f2 = new FacturaConIVA(2, "proyecto2", 100.50);
        ArrayList<Factura> facturas= new ArrayList<Factura>();
        facturas.add(f1);
        facturas.add(f2);
        e1.addFactura(facturas);

    }
}
