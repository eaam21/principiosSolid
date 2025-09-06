package org.ejemplo.service;

import org.ejemplo.entity.Pedido;

public interface Pago {
    void pagar(MetodoPago metodo, Pedido pedido);
}
