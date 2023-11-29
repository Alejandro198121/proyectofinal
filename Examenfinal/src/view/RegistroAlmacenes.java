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
 * Ventana que muestra los almacenes existentes
 * 
 * @author Grupo JAN
 */
public class RegistroAlmacenes extends JFrame {
/**
 * variable panelAlmacenes de tipo panel
 */
	private JPanel panelAlmacenes;
	/**
	 * variable etiquetaSimple de tipo etiqueta
	 */
	private JLabel etiquetaSimple;
	/**
	 * variable esimple2 de tipo etiqueta
	 */
	private JLabel eSimple2;
	/**
	 * variable botonOk de tipo boton
	 */
	private JButton botonOk;
	/**
	 * variable botonSalir de tipo boton
	 */
	private JButton botonSalir;
	/**
	 * variable lista_Lugares de tipo lista
	 */
	private JComboBox<String> lista_Lugares;

	/**
	 * Constructor que define los parametros de la ventana del registro de almacenes
	 */
	public RegistroAlmacenes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(450, 500);
		setTitle("Registro Almacenes");

		inicializarComponentes();

		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(false);
	}

	/**
	 * Metodo que inicia la ventana del registro de almacenes
	 */
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

	/**
	 * Metodo que notifica que un almacen ha sido registrado correctamente
	 * 
	 * @param lugar lugar donde el almacen fue registrado
	 */
	public void mensajeConfirmacion(String lugar) {
		JOptionPane.showMessageDialog(null, "Su Almacen Ha sido Registrado en " + lugar);
	}

	/**
	 * Metodo que notifica que el lugar ya tiene un almacen registrado
	 */
	public void mensajeYaHayAlmacen() {
		JOptionPane.showMessageDialog(null, "Ya hay un almacen registrado en este lugar");
	}
/**
 * obtener panel almacenes 
 * @return panel almacenes
 */
	public JPanel getpanelAlmacenes() {
		return panelAlmacenes;
	}
/**
 * definir panel almacenes
 * @param panelAlmacenes panel almacenes a definir
 */
	public void setpanelAlmacenes(JPanel panelAlmacenes) {
		this.panelAlmacenes = panelAlmacenes;
	}
/**
 * obtener etiqueta simple 1
 * @return etiqueta simple 1
 */
	public JLabel getetiquetaSimple() {
		return etiquetaSimple;
	}
/**
 * definir etiqueta simple 1
 * @param etiquetaSimple etiqueta simple 1 a definir
 */
	public void setetiquetaSimple(JLabel etiquetaSimple) {
		this.etiquetaSimple = etiquetaSimple;
	}
/**
 * obtener boton ok
 * @return boton ok
 */
	public JButton getBotonOk() {
		return botonOk;
	}
/**
 * definir boton ok
 * @param botonOk boton ok a definir
 */
	public void setBotonOk(JButton botonOk) {
		this.botonOk = botonOk;
	}
/**
 * obtener etiqueta simple 2
 * @return etiqueta simple 2
 */
	public JLabel geteSimple2() {
		return eSimple2;
	}
/**
 * definir etiqueta simple 2
 * @param eSimple2 etiqueta simple 2 a definir
 */
	public void seteSimple2(JLabel eSimple2) {
		this.eSimple2 = eSimple2;
	}
/**
 * obtener boton salir
 * @return boton salir
 */
	public JButton getBotonSalir() {
		return botonSalir;
	}
/**
 * definir boton salir 
 * @param botonSalir boton salir a definir
 */
	public void setBotonSalir(JButton botonSalir) {
		this.botonSalir = botonSalir;
	}
/**
 * obtener lista lugares
 * @return lista lugares
 */
	public JComboBox<String> getLista_Lugares() {
		return lista_Lugares;
	}
/**
 * definir lista lugares
 * @param lista_Lugares lista lugares a definir
 */
	public void setLista_Lugares(JComboBox<String> lista_Lugares) {
		this.lista_Lugares = lista_Lugares;
	}

}