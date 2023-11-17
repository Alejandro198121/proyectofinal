package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.Menu_Principal;

public class Controller implements ActionListener{

	private Menu_Principal menuPrincipal;
	
	public Controller(){
		menuPrincipal = new Menu_Principal();
		asignarOyentes();
	}
	
	public void asignarOyentes() {
		menuPrincipal.getPd().getBotonSalir().addActionListener(this);
		menuPrincipal.getPd().getBotonOk().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String comando = e.getActionCommand();
		if(comando.equals("BOTON_SALIR")) {
			menuPrincipal.dispose();
		}else if(comando.equals("BOTON_OK")) {
			System.out.println("ok");
		}
	}
	
}
