/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author yanpi
 */
public class ReportesAnaliticos extends JFrame {

    private JPanel panelReportes;
    private JLabel eSimple;
    private JComboBox<String> opciones;
    private JButton botonOk;
    private JButton botonSalir;

    public ReportesAnaliticos() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 400);
        setTitle("Reportes Analiticos");

        inicializarComponentes();

        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void inicializarComponentes() {

        panelReportes = new JPanel(null);
        panelReportes.setBackground(new Color(241, 148, 138));
        panelReportes.setVisible(true);

        botonSalir = new JButton("Salir");
        botonSalir.setBounds(20, 320, 100, 30);
        botonSalir.setActionCommand("SALIR_MENUREPORTES_ANALITICOS");
        panelReportes.add(botonSalir);

        eSimple = new JLabel("<html>¡Hola de nuevo admin!<br> <br>¿Desea generar un pdf con <br>los reportes analiticos?<html>");
        eSimple.setBounds(100, 80, 400, 100);
        eSimple.setFont(new Font("Arial", Font.ITALIC, 22));
        panelReportes.add(eSimple);

        botonOk = new JButton("<html>Generar Reportes<br> Analiticos<html>");
        botonOk.setFont(new Font("Arial", Font.CENTER_BASELINE, 14));
        botonOk.setActionCommand("BOTON_GENERAR_REPORTES");
        botonOk.setBounds(120, 210, 170, 60);
        panelReportes.add(botonOk);

        this.add(panelReportes);
    }

    public JPanel getPanelReportes() {
        return panelReportes;
    }

    public void setPanelReportes(JPanel panelReportes) {
        this.panelReportes = panelReportes;
    }

    public JLabel geteSimple() {
        return eSimple;
    }

    public void seteSimple(JLabel eSimple) {
        this.eSimple = eSimple;
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

    public JButton getBotonSalir() {
        return botonSalir;
    }

    public void setBotonSalir(JButton botonSalir) {
        this.botonSalir = botonSalir;
    }

  
}
