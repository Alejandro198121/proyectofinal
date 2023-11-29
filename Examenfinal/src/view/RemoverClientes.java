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
public class RemoverClientes extends JFrame {

    private JPanel panelRemoverClientes;
    private JLabel eSimple;
    private JComboBox<String> clientes;
    private JButton botonOk;
    private JButton botonSalir;

    public RemoverClientes() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 400);
        setTitle("REMOVER CLIENTES");

        inicializarComponentes();

        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(false);
    }

    public void inicializarComponentes() {

        panelRemoverClientes = new JPanel(null);
        panelRemoverClientes.setBackground(new Color(205, 97, 85));
        panelRemoverClientes.setVisible(true);

        botonSalir = new JButton("Salir");
        botonSalir.setBounds(20, 320, 100, 30);
        botonSalir.setActionCommand("SALIR_REMOVERCLIENTES");
        panelRemoverClientes.add(botonSalir);

        eSimple = new JLabel("<html>¡Hola de nuevo admin!<html>");
        eSimple.setBounds(110, 50, 400, 80);
        eSimple.setFont(new Font("Arial", Font.ITALIC, 22));
        panelRemoverClientes.add(eSimple);

        
        
        clientes = new JComboBox<String>();
        clientes.setBounds(90, 150, 300, 30);
        clientes.addItem("Cliente imaginario");
        panelRemoverClientes.add(clientes);

        botonOk = new JButton("Remover Cliente😈");
        botonOk.setFont(new Font("Segoe UI Emoji", Font.CENTER_BASELINE, 12));
        botonOk.setActionCommand("BOTON_REMOVERCLIENTE");
        botonOk.setBounds(110, 240, 200, 30);
        panelRemoverClientes.add(botonOk);

        this.add(panelRemoverClientes);
    }

    public JPanel getPanelRemoverClientes() {
        return panelRemoverClientes;
    }

    public void setPanelRemoverClientes(JPanel panelRemoverClientes) {
        this.panelRemoverClientes = panelRemoverClientes;
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