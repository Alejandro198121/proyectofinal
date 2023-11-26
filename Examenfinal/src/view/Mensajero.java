/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author alejo
 */
public class Mensajero {
    public String mensaje;

    public Mensajero() {
    }
    
    public void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
}
}

