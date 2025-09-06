package org.ejemplo;

import org.ejemplo.entity.Cliente;
import org.ejemplo.entity.Pedido;
import org.ejemplo.entity.Producto;
import org.ejemplo.service.impl.GestorPedidos;
import org.ejemplo.service.impl.NotificadorEmail;
import org.ejemplo.service.impl.PagoTarjeta;

public class Main {
    public static void main(String[] args) {
        System.out.println("🛒 SISTEMA DE COMERCIO ELECTRÓNICO - PRINCIPIOS SOLID");

        Producto laptop = new Producto("Laptop Dell", 1200.0, true);
        Cliente cliente = new Cliente("Ana Pérez", "ana@mail.com");
        Pedido pedido = new Pedido(laptop, cliente, false);

        GestorPedidos gestor = new GestorPedidos(new NotificadorEmail());

        gestor.agregarProducto(laptop);
        gestor.pagar(new PagoTarjeta(), pedido);
    }
}