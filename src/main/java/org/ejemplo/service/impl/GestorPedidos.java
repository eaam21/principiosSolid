package org.ejemplo.service.impl;

import lombok.AllArgsConstructor;
import org.ejemplo.entity.Pedido;
import org.ejemplo.entity.Producto;
import org.ejemplo.service.CarritoCompras;
import org.ejemplo.service.MetodoPago;
import org.ejemplo.service.Notificador;
import org.ejemplo.service.Pago;

@AllArgsConstructor
public class GestorPedidos implements CarritoCompras, Pago {

    private final Notificador notificador;

    @Override
    public void agregarProducto(Producto producto) {
        if (!producto.isDisponible()) {
            System.out.println("❌ Producto no disponible: " + producto.getNombre());
            return;
        }
        System.out.println("✅ Producto agregado al carrito: " + producto.getNombre());
    }

    @Override
    public void pagar(MetodoPago metodo, Pedido pedido) {
        boolean exito = metodo.procesarPago(pedido.getProducto().getPrecio());
        if (exito) {
            pedido.setPagado(true);
            notificador.enviar("Tu pedido ha sido pagado con éxito", pedido.getCliente().getEmail());
        } else {
            System.out.println("❌ Error al procesar el pago.");
        }
    }
}
