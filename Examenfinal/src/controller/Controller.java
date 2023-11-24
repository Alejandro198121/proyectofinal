/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import modelo.Banco;

import modelo.Cliente;
import modelo.Persona;
import view.MenuAdmin;
import view.MenuCliente;
import view.Menu_Inicial;
import view.VentanaInicioSesion;
import view.VentanaRegistroUsuario;

public class Controller implements ActionListener {

    private Menu_Inicial menuPrincipal;
    private VentanaInicioSesion ventanaLogin;
    private VentanaRegistroUsuario ventanaRegister;
    private ArrayList<Cliente> directorioClientes;
    private Cliente cliente;
    private Banco banco;
    private ControladorEmail contCorreo;
    private Persona admin;
    private MenuAdmin menuadmin;
    private MenuCliente menuCliente;

    public Controller() {
        menuPrincipal = new Menu_Inicial();
        ventanaLogin = new VentanaInicioSesion();
        ventanaRegister = new VentanaRegistroUsuario();
        contCorreo = new ControladorEmail();
        admin = new Persona("Carlo Collodi", "Hombre", "pinocho", "1234");
        menuadmin = new MenuAdmin();
        menuCliente = new MenuCliente();
        asignarOyentes();
    }

    public void asignarOyentes() {

        menuPrincipal.getPd().getBotonIniciarSesion().addActionListener(this);
        menuPrincipal.getPd().getBotonRegistrar().addActionListener(this);
        ventanaLogin.getpanelSesion().getBotonIniciarSesion().addActionListener(this);
        ventanaLogin.getpanelSesion().getBotonVolver().addActionListener(this);
        ventanaRegister.getPanelRegister().getBotonRegistrarse().addActionListener(this);
        ventanaRegister.getPanelRegister().getBotonVolver().addActionListener(this);
        menuadmin.getBotonOk().addActionListener(this);
        menuCliente.getBotonOk().addActionListener(this);
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
        } else if (comando.equals("PANEL_INICIAR_SESION")) {
            if (ventanaLogin.getPanelSesion().getCampoUsuario().getText().equalsIgnoreCase("pinocho") && ventanaLogin.getPanelSesion().getCampoContrasena().getText().equalsIgnoreCase("1234")) {
                System.out.println("Funciona admin");
                ventanaLogin.setVisible(false);
                menuadmin.setVisible(true);
            } else {
                ventanaLogin.getPanelSesion().mensajeErrorInicioSesion();
            }
        } else if (comando.equals("PANEL_REGISTRARME")) {
            System.out.println("verificador panel registrarme");
            banco = new Banco();
            cliente = new Cliente(ventanaRegister.getPanelRegister().getCampoCorreo().getText(),
                    banco.asignarCupo() + "", ventanaRegister.getPanelRegister().getCampoNombre().getText(),
                    ventanaRegister.getPanelRegister().geteGenero().getSelectedItem() + " ",
                    ventanaRegister.getPanelRegister().getCampoUsuario().getText(),
                    ventanaRegister.getPanelRegister().getCampoContrasena().getText());
            System.out.println(cliente.toString());

            contCorreo.enviarEmail(ventanaRegister.getPanelRegister().getCampoCorreo().getText());
        } else if (comando.equals("VOLVER_INICIO_SESION")) {
            ventanaLogin.setVisible(false);
            menuPrincipal.setVisible(true);
        } else if (comando.equals("VOLVER_INICIO_REGISTRO")) {
            ventanaRegister.setVisible(false);
            menuPrincipal.setVisible(true);
        } else if (comando.equals("OK_BOTON_ADMIN")) {
            if (menuadmin.getOpciones().getSelectedItem().equals("REGISTRO DE TIENDAS DE MERCADO (ALMACENES)")) {
                System.out.println("1");
            } else if (menuadmin.getOpciones().getSelectedItem().equals("REGISTRO DE CLIENTES")) {
                System.out.println("2");
            } else if (menuadmin.getOpciones().getSelectedItem().equals("ABONO A TARJETA DE CRÉDITO (LIBERACIÓN DE CUPO)")) {
                System.out.println("3");
            } else if (menuadmin.getOpciones().getSelectedItem().equals("REPORTES ANALÍTICOS")) {
                System.out.println("4");
            }
        }else if(comando.equals("OK_BOTON_CLIENTE")) {
            if (menuCliente.getOpciones().getSelectedItem().equals("REGISTRO DE PAREJAS")) {
                System.out.println("1");
            } else if (menuCliente.getOpciones().getSelectedItem().equals("ASIGNACIÓN DE HORARIOS (DIA-HORA POR LUGAR)")) {
                System.out.println("2");
            } else if (menuCliente.getOpciones().getSelectedItem().equals("ASIGNACIÓN DE CUPO DE TARJETA DE CRÉDITO")) {
                System.out.println("3");
            } else if (menuCliente.getOpciones().getSelectedItem().equals("PAGOS CON TARJETA DE CRÉDITO")) {
                System.out.println("4");
            }
        }
    }
}
