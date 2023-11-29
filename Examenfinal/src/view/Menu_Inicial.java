/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

/**
 * Clase que muestra el menu inicial del programa
 * 
 * @author Grupo JAN
 */
public class Menu_Inicial extends JFrame {
	/**
	 *  variable de tipo panel menu inicial
	 */
	private PanelMenuInicial pd;

	/**
	 * Constructor que define los parametros del menu inicial
	 */
	public Menu_Inicial() {
		setTitle("Menu Inicial");
		setSize(700, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBackground(Color.gray);
		setLayout(new BorderLayout(10, 10));
		inicializarComponentes();

		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	/**
	 * Metodo que inicia el menu inicial
	 */
	public void inicializarComponentes() {

		pd = new PanelMenuInicial();
		add(pd);
	}
/**
 * obtener pd
 * @return pd
 */
	public PanelMenuInicial getPd() {
		return pd;
	}
/**
 * definir pd
 * @param pd pd a definir
 */
	public void setPd(PanelMenuInicial pd) {
		this.pd = pd;
	}

}