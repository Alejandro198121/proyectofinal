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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import modelo.Cliente;

/**
 *
 * @author yanpi
 */
public class RegistroAlmacenes extends JFrame {

    private JPanel panelAlmacenes;
    private JLabel etiquetaSimple;
    private JLabel eSimple2;
    private JButton botonOk;
    private JButton botonSalir;
    private JComboBox<String> lista_Lugares;

    public RegistroAlmacenes() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 500);
        setTitle("Registro Almacenes");

        inicializarComponentes();

        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(false);
    }

    public void inicializarComponentes() {
        panelAlmacenes = new JPanel(null);
        panelAlmacenes.setBackground(new Color(215, 189, 226));
        panelAlmacenes.setVisible(true);

        etiquetaSimple = new JLabel("<html>¡Bienvenido al registro  <br> de almacenes!<html>");
        etiquetaSimple.setBounds(110, 50, 400, 80);
        etiquetaSimple.setFont(new Font("Arial", Font.ITALIC, 22));
        panelAlmacenes.add(etiquetaSimple);

        botonOk = new JButton("Registrar almacen");
        botonOk.setActionCommand("REGISTRAR_ALMACEN_BOTON");
        botonOk.setBounds(140, 310, 150, 30);
        panelAlmacenes.add(botonOk);

        botonSalir = new JButton("Salir");
        botonSalir.setActionCommand("SALIR_REGISTRO");
        botonSalir.setBounds(30, 400, 100, 30);
        panelAlmacenes.add(botonSalir);
        
        lista_Lugares = new JComboBox<String>();
        lista_Lugares.setBounds(160, 200, 130, 30);
        lista_Lugares.addItem("Kennedy");
        lista_Lugares.addItem("Bosa");
        lista_Lugares.addItem("Chapinero");
        lista_Lugares.addItem("Centro");
        lista_Lugares.addItem("Hayuelos");
        lista_Lugares.addItem("Bicentenario");
        panelAlmacenes.add(lista_Lugares);
        
        eSimple2 = new JLabel("<html> Escoja el lugar en el que <br> desea registrar el almacen<html>");
        eSimple2.setBounds(140, 140, 200, 40);
        panelAlmacenes.add(eSimple2);
        this.add(panelAlmacenes);

    }

    public void mensajeConfirmacion(String lugar){
        JOptionPane.showMessageDialog(null, "Su Almacen Ha sido Registrado en " + lugar);
    }
    
    public void mensajeYaHayAlmacen(){
        JOptionPane.showMessageDialog(null, "Ya hay un almacen registrado en este lugar");
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

    public JPanel getPanelAlmacenes() {
        return panelAlmacenes;
    }

    public void setPanelAlmacenes(JPanel panelAlmacenes) {
        this.panelAlmacenes = panelAlmacenes;
    }

    public JLabel getEtiquetaSimple() {
        return etiquetaSimple;
    }

    public void setEtiquetaSimple(JLabel etiquetaSimple) {
        this.etiquetaSimple = etiquetaSimple;
    }

    public JLabel geteSimple2() {
        return eSimple2;
    }

    public void seteSimple2(JLabel eSimple2) {
        this.eSimple2 = eSimple2;
    }

    public JButton getBotonSalir() {
        return botonSalir;
    }

    public void setBotonSalir(JButton botonSalir) {
        this.botonSalir = botonSalir;
    }

    public JComboBox<String> getLista_Lugares() {
        return lista_Lugares;
    }

    public void setLista_Lugares(JComboBox<String> lista_Lugares) {
        this.lista_Lugares = lista_Lugares;
    }

}
