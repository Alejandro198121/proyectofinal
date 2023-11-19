package view;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;

public class Ventana extends JFrame {

	private Panel panel;
	
	public Ventana() {
		setTitle("Prueba E-mail");
		setSize(800, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.ORANGE);
		getContentPane().setLayout(new BorderLayout(10, 10));

		inicializarComponentes();

		setResizable(true);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public void inicializarComponentes() {
		panel = new Panel();
		getContentPane().add(panel);
	}

	public Panel getPanel() {
		return panel;
	}

	public void setPanel(Panel panel) {
		this.panel = panel;
	}
	
}