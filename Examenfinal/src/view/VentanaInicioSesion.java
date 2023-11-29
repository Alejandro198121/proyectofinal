/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

/**
 * 
 * @author Grupo JAN
 */
public class VentanaInicioSesion extends JFrame {
/**
 * variable panelSesion de tipo PanelInicioSesion
 */
	private PanelInicioSesion panelSesion;

	/**
	 * Constructor que contiene la ventana de los parametros de inicio de sesion
	 */
	public VentanaInicioSesion() {
		setTitle("Inicio de Sesion");
		setSize(700, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBackground(Color.gray);
		setLayout(new BorderLayout(10, 10));
		inicializarComponentes();

		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(false);
	}

	/**
	 * Metodo para iniciar la ventana de inicio de sesion
	 */
	public void inicializarComponentes() {

		panelSesion = new PanelInicioSesion();
		add(panelSesion);

	}
/**
 * obtener panel sesion
 * @return panel sesion
 */
	public PanelInicioSesion getpanelSesion() {
		return panelSesion;
	}
/**
 * definir panel sesion
 * @param panelSesion panel sesion a definir
 */
	public void setpanelSesion(PanelInicioSesion panelSesion) {
		this.panelSesion = panelSesion;
	}
/**
 * obtener panel sesion
 * @return panel sesion
 */
	public PanelInicioSesion getPanelSesion() {
		return panelSesion;
	}
/**
 * definir panel sesion
 * @param panelSesion panel sesion a definir
 */
	public void setPanelSesion(PanelInicioSesion panelSesion) {
		this.panelSesion = panelSesion;
	}

}