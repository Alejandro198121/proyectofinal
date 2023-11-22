/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class VentanaInicioSesion extends JFrame {

	private PanelInicioSesion panelSesion;

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

	public void inicializarComponentes() {

		panelSesion = new PanelInicioSesion();
		add(panelSesion);

	}

	public PanelInicioSesion getpanelSesion() {
		return panelSesion;
	}

	public void setpanelSesion(PanelInicioSesion panelSesion) {
		this.panelSesion = panelSesion;
	}

	public PanelInicioSesion getPanelSesion() {
		return panelSesion;
	}

	public void setPanelSesion(PanelInicioSesion panelSesion) {
		this.panelSesion = panelSesion;
	}

}