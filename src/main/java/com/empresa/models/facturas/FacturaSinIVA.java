package com.empresa.models.facturas;

public class FacturaSinIVA extends Factura {
    public FacturaSinIVA(int numero, String concepto, double importe) {
        super(numero,concepto, importe);
    }

    @Override
    public double getImporteConIVA() {
        return this.getImporte();
    }
}
