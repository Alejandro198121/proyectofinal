package view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class Menu_Inicial extends JFrame {
//cambie el nombre de paneldatos a PanelMenuInicial
	private PanelMenuInicial pd;

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

	public void inicializarComponentes() {

		pd = new PanelMenuInicial();
		add(pd);
	}

	public PanelMenuInicial getPd() {
		return pd;
	}

	public void setPd(PanelMenuInicial pd) {
		this.pd = pd;
	}
	
	
}