package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.Menu_Inicial;

public class Controller implements ActionListener {

	private Menu_Inicial menuPrincipal;

	public Controller() {
		menuPrincipal = new Menu_Inicial();
		asignarOyentes();
	}

	public void asignarOyentes() {

		menuPrincipal.getPd().getBotonIniciarSesion().addActionListener(this);
		menuPrincipal.getPd().getBotonRegistrar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String comando = e.getActionCommand();
		if(comando.equals("INICIAR_SESION")) {
			System.out.println("1");
		}else if(comando.equals("REGISTRARSE")) {
			System.out.println("2");
		}
	}
}
