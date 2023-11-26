/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import modelo.Almacen;
import modelo.Banco;

import modelo.Cliente;
import modelo.Persona;
import view.Mensajero;
import view.MenuAdmin;
import view.MenuCliente;
import view.Menu_Inicial;
import view.PanelRegistroUsuario;
import view.RegistroAlmacenes;
import view.RegistroParejas;
import view.VentanaInicioSesion;
import view.VentanaRegistroUsuario;

public class Controller implements ActionListener {

    private Menu_Inicial menuPrincipal;
    private VentanaInicioSesion ventanaLogin;
    private VentanaRegistroUsuario ventanaRegister;
    private Cliente cliente;
    private Banco banco;
    private ControladorEmail contCorreo;
    private Persona admin;
    private MenuAdmin menuadmin;
    private MenuCliente menuCliente;
    private PanelRegistroUsuario panelregistrousuario;
    private RegistroAlmacenes panelAlmacenes;
    private Mensajero mensajero;
    private RegistroParejas ventanaRegistroParejas;

    private ArrayList<Cliente> directorioClientes;
    private ArrayList<Almacen> directorioAlmacenes;

    public Controller() {
        menuPrincipal = new Menu_Inicial();
        ventanaLogin = new VentanaInicioSesion();
        ventanaRegister = new VentanaRegistroUsuario();
        contCorreo = new ControladorEmail();
        admin = new Persona("Carlo Collodi", "Hombre", "pinocho", "1234");
        menuadmin = new MenuAdmin();
        menuCliente = new MenuCliente();
        directorioClientes = new ArrayList<Cliente>();
        directorioAlmacenes = new ArrayList<Almacen>();
        panelAlmacenes = new RegistroAlmacenes();
        mensajero = new Mensajero();
        ventanaRegistroParejas = new RegistroParejas();
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
        panelAlmacenes.getBotonSalir().addActionListener(this);
        panelAlmacenes.getBotonOk().addActionListener(this);
        menuadmin.getBotonSalir().addActionListener(this);
        menuCliente.getBotonSalir().addActionListener(this);
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
            boolean datosCorrectos = false;

            if (ventanaLogin.getPanelSesion().getCampoUsuario().getText().equalsIgnoreCase("pinocho") && ventanaLogin.getPanelSesion().getCampoContrasena().getText().equalsIgnoreCase("1234")) {
                ventanaLogin.setVisible(false);
                menuadmin.setVisible(true);
                datosCorrectos = true;
            }
            if (!datosCorrectos) {

                for (int i = 0; i < directorioClientes.size(); i++) {
                    if (ventanaLogin.getPanelSesion().getCampoUsuario().getText().equals(directorioClientes.get(i).getUsuario()) && ventanaLogin.getPanelSesion().getCampoContrasena().getText().equals(directorioClientes.get(i).getContrasena())) {
                        ventanaLogin.setVisible(false);
                        menuCliente.setVisible(true);
                        datosCorrectos = true;
                        break;
                    }
                }

                if (!datosCorrectos) {
                    ventanaLogin.getPanelSesion().mensajeErrorInicioSesion();
                }
            }
        } else if (comando.equals("PANEL_REGISTRARME")) {
            boolean usuarioRepetido = false;
            contCorreo.setErrorEmail(false);
            banco = new Banco();
            cliente = new Cliente(ventanaRegister.getPanelRegister().getCampoCorreo().getText(),
                    banco.asignarCupo() + "", ventanaRegister.getPanelRegister().getCampoNombre().getText(),
                    ventanaRegister.getPanelRegister().geteGenero().getSelectedItem() + " ",
                    ventanaRegister.getPanelRegister().getCampoUsuario().getText(),
                    ventanaRegister.getPanelRegister().getCampoContrasena().getText());
            System.out.println(cliente.toString());

            for (Cliente clienteExistente : directorioClientes) {
                if (cliente.getUsuario().equals(clienteExistente.getUsuario())) {
                    usuarioRepetido = true;
                }
            }

            if (usuarioRepetido) {
                mensajero.mostrarMensaje("Este nombre de ususario ya esta en uso");
            } else {
                directorioClientes.add(cliente);
                contCorreo.enviarEmail(ventanaRegister.getPanelRegister().getCampoCorreo().getText());

                if (!contCorreo.isErrorEmail()) {
                    int aux = contCorreo.mensajeConfirmacion();
                    if (aux == 0) {
                        ventanaRegister.setVisible(false);
                        ventanaLogin.setVisible(true);
                    }
                }else{
                    directorioClientes.remove(cliente);
                }

            }

        } else if (comando.equals("VOLVER_INICIO_SESION")) {
            ventanaLogin.setVisible(false);
            menuPrincipal.setVisible(true);
        } else if (comando.equals("VOLVER_INICIO_REGISTRO")) {
            ventanaRegister.setVisible(false);
            menuPrincipal.setVisible(true);
        } else if (comando.equals("OK_BOTON_ADMIN")) {
            if (menuadmin.getOpciones().getSelectedItem().equals("REGISTRO DE TIENDAS DE MERCADO (ALMACENES)")) {
                panelAlmacenes.setVisible(true);
            } else if (menuadmin.getOpciones().getSelectedItem().equals("REGISTRO DE CLIENTES")) {
                System.out.println("2");
            } else if (menuadmin.getOpciones().getSelectedItem().equals("ABONO A TARJETA DE CRÉDITO (LIBERACIÓN DE CUPO)")) {
                System.out.println("3");
            } else if (menuadmin.getOpciones().getSelectedItem().equals("REPORTES ANALÍTICOS")) {
                System.out.println("4");
            }
        } else if (comando.equals("OK_BOTON_CLIENTE")) {
            if (menuCliente.getOpciones().getSelectedItem().equals("REGISTRO DE PAREJAS")) {
                System.out.println("1");
            } else if (menuCliente.getOpciones().getSelectedItem().equals("ASIGNACIÓN DE HORARIOS (DIA-HORA POR LUGAR)")) {
                System.out.println("2");
            } else if (menuCliente.getOpciones().getSelectedItem().equals("ASIGNACIÓN DE CUPO DE TARJETA DE CRÉDITO")) {
                System.out.println("3");
            } else if (menuCliente.getOpciones().getSelectedItem().equals("PAGOS CON TARJETA DE CRÉDITO")) {
                System.out.println("4");
            }
        } else if (comando.equals("SALIR_REGISTRO")) {
            panelAlmacenes.setVisible(false);
            menuadmin.setVisible(true);
        } else if (comando.equals("REGISTRAR_ALMACEN_BOTON")) {
            boolean seRepite = false;
            Almacen x = new Almacen(panelAlmacenes.getLista_Lugares().getSelectedItem() + "");

            for (Almacen almacenExistente : directorioAlmacenes) {
                if (x.getLugar().equals(almacenExistente.getLugar())) {
                    seRepite = true;
                }
            }

            if (seRepite) {
                mensajero.mostrarMensaje("ya hay un almacen en este lugar");
            } else {
                directorioAlmacenes.add(x);
                panelAlmacenes.mensajeConfirmacion((String) panelAlmacenes.getLista_Lugares().getSelectedItem());
                System.out.println(x.toString());
            }

        } else if (comando.equals("SALIR_MENUADMIN")) {
            ventanaLogin.setVisible(true);
            menuadmin.setVisible(false);
        } else if (comando.equals("SALIR_MENUCLIENTE")) {
            ventanaLogin.setVisible(true);
            menuCliente.setVisible(false);
        }
    }
}
