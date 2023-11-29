/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaRegistroParejas extends JFrame {

    private JPanel panelRegistroParejas;
    private JButton botonVolver;
    private JLabel eNombre;
    private JLabel eRestricciones;
    private JTextField campoNombre;
    private JComboBox<String> eGenero;
    private JComboBox<String> boxDia;
    private JComboBox<String> boxHora;
    private JComboBox<String> boxLugar;
    private JLabel eCorreo;
    private JTextField campoCorreo;
    private JButton botonRegistrarse;
    private JLabel eUsuario;
    private JLabel eContrasena;
    private JTextField campoUsuario;
    private JTextField campoContrasena;

    public VentanaRegistroParejas() {
        setTitle("Registro Parejas");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inicializarComponentes();

        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(false);
    }

    public void inicializarComponentes() {
        panelRegistroParejas = new JPanel(null);
        panelRegistroParejas.setBackground(new Color(251, 198, 248));
        panelRegistroParejas.setLayout(new FlowLayout());
        panelRegistroParejas.setVisible(true);

        botonVolver = new JButton("Volver");
        botonVolver.setActionCommand("VOLVER_REGISTROPAREJA");
        botonVolver.setBounds(40, 400, 100, 30);
        add(botonVolver);

        eNombre = new JLabel("Nombre:");
        eNombre.setBounds(170, 90, 800, 20);
        add(eNombre);
        
        eRestricciones = new JLabel("Restricciones:");
        eRestricciones.setBounds(470, 90, 800, 20);
        add(eRestricciones);

        campoNombre = new JTextField("vaca1");
        campoNombre.setBounds(250, 90, 200, 20);
        add(campoNombre);

        eGenero = new JComboBox<String>();
        eGenero.addItem("Mujer");
        eGenero.addItem("Hombre");
        eGenero.setBounds(250, 140, 200, 30);
        add(eGenero);

        boxDia = new JComboBox<String>();
        boxDia.addItem("Lunes");
        boxDia.addItem("Martes");
        boxDia.addItem("Miercoles");
        boxDia.addItem("Jueves");
        boxDia.addItem("Viernes");
        boxDia.setBounds(470, 120, 100, 30);
        add(boxDia);

        boxHora = new JComboBox<String>();
        boxHora.setBounds(470, 190, 130, 30);
        boxHora.addItem("6 a. m. - 8 a. m.");
        boxHora.addItem("8 a. m. - 10 a. m.");
        boxHora.addItem("10 a. m. - 12 p. m.");
        boxHora.addItem("12 p. m. - 2 p. m.");
        boxHora.addItem("2 p. m. - 4 p. m.");
        boxHora.addItem("4 p. m. - 6 p. m.");
        boxHora.addItem("6 p. m. - 8 p. m.");
        add(boxHora);

        boxLugar = new JComboBox<String>();
        boxLugar.setBounds(470, 250, 100, 30);
        boxLugar.addItem("Kennedy");
        boxLugar.addItem("Bosa");
        boxLugar.addItem("Chapinero");
        boxLugar.addItem("Centro");
        boxLugar.addItem("Hayuelos");
        boxLugar.addItem("Bicentenario");
        add(boxLugar);

        eUsuario = new JLabel("Usuario: ");
        eUsuario.setBounds(170, 200, 60, 10);
        add(eUsuario);

        campoUsuario = new JTextField("usuario");
        campoUsuario.setBounds(250, 200, 200, 20);
        add(campoUsuario);

        eContrasena = new JLabel("Contrasena: ");
        eContrasena.setBounds(150, 240, 90, 20);
        add(eContrasena);

        campoContrasena = new JTextField("contrasena");
        campoContrasena.setBounds(250, 240, 200, 20);
        add(campoContrasena);

        eCorreo = new JLabel("Correo: ");
        eCorreo.setBounds(170, 290, 100, 20);
        add(eCorreo);

        campoCorreo = new JTextField("correo@gmail.com");
        campoCorreo.setBounds(250, 290, 200, 20);
        add(campoCorreo);

        botonRegistrarse = new JButton("REGISTRAR PAREJA");
        botonRegistrarse.setActionCommand("PANEL_REGISTRAR_PAREJA");
        botonRegistrarse.setBounds(250, 350, 180, 30);
        add(botonRegistrarse);

        this.add(panelRegistroParejas);
    }

    public JPanel getPanelRegistroParejas() {
        return panelRegistroParejas;
    }

    public void setPanelRegistroParejas(JPanel panelRegistroParejas) {
        this.panelRegistroParejas = panelRegistroParejas;
    }

    public JButton getBotonVolver() {
        return botonVolver;
    }

    public void setBotonVolver(JButton botonVolver) {
        this.botonVolver = botonVolver;
    }

    public JLabel geteNombre() {
        return eNombre;
    }

    public void seteNombre(JLabel eNombre) {
        this.eNombre = eNombre;
    }

    public JLabel geteRestricciones() {
        return eRestricciones;
    }

    public void seteRestricciones(JLabel eRestricciones) {
        this.eRestricciones = eRestricciones;
    }

    public JTextField getCampoNombre() {
        return campoNombre;
    }

    public void setCampoNombre(JTextField campoNombre) {
        this.campoNombre = campoNombre;
    }

    public JComboBox<String> geteGenero() {
        return eGenero;
    }

    public void seteGenero(JComboBox<String> eGenero) {
        this.eGenero = eGenero;
    }

    public JComboBox<String> getBoxDia() {
        return boxDia;
    }

    public void setBoxDia(JComboBox<String> boxDia) {
        this.boxDia = boxDia;
    }

    public JComboBox<String> getBoxHora() {
        return boxHora;
    }

    public void setBoxHora(JComboBox<String> boxHora) {
        this.boxHora = boxHora;
    }

    public JComboBox<String> getBoxLugar() {
        return boxLugar;
    }

    public void setBoxLugar(JComboBox<String> boxLugar) {
        this.boxLugar = boxLugar;
    }

    public JLabel geteCorreo() {
        return eCorreo;
    }

    public void seteCorreo(JLabel eCorreo) {
        this.eCorreo = eCorreo;
    }

    public JTextField getCampoCorreo() {
        return campoCorreo;
    }

    public void setCampoCorreo(JTextField campoCorreo) {
        this.campoCorreo = campoCorreo;
    }

    public JButton getBotonRegistrarse() {
        return botonRegistrarse;
    }

    public void setBotonRegistrarse(JButton botonRegistrarse) {
        this.botonRegistrarse = botonRegistrarse;
    }

    public JLabel geteUsuario() {
        return eUsuario;
    }

    public void seteUsuario(JLabel eUsuario) {
        this.eUsuario = eUsuario;
    }

    public JLabel geteContrasena() {
        return eContrasena;
    }

    public void seteContrasena(JLabel eContrasena) {
        this.eContrasena = eContrasena;
    }

    public JTextField getCampoUsuario() {
        return campoUsuario;
    }

    public void setCampoUsuario(JTextField campoUsuario) {
        this.campoUsuario = campoUsuario;
    }

    public JTextField getCampoContrasena() {
        return campoContrasena;
    }

    public void setCampoContrasena(JTextField campoContrasena) {
        this.campoContrasena = campoContrasena;
    }
    
    
}
