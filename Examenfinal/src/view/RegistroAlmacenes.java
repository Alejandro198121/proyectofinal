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
public class RegistroAlmacenes extends JFrame {

    private JPanel panelAlmacenes;
    private JLabel etiquetaSimple;
    private JButton botonOk;

    public RegistroAlmacenes() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 400);
        setTitle("Registro Almacenes");

        inicializarComponentes();

        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void inicializarComponentes() {
        panelAlmacenes = new JPanel(null);
        panelAlmacenes.setBackground(new Color(215, 189, 226));
        panelAlmacenes.setVisible(true);

        etiquetaSimple = new JLabel("<html>¡Hola de nuevo admin! <br>¿Que desea hacer?<html>");
        etiquetaSimple.setBounds(110, 80, 400, 80);
        etiquetaSimple.setFont(new Font("Arial", Font.ITALIC, 22));
        panelAlmacenes.add(etiquetaSimple);
        
        botonOk = new JButton("OK");
        botonOk.setActionCommand("OK_BOTON_ADMIN");
        botonOk.setBounds(160, 310, 100, 30);
        panelAlmacenes.add(botonOk);

        this.add(panelAlmacenes);
    }

    public JPanel getpanelAlmacenes() {
        return panelAlmacenes;
    }

    public void setpanelAlmacenes(JPanel panelAlmacenes) {
        this.panelAlmacenes = panelAlmacenes;
    }

    public JLabel getetiquetaSimple() {
        return etiquetaSimple;
    }

    public void setetiquetaSimple(JLabel etiquetaSimple) {
        this.etiquetaSimple = etiquetaSimple;
    }

    public JButton getBotonOk() {
        return botonOk;
    }

    public void setBotonOk(JButton botonOk) {
        this.botonOk = botonOk;
    }

}
