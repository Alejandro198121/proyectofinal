package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class Panel extends JPanel{
	
	private JButton BotonEmail;
	
	public Panel() {
		setLayout(new GridLayout(7, 2));
		setBackground(new Color(142, 214, 211));
		setBorder(new TitledBorder("Modulo 1 "));
		setPreferredSize(new Dimension(90, 80));

		inicializarComponentes();

		setVisible(true);
	}

	public void inicializarComponentes(){
		
		BotonEmail = new JButton("email");
		BotonEmail.setActionCommand("EMAIL");
		add(BotonEmail);
	}

	public JButton getBotonEmail() {
		return BotonEmail;
	}

	public void setBotonEmail(JButton botonEmail) {
		BotonEmail = botonEmail;
	}
	
}
