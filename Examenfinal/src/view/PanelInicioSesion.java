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

public class PanelInicioSesion extends JPanel {

	private Image imagenFondo;
	private JLabel eUsuario;
	private JLabel eContrasena;
	private JTextField campoUsuario;
	private JTextField campoContrasena;
	private JButton botonIniciarSesion;
	private JButton botonVolver;

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

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (imagenFondo != null) {
			g.drawImage(imagenFondo, 0, 0, getWidth(), getHeight(), this);
		}
	}

        public void mensajeErrorInicioSesion(){
            JOptionPane.showMessageDialog(null, "Usuario/Contraseña Incorrectos");
        }
        
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

	public Image getImagenFondo() {
		return imagenFondo;
	}

	public JButton getBotonVolver() {
		return botonVolver;
	}

	public void setBotonVolver(JButton botonVolver) {
		this.botonVolver = botonVolver;
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

	public JButton getBotonIniciarSesion() {
		return botonIniciarSesion;
	}

	public void setBotonIniciarSesion(JButton botonIniciarSesion) {
		this.botonIniciarSesion = botonIniciarSesion;
	}

}
