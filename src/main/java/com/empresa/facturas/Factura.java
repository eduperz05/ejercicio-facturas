package com.empresa.facturas;

public abstract class Factura {
    private int numero;
    private double importe;
    private String concepto;

    public Factura(int numero, String concepto, double importe) {
        this.numero = numero;
        this.importe = importe;
        this.concepto = concepto;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public abstract double getImporteConIVA();
}
