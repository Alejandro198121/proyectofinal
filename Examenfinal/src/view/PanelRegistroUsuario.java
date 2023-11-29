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

/**
 * Clase que muestra el panel donde los usuarios se registran
 * 
 * @author Grupo JAN
 */
public class PanelRegistroUsuario extends JPanel {
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
	 * variable eGenero de tipo lista
	 */
	private JComboBox<String> eGenero;
/**
 * variable eCorreo de tipo etiqueta
 */
	private JLabel eCorreo;
	/**
	 * variable eNombre de tipo etiqueta
	 */
	private JLabel eNombre;
	
	/**
	 * variable campoNombre de tipo campo de texto
	 */
	private JTextField campoNombre;
	/**
	 * variable campoCorreo de tipo campo de texto
	 */
	private JTextField campoCorreo;
	/**
	 * variable campoUsuario de tipo campo de texto
	 */
	private JTextField campoUsuario;
	/**
	 * variable campoContraseña de tipo campo de texto
	 */
	private JTextField campoContrasena;
	/**
	 * variable botonRegistrarse de tipo boton
	 */
	private JButton botonRegistrarse;
	/**
	 * variable botonVolver de tipo boton
	 */
	private JButton botonVolver;
        private JLabel eCantidadParejas;
        private JTextField campoCaParejas;

	/**
	 * Constructor que define el fondo del panel
	 */
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

	/**
	 * Metodo que permite cambiar el fondo del panel
	 */
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (imagenFondo != null) {
			g.drawImage(imagenFondo, 0, 0, getWidth(), getHeight(), this);
		}
	}

	/**
	 * Metodo que inicia el panel del registro del usuario
	 */
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

                campoUsuario = new JTextField("usuario");
		campoUsuario.setBounds(250, 200, 200, 20);
		add(campoUsuario);
                
		eContrasena = new JLabel("Contrasena: ");
		eContrasena.setBounds(150, 250, 90, 10);
		add(eContrasena);

		campoContrasena = new JTextField("contrasena");
		campoContrasena.setBounds(250, 250, 200, 20);
		add(campoContrasena);
                
                eCantidadParejas = new JLabel("Cantidad de parejas: ");
                eCantidadParejas.setBounds(120, 300, 150, 20);
                add(eCantidadParejas);
                
                campoCaParejas = new JTextField();
                campoCaParejas.setBounds(250, 300, 200, 20);
                add(campoCaParejas);

		botonRegistrarse = new JButton("REGISTRARME");
		botonRegistrarse.setActionCommand("PANEL_REGISTRARME");
		botonRegistrarse.setBounds(250, 350, 150, 30);
		add(botonRegistrarse);
	}
/**
 * obtener imagen
 * @return imagen
 */
	public Image getImagenFondo() {
		return imagenFondo;
	}
/**
 * obtener lista genero
 * @return lista genero
 */
	public JComboBox<String> geteGenero() {
		return eGenero;
	}
/**
 * obtener eNombre
 * @return eNombre
 */
	public JLabel geteNombre() {
		return eNombre;
	}
/**
 * definir eNombre
 * @param eNombre eNombre a definir
 */
	public void seteNombre(JLabel eNombre) {
		this.eNombre = eNombre;
	}
/**
 * obtener campo nombre
 * @return campo nombre
 */
	public JTextField getCampoNombre() {
		return campoNombre;
	}
/**
 * definir campo nombre
 * @param campoNombre campo nombre a definir
 */
	public void setCampoNombre(JTextField campoNombre) {
		this.campoNombre = campoNombre;
	}
/**
 * definir lista de genero
 * @param eGenero lista de genero a definir
 */
	public void seteGenero(JComboBox<String> eGenero) {
		this.eGenero = eGenero;
	}
/**
 * obtener correo
 * @return correo
 */
	public JLabel geteCorreo() {
		return eCorreo;
	}
/**
 * definir correo
 * @param eCorreo correo a definir
 */
	public void seteCorreo(JLabel eCorreo) {
		this.eCorreo = eCorreo;
	}
/**
 * obtener campo correo
 * @return campo correo
 */
	public JTextField getCampoCorreo() {
		return campoCorreo;
	}
/**
 * definir campo correo
 * @param campoCorreo campo correo a definir
 */
	public void setCampoCorreo(JTextField campoCorreo) {
		this.campoCorreo = campoCorreo;
	}
/**
 * definir imagen de fondo
 * @param imagenFondo imagen de fondo a definir
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
 * obtener campo contraseña
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
 * obtener boton registrarse
 * @return boton registrarse
 */
	public JButton getBotonRegistrarse() {
		return botonRegistrarse;
	}
/**
 * definir boton registrarse
 * @param botonRegistrarse boton registrarse a definir
 */
	public void setBotonRegistrarse(JButton botonRegistrarse) {
		this.botonRegistrarse = botonRegistrarse;
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

    public JLabel geteCantidadParejas() {
        return eCantidadParejas;
    }

    public void seteCantidadParejas(JLabel eCantidadParejas) {
        this.eCantidadParejas = eCantidadParejas;
    }

    public JTextField getCampoCaParejas() {
        return campoCaParejas;
    }

    public void setCampoCaParejas(JTextField campoCaParejas) {
        this.campoCaParejas = campoCaParejas;
    }

}