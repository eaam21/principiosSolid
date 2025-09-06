package org.ejemplo.service.impl;

import org.ejemplo.service.Notificador;

public class NotificadorEmail implements Notificador {
    @Override
    public void enviar(String mensaje, String destinatario) {
        System.out.println("📧 Email a " + destinatario + ": " + mensaje);
    }
}
