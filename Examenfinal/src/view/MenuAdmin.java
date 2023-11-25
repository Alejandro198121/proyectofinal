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
public class MenuAdmin extends JFrame {

    private JPanel panelAdmin;
    private JLabel eOpciones;
    private JComboBox<String> opciones;
    private JButton botonOk;

    public MenuAdmin() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 400);
        setTitle("Menu Admin");

        inicializarComponentes();

        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(false);
    }

    public void inicializarComponentes() {
        panelAdmin = new JPanel(null);
        panelAdmin.setBackground(new Color(214, 234, 248));
        panelAdmin.setVisible(true);

        eOpciones = new JLabel("<html>¡Hola de nuevo admin! <br>¿Que desea hacer?<html>");
        eOpciones.setBounds(110, 80, 400, 80);
        eOpciones.setFont(new Font("Arial", Font.ITALIC, 22));
        panelAdmin.add(eOpciones);

        opciones = new JComboBox<String>();
        opciones.setBounds(30, 200, 380, 30);
        opciones.addItem("REGISTRO DE TIENDAS DE MERCADO (ALMACENES)");
        opciones.addItem("REGISTRO DE CLIENTES");
        opciones.addItem("ABONO A TARJETA DE CRÉDITO (LIBERACIÓN DE CUPO)");
        opciones.addItem("REPORTES ANALÍTICOS");
        panelAdmin.add(opciones);

        botonOk = new JButton("OK");
        botonOk.setActionCommand("OK_BOTON_ADMIN");
        botonOk.setBounds(160, 310, 100, 30);
        panelAdmin.add(botonOk);

        this.add(panelAdmin);
    }

    public JPanel getPanelAdmin() {
        return panelAdmin;
    }

    public void setPanelAdmin(JPanel panelAdmin) {
        this.panelAdmin = panelAdmin;
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
