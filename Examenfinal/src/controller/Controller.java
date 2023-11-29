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
import modelo.Pareja;
import modelo.Persona;
import view.LiberacionCupo;
import view.Mensajero;
import view.MenuAdmin;
import view.MenuCliente;
import view.Menu_Inicial;
import view.PanelRegistroUsuario;
import view.RegistroAlmacenes;
import view.SuperMercado;
import view.VentanaRegistroParejas;
import view.VentanaInicioSesion;
import view.VentanaRegistroUsuario;
import modelo.DirectorioClientes;
import view.RemoverClientes;

/**
 * clase controlador
 *
 * @author Grupo JAN
 */
public class Controller implements ActionListener {

    /**
     * variable menuPrincipal de tipo Menu_Inicial
     */
    private Menu_Inicial menuPrincipal;
    /**
     * variable ventanaLogin de tipo VentanaInicioSesion
     */
    private VentanaInicioSesion ventanaLogin;
    /**
     * variable ventanaRegister de tipo VentanaREgistroUsuario
     */
    private VentanaRegistroUsuario ventanaRegister;
    /**
     * variable cliente de tipo Cliente
     */
    private Cliente cliente;
    private Pareja pareja;
    /**
     * variable banco de tipo Banco
     */
    private Banco banco;
    /**
     * variable contCorreo de tipo ControladorEmail
     */
    private ControladorEmail contCorreo;
    /**
     * variable admin de tipo Persona
     */
    private Persona admin;
    /**
     * variable menuadmin de tipo MenuAdmin
     */
    private MenuAdmin menuadmin;
    /**
     * variable menuCliente de tipo MenuCliente
     */
    private MenuCliente menuCliente;
    /**
     * variable panelregistrousuario de tipo PanelRegistroUsuario
     */
    private PanelRegistroUsuario panelregistrousuario;
    /**
     * variable panelAlmacenes de tipo RegistroAlmacenes
     */
    private RegistroAlmacenes panelAlmacenes;
    /**
     * variable mensajero de tipo Mensajero
     */
    private Mensajero mensajero;
    /**
     * variable ventanaRegistroParejas de tipo RegistroParejas
     */
    private VentanaRegistroParejas ventanaRegistroParejas;
    
    private DirectorioClientes directorioClientes;
    /**
     * arreglo directorioAlmacenes de tipo Almacen
     */
    private ArrayList<Almacen> directorioAlmacenes;
    private ArrayList<Pareja> directorioparejas;
    private SuperMercado superMercado;
    private LiberacionCupo cupoLiberacion;
    private RemoverClientes removerClientes;

    /**
     * Constructor para controller
     */
    public Controller() {
        menuPrincipal = new Menu_Inicial();
        ventanaLogin = new VentanaInicioSesion();
        ventanaRegister = new VentanaRegistroUsuario();
        contCorreo = new ControladorEmail();
        admin = new Persona("Carlo Collodi", "Hombre", "pinocho", "1234");
        directorioClientes = new DirectorioClientes();
        menuadmin = new MenuAdmin();
        menuCliente = new MenuCliente();
        directorioAlmacenes = new ArrayList<Almacen>();
        panelAlmacenes = new RegistroAlmacenes();
        mensajero = new Mensajero();
        ventanaRegistroParejas = new VentanaRegistroParejas();
        superMercado = new SuperMercado();
        directorioparejas = new ArrayList<Pareja>();
        cupoLiberacion = new LiberacionCupo();
        removerClientes = new RemoverClientes();
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
        ventanaRegistroParejas.getBotonVolver().addActionListener(this);
        ventanaRegistroParejas.getBotonRegistrarse().addActionListener(this);
        superMercado.getBotonVolver().addActionListener(this);
        removerClientes.getBotonSalir().addActionListener(this);
        removerClientes.getBotonOk().addActionListener(this);
        superMercado.getBotonAnadirAlCarrito1().addActionListener(this);
        superMercado.getBotonAnadirAlCarrito2().addActionListener(this);
        superMercado.getBotonAnadirAlCarrito3().addActionListener(this);
        superMercado.getBotonAnadirAlCarrito4().addActionListener(this);
        superMercado.getBotonAnadirAlCarrito5().addActionListener(this);
        superMercado.getBotonAnadirAlCarrito6().addActionListener(this);
        superMercado.getBotonRealizarCompra().addActionListener(this);
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
                
                for (int i = 0; i < directorioClientes.getDirectorioClientes().size(); i++) {
                    if (ventanaLogin.getPanelSesion().getCampoUsuario().getText().equals(directorioClientes.getDirectorioClientes().get(i).getUsuario()) && ventanaLogin.getPanelSesion().getCampoContrasena().getText().equals(directorioClientes.getDirectorioClientes().get(i).getContrasena())) {
                        ventanaLogin.setVisible(false);
                        menuCliente.setVisible(true);
                        datosCorrectos = true;
                        break;
                    }
                    if (ventanaLogin.getPanelSesion().getCampoUsuario().getText().equals(directorioparejas.get(i).getUsuario()) && ventanaLogin.getPanelSesion().getCampoContrasena().getText().equals(directorioparejas.get(i).getContrasena())) {
                        ventanaLogin.setVisible(false);
                        superMercado.setVisible(true);
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
                    ventanaRegister.getPanelRegister().getCampoContrasena().getText(), Integer.parseInt(ventanaRegister.getPanelRegister().getCampoCaParejas().getText()));
            System.out.println(cliente.toString());
            
            for (Cliente clienteExistente : directorioClientes.getDirectorioClientes()) {
                if (cliente.getUsuario().equals(clienteExistente.getUsuario())) {
                    usuarioRepetido = true;
                }
            }
            
            if (usuarioRepetido) {
                mensajero.mostrarMensaje("Este nombre de ususario ya esta en uso");
            } else if (cliente.getCantparejascliente() > 5 || cliente.getCantparejascliente() < 1) {
                mensajero.mostrarMensaje("Usted solo puede ingresar una cantidad de aprejas en el rango de 1 a 5 parejas");
            } else {
                directorioClientes.addCliente(cliente);
                contCorreo.enviarEmail(ventanaRegister.getPanelRegister().getCampoCorreo().getText());
                
                if (!contCorreo.isErrorEmail()) {
                    int aux = contCorreo.mensajeConfirmacion();
                    if (aux == 0) {
                        ventanaRegister.setVisible(false);
                        ventanaLogin.setVisible(true);
                    }
                } else {
                    directorioClientes.quitarCliente(cliente);
                }
            }
        } else if (comando.equals("VOLVER_INICIO_SESION")) {
            ventanaLogin.setVisible(false);
            menuPrincipal.setVisible(true);
        } else if (comando.equals("VOLVER_INICIO_REGISTRO")) {
            ventanaRegister.setVisible(false);
            menuPrincipal.setVisible(true);
        } else if (comando.equals("SALIR_REMOVERCLIENTES")) {
            removerClientes.setVisible(false);
            menuadmin.setVisible(true);
        } else if (comando.equals("BOTON_REMOVERCLIENTE")) {
            String nombreBuscar = (String) removerClientes.getClientes().getSelectedItem();
            if (directorioClientes.getDirectorioClientes().size() < 1) {
                mensajero.mostrarMensaje("ya no hay mas clientes");
            } else {
                for (Cliente x : directorioClientes.getDirectorioClientes()) {
                    if (x.getUsuario().equals(nombreBuscar)) {
                        directorioClientes.quitarCliente(x);
                    }
                }
            }
            
            removerClientes.getClientes().removeAllItems();
            for (Cliente x : directorioClientes.getDirectorioClientes()) {
                String useraux = x.getUsuario();
                removerClientes.getClientes().addItem(useraux);
            }
            
        } else if (comando.equals("OK_BOTON_ADMIN")) {
            if (menuadmin.getOpciones().getSelectedItem().equals("REGISTRO DE TIENDAS DE MERCADO (ALMACENES)")) {
                panelAlmacenes.setVisible(true);
            } else if (menuadmin.getOpciones().getSelectedItem().equals("ABONO A TARJETA DE CRÉDITO (LIBERACIÓN DE CUPO)")) {
                cupoLiberacion.setVisible(true);
                cupoLiberacion.getClientes().removeAllItems();
                for (Cliente x : directorioClientes.getDirectorioClientes()) {
                    String useraux = x.getUsuario();
                    cupoLiberacion.getClientes().addItem(useraux + " debe: "+ x.getTarjetaCredito());
                }
                
            } else if (menuadmin.getOpciones().getSelectedItem().equals("REMOVER CLIENTES")) {
                removerClientes.setVisible(true);
                removerClientes.getClientes().removeAllItems();
                for (Cliente x : directorioClientes.getDirectorioClientes()) {
                    String useraux = x.getUsuario();
                    removerClientes.getClientes().addItem(useraux);
                }
            } else if (menuadmin.getOpciones().getSelectedItem().equals("REPORTES ANALÍTICOS")) {
                System.out.println("4");
            }
        } else if (comando.equals("OK_BOTON_CLIENTE")) {
            if (menuCliente.getOpciones().getSelectedItem().equals("REGISTRO DE PAREJAS")) {
                ventanaRegistroParejas.setVisible(true);
                menuCliente.setVisible(false);
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
        } else if (comando.equals("VOLVER_REGISTROPAREJA")) {
            ventanaRegistroParejas.setVisible(false);
            menuCliente.setVisible(true);
        } else if (comando.equals("PANEL_REGISTRAR_PAREJA")) {
            boolean parejaRepetida = false;
            contCorreo.setErrorEmail(false);
            
            pareja = new Pareja(ventanaRegistroParejas.getBoxDia().getSelectedItem() + "", ventanaRegistroParejas.getBoxHora().getSelectedItem() + "", ventanaRegistroParejas.getBoxLugar().getSelectedItem() + "", ventanaRegistroParejas.getCampoNombre().getText(), ventanaRegistroParejas.geteGenero().getSelectedItem() + "", ventanaRegistroParejas.getCampoUsuario().getText(), ventanaRegistroParejas.getCampoContrasena().getText(), Double.parseDouble(cliente.getTarjetaCredito()) / cliente.getCantparejascliente(), ventanaRegistroParejas.getCampoCorreo().getText(), 0);
            System.out.println(pareja.toString() + pareja.getNombre() + pareja.getUsuario() + pareja.getContrasena());
            
            for (Pareja parejaexistente : directorioparejas) {
                if (pareja.getUsuario().equals(parejaexistente.getUsuario())) {
                    parejaRepetida = true;
                    break;
                }
            }
            
            for (Cliente clienteExistente : directorioClientes.getDirectorioClientes()) {
                if (pareja.getUsuario().equals(clienteExistente.getUsuario())) {
                    parejaRepetida = true;
                    break;
                }
            }
            
            if (parejaRepetida) {
                mensajero.mostrarMensaje("Este nombre de usuario ya está en uso");
            } else if (cliente.getParejascliente().size() > cliente.getCantparejascliente()) {
                mensajero.mostrarMensaje("Usted esta intentando registrar mas parejas de las que indico que tiene");
            } else {
                cliente.getParejascliente().add(pareja);
                directorioparejas.add(pareja);
                contCorreo.enviarEmail(pareja.getCorreo());
                System.out.println(cliente.getParejascliente().size());
                
                if (!contCorreo.isErrorEmail()) {
                    int aux = contCorreo.mensajeConfirmacion();
                    if (aux == 0) {
                        ventanaRegistroParejas.setVisible(false);
                        ventanaLogin.setVisible(true);
                    }
                } else {
                    directorioparejas.remove(pareja);
                    cliente.getParejascliente().remove(pareja);
                }
                
            }
        } else if (comando.equals("VOLVER_SUPERMERCADO")) {
            
            superMercado.setEntero1(0);
            superMercado.setEntero2(0);
            superMercado.setEntero3(0);
            superMercado.setEntero4(0);
            superMercado.setEntero5(0);
            superMercado.setEntero6(0);
            
            superMercado.geteCantidad1().setText("0");
            superMercado.geteCantidad2().setText("0");
            superMercado.geteCantidad3().setText("0");
            superMercado.geteCantidad4().setText("0");
            superMercado.geteCantidad5().setText("0");
            superMercado.geteCantidad6().setText("0");
            superMercado.geteTotal().setText("Total: 0$");
            superMercado.setVisible(false);
            ventanaLogin.setVisible(true);
            
        } else if (comando.equals("SUPER_CARRITO1")) {
            superMercado.setEntero1(superMercado.sumarEntero(superMercado.getEntero1()));
            superMercado.geteCantidad1().setText(superMercado.getEntero1() + "");
            int sumaTotal = ((superMercado.getEntero1() * 1000000) + (superMercado.getEntero2() * 2000000) + (superMercado.getEntero3() * 1000000) + (superMercado.getEntero4() * 5000000) + (superMercado.getEntero5() * 3000000) + (superMercado.getEntero6() * 9000000));
            superMercado.geteTotal().setText("Total: " + sumaTotal + "$");
        } else if (comando.equals("SUPER_CARRITO2")) {
            superMercado.setEntero2(superMercado.sumarEntero(superMercado.getEntero2()));
            superMercado.geteCantidad2().setText(superMercado.getEntero2() + "");
            int sumaTotal = ((superMercado.getEntero1() * 1000000) + (superMercado.getEntero2() * 2000000) + (superMercado.getEntero3() * 1000000) + (superMercado.getEntero4() * 5000000) + (superMercado.getEntero5() * 3000000) + (superMercado.getEntero6() * 9000000));
            superMercado.geteTotal().setText("Total: " + sumaTotal + "$");
        } else if (comando.equals("SUPER_CARRITO3")) {
            superMercado.setEntero3(superMercado.sumarEntero(superMercado.getEntero3()));
            superMercado.geteCantidad3().setText(superMercado.getEntero3() + "");
            int sumaTotal = ((superMercado.getEntero1() * 1000000) + (superMercado.getEntero2() * 2000000) + (superMercado.getEntero3() * 1000000) + (superMercado.getEntero4() * 5000000) + (superMercado.getEntero5() * 3000000) + (superMercado.getEntero6() * 9000000));
            superMercado.geteTotal().setText("Total: " + sumaTotal + "$");
        } else if (comando.equals("SUPER_CARRITO4")) {
            superMercado.setEntero4(superMercado.sumarEntero(superMercado.getEntero4()));
            superMercado.geteCantidad4().setText(superMercado.getEntero4() + "");
            int sumaTotal = ((superMercado.getEntero1() * 1000000) + (superMercado.getEntero2() * 2000000) + (superMercado.getEntero3() * 1000000) + (superMercado.getEntero4() * 5000000) + (superMercado.getEntero5() * 3000000) + (superMercado.getEntero6() * 9000000));
            superMercado.geteTotal().setText("Total: " + sumaTotal + "$");
            
        } else if (comando.equals("SUPER_CARRITO5")) {
            superMercado.setEntero5(superMercado.sumarEntero(superMercado.getEntero5()));
            superMercado.geteCantidad5().setText(superMercado.getEntero5() + "");
            int sumaTotal = ((superMercado.getEntero1() * 1000000) + (superMercado.getEntero2() * 2000000) + (superMercado.getEntero3() * 1000000) + (superMercado.getEntero4() * 5000000) + (superMercado.getEntero5() * 3000000) + (superMercado.getEntero6() * 9000000));
            superMercado.geteTotal().setText("Total: " + sumaTotal + "$");
        } else if (comando.equals("SUPER_CARRITO6")) {
            superMercado.setEntero6(superMercado.sumarEntero(superMercado.getEntero6()));
            superMercado.geteCantidad6().setText(superMercado.getEntero6() + "");
            int sumaTotal = ((superMercado.getEntero1() * 1000000) + (superMercado.getEntero2() * 2000000) + (superMercado.getEntero3() * 1000000) + (superMercado.getEntero4() * 5000000) + (superMercado.getEntero5() * 3000000) + (superMercado.getEntero6() * 9000000));
            superMercado.geteTotal().setText("Total: " + sumaTotal + "$");
        } else if (comando.equals("SUPER_COMPRAR")) {
            System.out.println("Comprar");
            int sumaTotal = ((superMercado.getEntero1() * 1000000) + (superMercado.getEntero2() * 2000000) + (superMercado.getEntero3() * 1000000) + (superMercado.getEntero4() * 5000000) + (superMercado.getEntero5() * 3000000) + (superMercado.getEntero6() * 9000000));
            if (pareja.getCupo() >= sumaTotal) {
                mensajero.mostrarMensaje("si pudo comprar");
                pareja.setDineroGastado(sumaTotal);
                pareja.setCupo((pareja.getCupo() - pareja.getDineroGastado()));
                double deuda = (Double.parseDouble(cliente.getTarjetaCredito()) - sumaTotal);
                cliente.setTarjetaCredito((Double.parseDouble(cliente.getTarjetaCredito()) - deuda) + "");
                
                System.out.println(pareja.getCupo() + "   " + pareja.getDineroGastado() + "   " + cliente.getTarjetaCredito() + "     " + deuda);
            } else {
                mensajero.mostrarMensaje("su total excede el cupo de la tarjeta de credito");
                int aux = mensajero.mostrarMensajeSioNo("Quiere pedir un sobrecupo?");
                double cupoExtra = (sumaTotal - pareja.getCupo());
                if (aux == 0) {
                    pareja.setCupo(pareja.getCupo() + cupoExtra);
                    cliente.setTarjetaCredito((Double.parseDouble(cliente.getTarjetaCredito()) + cupoExtra) + "");
                    mensajero.mostrarMensaje("el monto faltante ha sido añadido al cupo de la tarjeta de credito.");
                    
                    System.out.println(pareja.getCupo() + "   " + cliente.getTarjetaCredito());
                } else {
                    mensajero.mostrarMensaje("entonces jodase");
                    superMercado.setEntero1(0);
                    superMercado.setEntero2(0);
                    superMercado.setEntero3(0);
                    superMercado.setEntero4(0);
                    superMercado.setEntero5(0);
                    superMercado.setEntero6(0);
                    
                    superMercado.geteCantidad1().setText("0");
                    superMercado.geteCantidad2().setText("0");
                    superMercado.geteCantidad3().setText("0");
                    superMercado.geteCantidad4().setText("0");
                    superMercado.geteCantidad5().setText("0");
                    superMercado.geteCantidad6().setText("0");
                    superMercado.geteTotal().setText("Total: 0$");
                }
                
            }
        }
    }
}
