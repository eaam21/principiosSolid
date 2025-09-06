package org.ejemplo.service.impl;

import org.ejemplo.service.MetodoPago;

public class PagoPaypal implements MetodoPago {
    @Override
    public boolean procesarPago(double monto) {
        System.out.println("📧 Pago con PayPal por $" + monto);
        return true;
    }
}
