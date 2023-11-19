package co.edu.udistrital.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import view.Ventana;


public class Controller implements ActionListener {

	private Ventana vista;

	public Controller() {
		vista = new Ventana();
		asignarOyentes();
	}

	public void asignarOyentes() {
		vista.getPanel().getBotonEmail().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		if (comando.equals("EMAIL")) {
			System.out.println("email");
		}
		// --------------------------------------------------------------------------
	}
}
