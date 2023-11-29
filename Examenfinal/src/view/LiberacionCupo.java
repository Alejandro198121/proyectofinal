/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import modelo.Cliente;

/**
 *
 * @author yanpi
 */
public class LiberacionCupo extends JFrame {

    private JPanel panelLiberacion;
    private JLabel eSimple;
    private JComboBox<String> clientes;
    private JButton botonOk;
    private JButton botonSalir;

    public LiberacionCupo() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 400);
        setTitle("ABONO A TARJETA DE CRÉDITO");

        inicializarComponentes();

        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(false);
    }

    public void inicializarComponentes() {

        panelLiberacion = new JPanel(null);
        panelLiberacion.setBackground(new Color(214, 219, 223));
        panelLiberacion.setVisible(true);

        botonSalir = new JButton("Salir");
        botonSalir.setBounds(20, 320, 100, 30);
        botonSalir.setActionCommand("SALIR_LIBERACIONCUPO");
        panelLiberacion.add(botonSalir);

        eSimple = new JLabel("<html>¡Hola de nuevo admin!<html>");
        eSimple.setBounds(110, 50, 400, 80);
        eSimple.setFont(new Font("Arial", Font.ITALIC, 22));
        panelLiberacion.add(eSimple);

        
        
        clientes = new JComboBox<String>();
        clientes.setBounds(90, 150, 300, 30);
        clientes.addItem("Cliente imaginario");
        panelLiberacion.add(clientes);

        botonOk = new JButton("Abonar a tarjeta de credito");
        botonOk.setFont(new Font("Arial", Font.CENTER_BASELINE, 12));
        botonOk.setActionCommand("BOTON_LIBERACIONCUPO");
        botonOk.setBounds(110, 240, 200, 30);
        panelLiberacion.add(botonOk);

        this.add(panelLiberacion);
    }

    public JPanel getPanelLiberacion() {
        return panelLiberacion;
    }

    public void setPanelLiberacion(JPanel panelLiberacion) {
        this.panelLiberacion = panelLiberacion;
    }

    public JLabel geteSimple() {
        return eSimple;
    }

    public void seteSimple(JLabel eSimple) {
        this.eSimple = eSimple;
    }

    public JComboBox<String> getClientes() {
        return clientes;
    }

    public void setClientes(JComboBox<String> clientes) {
        this.clientes = clientes;
    }

    public JButton getBotonOk() {
        return botonOk;
    }

    public void setBotonOk(JButton botonOk) {
        this.botonOk = botonOk;
    }

    public JButton getBotonSalir() {
        return botonSalir;
    }

    public void setBotonSalir(JButton botonSalir) {
        this.botonSalir = botonSalir;
    }

    

}