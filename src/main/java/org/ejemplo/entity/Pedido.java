package org.ejemplo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Pedido {
    private Producto producto;
    private Cliente cliente;
    private boolean pagado;
}
