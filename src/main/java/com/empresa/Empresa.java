package com.empresa;

import com.empresa.facturas.Factura;

import java.util.ArrayList;

public class Empresa {

    private final String nombre;
    private final int CIF;
    private ArrayList<Factura> facturas;

    public Empresa(String nombre, int CIF) {
        this.nombre = nombre;
        this.CIF = CIF;
    }

    public void addFactura(Factura factura) {
        facturas.add(factura);
    }

    public void addFactura(ArrayList<Factura> facturas) {
        this.facturas.addAll(facturas);
    }

    public String getNombre() {
        return nombre;
    }

    public int getCIF() {
        return CIF;
    }

    public ArrayList<Factura> getFacturas() {
        return facturas;
    }

    public void deleteFacturas( int ... iFacturas) {
        for (int iFact: iFacturas) {
            for ( Factura fact: facturas ) {
                if (fact.getNumero() == iFact) {
                    facturas.remove(fact);
                }
            }
        }
    }

    public double sumaFacturas() {
        double sum = 0;
        for (Factura fact: facturas) {
            sum += fact.getImporte();
        }
        return sum;
    }
}
