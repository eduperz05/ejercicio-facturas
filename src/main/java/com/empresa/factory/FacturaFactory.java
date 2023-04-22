package com.empresa.factory;

import com.empresa.models.facturas.Factura;
import com.empresa.models.facturas.FacturaConIVA;
import com.empresa.models.facturas.FacturaSinIVA;

public class FacturaFactory {
  public static Factura createFacturaFromString(String facturaStr) {
    String[] facturaData = facturaStr.split(",");

    String tipoFactura = facturaData[0].trim();
    int numeroFactura = Integer.parseInt(facturaData[1].trim());
    String conceptoFactura = facturaData[2].trim();
    double importeFactura = Double.parseDouble(facturaData[3].trim());

    return switch (tipoFactura) {
      case "IVA" -> new FacturaConIVA(numeroFactura, conceptoFactura, importeFactura);
      case "SINIVA" -> new FacturaSinIVA(numeroFactura, conceptoFactura, importeFactura);
      default -> throw new IllegalArgumentException("Tipo de factura no reconocido: " + tipoFactura);
    };
  }
}
