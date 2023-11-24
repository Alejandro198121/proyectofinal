/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

public class PanelMenuInicial extends JPanel {

	private Image imagenFondo;
	private JPanel panelContenedor;
	private JLabel textoMenu;
	private JButton botonIniciarSesion;
	private JButton botonRegistrar;
	private JLabel eblank;

	public PanelMenuInicial() {
		setLayout(null);
		try {
			URL urlImagen = new URL("https://img.freepik.com/fotos-premium/resumen-3d-render-diseno-grafico-fondo-geometrico-moderno_553544-3220.jpg");
			imagenFondo = ImageIO.read(urlImagen);
		} catch (IOException e) {
			e.printStackTrace();
		}

		inicializarComponentes();

		setVisible(true);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (imagenFondo != null) {
			g.drawImage(imagenFondo, 0, 0, getWidth(), getHeight(), this);
		}
	}

	public void inicializarComponentes() {
		panelContenedor = new JPanel();
		panelContenedor.setBounds(175, 115, 350, 250);
		panelContenedor.setLayout(new FlowLayout());
		add(panelContenedor);

		textoMenu = new JLabel("Escoja una opción");
		textoMenu.setHorizontalAlignment(SwingConstants.CENTER);
		panelContenedor.add(textoMenu);

		eblank = new JLabel("");
		eblank.setPreferredSize(new Dimension(250,50));
		panelContenedor.add(eblank);
		
		botonIniciarSesion = new JButton("Iniciar sesion");
		botonIniciarSesion.setBounds(40, 390, 200, 40);
		botonIniciarSesion.setActionCommand("INICIAR_SESION");
		panelContenedor.add(botonIniciarSesion);

		eblank = new JLabel("");
		eblank.setPreferredSize(new Dimension(350, 40));
		panelContenedor.add(eblank);

		botonRegistrar = new JButton("Registrarse");
		botonRegistrar.setActionCommand("REGISTRARSE");
		panelContenedor.add(botonRegistrar);
	}

	public JButton getBotonIniciarSesion() {
		return botonIniciarSesion;
	}

	public void setBotonIniciarSesion(JButton botonIniciarSesion) {
		this.botonIniciarSesion = botonIniciarSesion;
	}

	public JButton getBotonRegistrar() {
		return botonRegistrar;
	}

	public void setBotonRegistrar(JButton botonRegistrar) {
		this.botonRegistrar = botonRegistrar;
	}

	public Image getImagenFondo() {
		return imagenFondo;
	}

	public void setImagenFondo(Image imagenFondo) {
		this.imagenFondo = imagenFondo;
	}

	public JPanel getPanelContenedor() {
		return panelContenedor;
	}

	public void setPanelContenedor(JPanel panelContenedor) {
		this.panelContenedor = panelContenedor;
	}

	public JLabel getTextoMenu() {
		return textoMenu;
	}

	public void setTextoMenu(JLabel textoMenu) {
		this.textoMenu = textoMenu;
	}

	public JButton getbotonIniciarSesion() {
		return botonIniciarSesion;
	}

	public void setbotonIniciarSesion(JButton botonIniciarSesion) {
		this.botonIniciarSesion = botonIniciarSesion;
	}

	public JButton getbotonRegistrar() {
		return botonRegistrar;
	}

	public void setbotonRegistrar(JButton botonRegistrar) {
		this.botonRegistrar = botonRegistrar;
	}

	public JLabel getEblank() {
		return eblank;
	}

	public void setEblank(JLabel eblank) {
		this.eblank = eblank;
	}
	
}
