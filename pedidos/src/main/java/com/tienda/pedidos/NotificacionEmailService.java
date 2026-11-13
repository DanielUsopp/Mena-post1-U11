package com.tienda.pedidos;

public class NotificacionEmailService {
    public void enviar(String destinatario, String mensaje) {
        // simulacion de envio de correo
        System.out.println("Enviando correo a " + destinatario + ": " + mensaje);
    }
}
