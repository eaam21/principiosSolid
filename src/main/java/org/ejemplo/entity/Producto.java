package org.ejemplo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Producto {
    private String nombre;
    private double precio;
    private boolean disponible = true;
}
