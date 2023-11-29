/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

/**
 * clase que contiene el panel de registro de usuario
 * @author Grupo JAN
 */
public class VentanaRegistroUsuario extends JFrame {
	/**
	 * variable panelRegister de tipo PanelRegistroUsuario
	 */
	private PanelRegistroUsuario panelRegister;

	/**
	 * Constructor con los parametros de la ventana de registro de usuario
	 */
	public VentanaRegistroUsuario() {
		setTitle("Registro");
		setSize(700, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout(10, 10));
		inicializarComponentes();

		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(false);
	}

	/**
	 * Metodo que inicia la ventana de registro de usuario
	 */
	public void inicializarComponentes() {

		panelRegister = new PanelRegistroUsuario();
		add(panelRegister);
	}
/**
 * obtener panel registro
 * @return panel registro
 */
	public PanelRegistroUsuario getPanelRegister() {
		return panelRegister;
	}
/**
 * definir panel registro
 * @param panelRegister panel registro a definir
 */
	public void setPanelRegister(PanelRegistroUsuario panelRegister) {
		this.panelRegister = panelRegister;
	}

}