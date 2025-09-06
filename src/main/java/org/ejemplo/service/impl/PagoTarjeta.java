package org.ejemplo.service.impl;

import org.ejemplo.service.MetodoPago;

public class PagoTarjeta implements MetodoPago {
    @Override
    public boolean procesarPago(double monto) {
        System.out.println("💳 Pago con tarjeta por $" + monto);
        return true;
    }
}
