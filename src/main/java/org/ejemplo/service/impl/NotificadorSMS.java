package org.ejemplo.service.impl;

import org.ejemplo.service.Notificador;

public class NotificadorSMS implements Notificador {

    @Override
    public void enviar(String mensaje, String destinatario) {
        System.out.println("📱 SMS a " + destinatario + ": " + mensaje);
    }
}
