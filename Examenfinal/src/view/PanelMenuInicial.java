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

/**
 * Clase que muestra el panel del menu inicial
 * 
 * @author Grupo JAN
 */
public class PanelMenuInicial extends JPanel {
/**
 * variable imagenFondo de tipo imagen
 */
	private Image imagenFondo;
	/**
	 * variable panelContenedor de tipo panel
	 */
	private JPanel panelContenedor;
	/**
	 * variable textoMenu de tipo etiqueta
	 */
	private JLabel textoMenu;
	/**
	 * variable botonIniciarSesion de tipo boton
	 */
	private JButton botonIniciarSesion;
	/**
	 * variable botonRegistrar de tipo boton
	 */
	private JButton botonRegistrar;
	/**
	 * variable eblank de tipo etiqueta
	 */
	private JLabel eblank;

	/**
	 * Constructor que define los parametros del menu inicial
	 */
	public PanelMenuInicial() {
		setLayout(null);
		try {
			URL urlImagen = new URL(
					"https://img.freepik.com/fotos-premium/resumen-3d-render-diseno-grafico-fondo-geometrico-moderno_553544-3220.jpg");
			imagenFondo = ImageIO.read(urlImagen);
		} catch (IOException e) {
			e.printStackTrace();
		}

		inicializarComponentes();

		setVisible(true);
	}

	/**
	 * Metodo para poner una imagen de fondo
	 */
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (imagenFondo != null) {
			g.drawImage(imagenFondo, 0, 0, getWidth(), getHeight(), this);
		}
	}

	/**
	 * Metodo que inicia el panel del menu inicial
	 */
	public void inicializarComponentes() {
		panelContenedor = new JPanel();
		panelContenedor.setBounds(175, 115, 350, 250);
		panelContenedor.setLayout(new FlowLayout());
		add(panelContenedor);

		textoMenu = new JLabel("Escoja una opción");
		textoMenu.setHorizontalAlignment(SwingConstants.CENTER);
		panelContenedor.add(textoMenu);

		eblank = new JLabel("");
		eblank.setPreferredSize(new Dimension(250, 50));
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
/**
 * obtener boton iniciar sesion
 * @return boton iniciar sesion
 */
	public JButton getBotonIniciarSesion() {
		return botonIniciarSesion;
	}
/**
 * definir boton iniciar sesion
 * @param botonIniciarSesion boton iniciar sesion a definir
 */
	public void setBotonIniciarSesion(JButton botonIniciarSesion) {
		this.botonIniciarSesion = botonIniciarSesion;
	}
/**
 * obtener boton registrar
 * @return boton registrar
 */
	public JButton getBotonRegistrar() {
		return botonRegistrar;
	}
/**
 * definir boton registrar
 * @param botonRegistrar boton registrar a definir
 */
	public void setBotonRegistrar(JButton botonRegistrar) {
		this.botonRegistrar = botonRegistrar;
	}
/**
 * obtener imagen de fondo
 * @return imagen de fondo
 */
	public Image getImagenFondo() {
		return imagenFondo;
	}
/**
 * definir imagen de fondo
 * @param imagenFondo imagen de fondo a definir
 */
	public void setImagenFondo(Image imagenFondo) {
		this.imagenFondo = imagenFondo;
	}
/**
 * obtener panel contenedor
 * @return panel contenedor
 */
	public JPanel getPanelContenedor() {
		return panelContenedor;
	}
/**
 * definir panel contenedor
 * @param panelContenedor panel contenedor a definir
 */
	public void setPanelContenedor(JPanel panelContenedor) {
		this.panelContenedor = panelContenedor;
	}
/**
 * obtener texto menu
 * @return texto menu
 */
	public JLabel getTextoMenu() {
		return textoMenu;
	}
/**
 * definir texto menu
 * @param textoMenu texto menu a definir
 */
	public void setTextoMenu(JLabel textoMenu) {
		this.textoMenu = textoMenu;
	}
/**
 * obtener boton iniciar sesion
 * @return boton iniciar sesion
 */
	public JButton getbotonIniciarSesion() {
		return botonIniciarSesion;
	}
/**
 * definir boton iniciar sesion
 * @param botonIniciarSesion boton iniciar sesion a definir
 */
	public void setbotonIniciarSesion(JButton botonIniciarSesion) {
		this.botonIniciarSesion = botonIniciarSesion;
	}
/**
 * obtener boton registrar
 * @return boton registrar
 */
	public JButton getbotonRegistrar() {
		return botonRegistrar;
	}
/**
 * definir boton registrar
 * @param botonRegistrar boton registrar a definir
 */
	public void setbotonRegistrar(JButton botonRegistrar) {
		this.botonRegistrar = botonRegistrar;
	}
/**
 * obtener eblank
 * @return eblank
 */
	public JLabel getEblank() {
		return eblank;
	}
/**
 * definir eblank
 * @param eblank eblank a definir
 */
	public void setEblank(JLabel eblank) {
		this.eblank = eblank;
	}

}