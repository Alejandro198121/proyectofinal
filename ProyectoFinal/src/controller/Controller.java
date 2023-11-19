package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.Menu_Principal;

public class Controller implements ActionListener {

	private Menu_Principal menuPrincipal;

	public Controller() {
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
		if (comando.equals("BOTON_SALIR")) {
			menuPrincipal.dispose();
		} else if (comando.equals("BOTON_OK")) {
			if (menuPrincipal.getPd().opcionesMenu.getItemAt(menuPrincipal.getPd().opcionesMenu
					.getSelectedIndex()) == "REGISTRO DE TIENDAS DE MERCADO (ALMACENES)") {
				System.out.println("1");
			} else {
				if (menuPrincipal.getPd().opcionesMenu
						.getItemAt(menuPrincipal.getPd().opcionesMenu.getSelectedIndex()) == "REGISTRO DE CLIENTES") {
					System.out.println("2");
				} else {
					if (menuPrincipal.getPd().opcionesMenu.getItemAt(
							menuPrincipal.getPd().opcionesMenu.getSelectedIndex()) == "REGISTRO DE PAREJAS") {
						System.out.println("3");
					} else {
						if (menuPrincipal.getPd().opcionesMenu.getItemAt(menuPrincipal.getPd().opcionesMenu
								.getSelectedIndex()) == "ASIGNACIÓN DE HORARIOS (DIA-HORA POR LUGAR)") {
							System.out.println("4");
						} else {
							if (menuPrincipal.getPd().opcionesMenu.getItemAt(menuPrincipal.getPd().opcionesMenu
									.getSelectedIndex()) == "ASIGNACIÓN DE CUPO DE TARJETA DE CRÉDITO") {
								System.out.println("5");
							} else {
								if (menuPrincipal.getPd().opcionesMenu.getItemAt(menuPrincipal.getPd().opcionesMenu
										.getSelectedIndex()) == "PAGOS CON TARJETA DE CRÉDITO") {
									System.out.println("6");
								} else {
									if (menuPrincipal.getPd().opcionesMenu.getItemAt(menuPrincipal.getPd().opcionesMenu
											.getSelectedIndex()) == "ABONO A TARJETA DE CRÉDITO (LIBERACIÓN DE CUPO)") {
										System.out.println("7");
									} else {
										if (menuPrincipal.getPd().opcionesMenu
												.getItemAt(menuPrincipal.getPd().opcionesMenu
														.getSelectedIndex()) == "REPORTES ANALÍTICOS") {
											System.out.println("8");
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
