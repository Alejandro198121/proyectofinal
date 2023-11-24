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
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelRegistroUsuario extends JPanel {

	private Image imagenFondo;
	private JLabel eUsuario;
	private JLabel eContrasena;
	private JComboBox<String> eGenero;
	private JLabel eCorreo;
	private JLabel eNombre;

	private JTextField campoNombre;
	private JTextField campoCorreo;
	private JTextField campoUsuario;
	private JTextField campoContrasena;
	private JButton botonRegistrarse;
	private JButton botonVolver;

	public PanelRegistroUsuario() {
		setLayout(null);
		try {
			URL urlImagen = new URL(
					"https://img.freepik.com/foto-gratis/fondo-acuarela-pintada-mano-forma-cielo-nubes_24972-1095.jpg");
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

		botonVolver = new JButton("Volver");
		botonVolver.setActionCommand("VOLVER_INICIO_REGISTRO");
		botonVolver.setBounds(40, 400, 100, 30);
		add(botonVolver);

		eNombre = new JLabel("Nombre: ");
		eNombre.setBounds(170, 30, 100, 20);
		add(eNombre);

		campoNombre = new JTextField();
		campoNombre.setBounds(250, 30, 200, 20);
		add(campoNombre);

		eGenero = new JComboBox<String>();
		eGenero.addItem("Hombre");
		eGenero.addItem("Mujer");
		eGenero.setBounds(250, 70, 200, 30);
		add(eGenero);

		eCorreo = new JLabel("Correo: ");
		eCorreo.setBounds(170, 100, 100, 100);
		add(eCorreo);

		campoCorreo = new JTextField("correo");
		campoCorreo.setBounds(250, 140, 200, 20);
		add(campoCorreo);

		eUsuario = new JLabel("Usuario: ");
		eUsuario.setBounds(170, 200, 60, 10);
		add(eUsuario);

		eContrasena = new JLabel("Contrasena: ");
		eContrasena.setBounds(150, 250, 90, 10);
		add(eContrasena);

		campoUsuario = new JTextField("usuario");
		campoUsuario.setBounds(250, 200, 200, 20);
		add(campoUsuario);

		campoContrasena = new JTextField("contrasena");
		campoContrasena.setBounds(250, 250, 200, 20);
		add(campoContrasena);

		botonRegistrarse = new JButton("REGISTRARME");
		botonRegistrarse.setActionCommand("PANEL_REGISTRARME");
		botonRegistrarse.setBounds(250, 350, 150, 30);
		add(botonRegistrarse);
	}

	public Image getImagenFondo() {
		return imagenFondo;
	}

	public JComboBox<String> geteGenero() {
		return eGenero;
	}

	public JLabel geteNombre() {
		return eNombre;
	}

	public void seteNombre(JLabel eNombre) {
		this.eNombre = eNombre;
	}

	public JTextField getCampoNombre() {
		return campoNombre;
	}

	public void setCampoNombre(JTextField campoNombre) {
		this.campoNombre = campoNombre;
	}

	public void seteGenero(JComboBox<String> eGenero) {
		this.eGenero = eGenero;
	}

	public JLabel geteCorreo() {
		return eCorreo;
	}

	public void seteCorreo(JLabel eCorreo) {
		this.eCorreo = eCorreo;
	}

	public JTextField getCampoCorreo() {
		return campoCorreo;
	}

	public void setCampoCorreo(JTextField campoCorreo) {
		this.campoCorreo = campoCorreo;
	}

	public void setImagenFondo(Image imagenFondo) {
		this.imagenFondo = imagenFondo;
	}

	public JLabel geteUsuario() {
		return eUsuario;
	}

	public void seteUsuario(JLabel eUsuario) {
		this.eUsuario = eUsuario;
	}

	public JLabel geteContrasena() {
		return eContrasena;
	}

	public void seteContrasena(JLabel eContrasena) {
		this.eContrasena = eContrasena;
	}

	public JTextField getCampoUsuario() {
		return campoUsuario;
	}

	public void setCampoUsuario(JTextField campoUsuario) {
		this.campoUsuario = campoUsuario;
	}

	public JTextField getCampoContrasena() {
		return campoContrasena;
	}

	public void setCampoContrasena(JTextField campoContrasena) {
		this.campoContrasena = campoContrasena;
	}

	public JButton getBotonRegistrarse() {
		return botonRegistrarse;
	}

	public void setBotonRegistrarse(JButton botonRegistrarse) {
		this.botonRegistrarse = botonRegistrarse;
	}

	public JButton getBotonVolver() {
		return botonVolver;
	}

	public void setBotonVolver(JButton botonVolver) {
		this.botonVolver = botonVolver;
	}

}