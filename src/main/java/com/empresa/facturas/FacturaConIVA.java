package com.empresa.facturas;

public class FacturaConIVA extends Factura{
    public FacturaConIVA(int numero, String concepto, double importe) {
        super(numero,concepto, importe);
    }

    @Override
    public double getImporteConIVA() {
        return getImporte()*1.21;
    }
}
