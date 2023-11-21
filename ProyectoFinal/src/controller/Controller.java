package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.Menu_Inicial;
import view.VentanaInicioSesion;
import view.VentanaRegistroUsuario;

public class Controller implements ActionListener {

	private Menu_Inicial menuPrincipal;
	private VentanaInicioSesion ventanaLogin;
	private VentanaRegistroUsuario ventanaRegister;

	public Controller() {
		menuPrincipal = new Menu_Inicial();
		ventanaLogin = new VentanaInicioSesion();
		ventanaRegister = new VentanaRegistroUsuario();
		asignarOyentes();
	}

	public void asignarOyentes() {

		menuPrincipal.getPd().getBotonIniciarSesion().addActionListener(this);
		menuPrincipal.getPd().getBotonRegistrar().addActionListener(this);
		ventanaLogin.getpanelSesion().getBotonIniciarSesion().addActionListener(this);
		ventanaRegister.getPanelRegister().getBotonIniciarSesion().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String comando = e.getActionCommand();
		if (comando.equals("INICIAR_SESION")) {
			menuPrincipal.setVisible(false);
			ventanaLogin.setVisible(true);
			ventanaLogin.getpanelSesion().setVisible(true);
		} else if (comando.equals("REGISTRARSE")) {
			menuPrincipal.setVisible(false);
			ventanaRegister.setVisible(true);
			ventanaRegister.getPanelRegister().setVisible(true);
		}else if(comando.equals("PANEL_INICIAR_SESION")){
			System.out.println("verificador del action listener del panel iniciar sesion");
		}else if(comando.equals("PANEL_REGISTRARME")) {
			System.out.println("verificador panel registrarme");
		}
	}
}
