package view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class VentanaRegistroUsuario extends JFrame {

	private PanelRegistroUsuario panelRegister;

	public VentanaRegistroUsuario() {
		setTitle("Registro");
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

		panelRegister = new PanelRegistroUsuario();
		add(panelRegister);
	}

	public PanelRegistroUsuario getPanelRegister() {
		return panelRegister;
	}

	public void setPanelRegister(PanelRegistroUsuario panelRegister) {
		this.panelRegister = panelRegister;
	}

}
