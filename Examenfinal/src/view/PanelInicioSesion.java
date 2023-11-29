/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Clase que contiene el panel de inicio de sesion
 * 
 * @author Grupo JAN
 */
public class PanelInicioSesion extends JPanel {
/**
 * variable imagenFondo de tipo imagen
 */
	private Image imagenFondo;
	/**
	 * variable eUsuario de tipo etiqueta
	 */
	private JLabel eUsuario;
	/**
	 * variable eContraseña de tipo etiqueta
	 */
	private JLabel eContrasena;
	/**
	 * variable campoUsuario de tipo campo de texto
	 */
	private JTextField campoUsuario;
	/**
	 * cariable campoContraseña de tipo campo de texto
	 */
	private JTextField campoContrasena;
	/**
	 * variable botonIniciarSesion de tipo boton
	 */
	private JButton botonIniciarSesion;
	/**
	 * variable botonVolver de tipo boton
	 */
	private JButton botonVolver;

	/**
	 * Constructor que contiene los parametros del panel de inicio de sesion
	 */
	public PanelInicioSesion() {
		setLayout(null);
		try {
			URL urlImagen = new URL(
					"https://img.freepik.com/vector-gratis/fondo-blanco-gris-brillante-lineas-onduladas_1017-25101.jpg");
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
	 * Metodo para mostrar un mensaje de error al iniciar sesion
	 */
	public void mensajeErrorInicioSesion() {
		JOptionPane.showMessageDialog(null, "Usuario/Contraseña Incorrectos");
	}

	/**
	 * Metodo que inicia el panel de inicio de sesion
	 */
	public void inicializarComponentes() {
		eUsuario = new JLabel("Usuario: ");
		eUsuario.setBounds(170, 150, 60, 10);
		add(eUsuario);

		eContrasena = new JLabel("Contraseña: ");
		eContrasena.setBounds(150, 250, 90, 10);
		add(eContrasena);

		campoUsuario = new JTextField("usuario");
		campoUsuario.setBounds(250, 150, 200, 20);
		add(campoUsuario);

		campoContrasena = new JTextField();
		campoContrasena.setBounds(250, 250, 200, 20);
		add(campoContrasena);

		botonIniciarSesion = new JButton("INICIAR SESION");
		botonIniciarSesion.setActionCommand("PANEL_INICIAR_SESION");
		botonIniciarSesion.setBounds(250, 350, 150, 30);
		add(botonIniciarSesion);

		botonVolver = new JButton("Volver");
		botonVolver.setActionCommand("VOLVER_INICIO_SESION");
		botonVolver.setBounds(40, 400, 100, 30);
		add(botonVolver);
	}
/**
 * obtener imagen
 * @return imagen
 */
	public Image getImagenFondo() {
		return imagenFondo;
	}
/**
 * obtener boton volver
 * @return boton volver
 */
	public JButton getBotonVolver() {
		return botonVolver;
	}
/**
 * definir boton volver
 * @param botonVolver boton volver a definir
 */
	public void setBotonVolver(JButton botonVolver) {
		this.botonVolver = botonVolver;
	}
/**
 * definir imagen
 * @param imagenFondo imagen a definir
 */
	public void setImagenFondo(Image imagenFondo) {
		this.imagenFondo = imagenFondo;
	}
/**
 * obtener eUsuario
 * @return eUsuario
 */
	public JLabel geteUsuario() {
		return eUsuario;
	}
/**
 * definir eUsuario
 * @param eUsuario eUsuario a definir
 */
	public void seteUsuario(JLabel eUsuario) {
		this.eUsuario = eUsuario;
	}
/**
 * obtener eContraseña
 * @return eContraseña
 */
	public JLabel geteContrasena() {
		return eContrasena;
	}
/**
 * definir eContraseña
 * @param eContrasena eContraseña a definir
 */
	public void seteContrasena(JLabel eContrasena) {
		this.eContrasena = eContrasena;
	}
/**
 * obtener campo usuario
 * @return campo usuario
 */
	public JTextField getCampoUsuario() {
		return campoUsuario;
	}
/**
 * definir campo usuario
 * @param campoUsuario campo usuario a definir
 */
	public void setCampoUsuario(JTextField campoUsuario) {
		this.campoUsuario = campoUsuario;
	}
/**
 * obtener campo contrtaseña
 * @return campo contraseña
 */
	public JTextField getCampoContrasena() {
		return campoContrasena;
	}
/**
 * definir campo contraseña
 * @param campoContrasena campo contraseña a definir
 */
	public void setCampoContrasena(JTextField campoContrasena) {
		this.campoContrasena = campoContrasena;
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

}