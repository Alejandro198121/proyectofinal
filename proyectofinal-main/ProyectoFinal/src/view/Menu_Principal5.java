package view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class Menu_Principal5 extends JFrame {

	private PanelDatos pd;

	public Menu_Principal5() {
		setTitle("Menu Principal");
		setSize(700, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBackground(Color.gray);
		setLayout(new BorderLayout(10, 10));
		setUndecorated(true);
		inicializarComponentes();

		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public void inicializarComponentes() {

		pd = new PanelDatos();
		add(pd);
	}

	public PanelDatos getPd() {
		return pd;
	}

	public void setPd(PanelDatos pd) {
		this.pd = pd;
	}
	
	
}
