package com.empresa.models.empresa;

import com.empresa.models.facturas.Factura;

import java.util.ArrayList;

public class Empresa {

    private final String nombre;
    private final String CIF;
    private ArrayList<Factura> facturas;

    public Empresa(String nombre, String CIF, ArrayList<Factura> facturas) {
        this.nombre = nombre;
        this.CIF = CIF;
        this.facturas = facturas;
    }

    public Empresa(String nombre, String CIF) {
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

    public String getCIF() {
        return CIF;
    }

    public ArrayList<Factura> getFacturas() {
        return facturas;
    }

    public void deleteFacturas( int ... iFacturas) {
        for (int iFact: iFacturas) {
            facturas.removeIf(fact -> fact.getNumero() == iFact);
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
