/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author yanpi
 */
public class MenuCliente extends JFrame {

    private JPanel panelCliente;
    private JLabel eOpciones;
    private JComboBox<String> opciones;
    private JButton botonOk;
    private JButton botonSalir;
    
    public MenuCliente() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 400);
        setTitle("Menu Cliente");

        inicializarComponentes();

        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(false);
    }

    public void inicializarComponentes() {
        panelCliente = new JPanel(null);
        panelCliente.setBackground(new Color(171, 235, 198));
        panelCliente.setVisible(true);

        botonSalir = new JButton("Salir");
        botonSalir.setBounds(20, 320, 100, 30);
        botonSalir.setActionCommand("SALIR_MENUCLIENTE");
        panelCliente.add(botonSalir);
        
        eOpciones = new JLabel("<html>¡Hola Cliente! <br>¿Que desea hacer?<html>");
        eOpciones.setBounds(110, 80, 400, 80);
        eOpciones.setFont(new Font("Arial", Font.ITALIC, 22));
        panelCliente.add(eOpciones);

        opciones = new JComboBox<String>();
        opciones.setBounds(30, 200, 380, 30);
        opciones.addItem("REGISTRO DE PAREJAS");
        opciones.addItem("ASIGNACIÓN DE HORARIOS (DIA-HORA POR LUGAR)");
        opciones.addItem("ASIGNACIÓN DE CUPO DE TARJETA DE CRÉDITO");
        opciones.addItem("PAGOS CON TARJETA DE CRÉDITO");
        panelCliente.add(opciones);

        botonOk = new JButton("OK");
        botonOk.setActionCommand("OK_BOTON_CLIENTE");
        botonOk.setBounds(160, 310, 100, 30);
        panelCliente.add(botonOk);

        this.add(panelCliente);
    }

    public JPanel getPanelCliente() {
        return panelCliente;
    }

    public void setPanelCliente(JPanel panelCliente) {
        this.panelCliente = panelCliente;
    }

    public JButton getBotonSalir() {
        return botonSalir;
    }

    public void setBotonSalir(JButton botonSalir) {
        this.botonSalir = botonSalir;
    }

    public JLabel geteOpciones() {
        return eOpciones;
    }

    public void seteOpciones(JLabel eOpciones) {
        this.eOpciones = eOpciones;
    }

    public JComboBox<String> getOpciones() {
        return opciones;
    }

    public void setOpciones(JComboBox<String> opciones) {
        this.opciones = opciones;
    }

    public JButton getBotonOk() {
        return botonOk;
    }

    public void setBotonOk(JButton botonOk) {
        this.botonOk = botonOk;
    }

}
