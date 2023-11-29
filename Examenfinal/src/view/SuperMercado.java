/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import javax.naming.ldap.Rdn;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author alejo
 */
public class SuperMercado extends JFrame {

    private JPanel panelSuperMercado;
    private JLabel eSuperMercado;
    private JLabel eProducto1;
    private JLabel eProducto2;
    private JButton botonAnadirAlCarrito1;
    private JButton botonAnadirAlCarrito2;
    private JButton botonAnadirAlCarrito3;
    private JButton botonAnadirAlCarrito4;
    private JButton botonAnadirAlCarrito5;
    private JButton botonAnadirAlCarrito6;
    private JLabel eCarrito;
    private JLabel eCarrito2;

    private int entero1;
    private int entero2;
    private int entero3;
    private int entero4;
    private int entero5;
    private int entero6;
    private int enteroTotal;

    private JLabel eCantidad1;
    private JLabel eCantidad2;
    private JLabel eCantidad3;
    private JLabel eCantidad4;
    private JLabel eCantidad5;
    private JLabel eCantidad6;
    private JLabel eTotal;
    private JButton botonRealizarCompra;
    private JButton botonVolver;

    public SuperMercado() {

        setTitle("SuperMercado");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inicializarComponentes();

        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(false);

    }

    public void inicializarComponentes() {
        panelSuperMercado = new JPanel(null);
        panelSuperMercado.setBackground(Color.red);
        panelSuperMercado.setLayout(null);
        panelSuperMercado.setVisible(true);

        eSuperMercado = new JLabel("Hide & Seek");
        eSuperMercado.setFont(new Font("Lucida Sans", Font.ITALIC, 32));
        eSuperMercado.setBounds(300, 50, 300, 30);
        add(eSuperMercado);

        eProducto1 = new JLabel("<html>Docena Huevo <br>1.000.000$<br> <br>Bolsa 1L Leche <br>2.000.000$<br> <br>Libra Arroz <br>1.000.000$<html>");
        eProducto1.setBounds(100, 140, 100, 150);
        add(eProducto1);

        eProducto2 = new JLabel("<html>Esfero <br>5.000.000$<br> <br>Llanta carro <br>3.000.000$ <br> <br>Pasta Dental <br>9.000.000$<html>");
        eProducto2.setBounds(400, 150, 100, 130);
        add(eProducto2);

        botonVolver = new JButton("Volver");
        botonVolver.setBounds(30, 500, 100, 30);
        botonVolver.setActionCommand("VOLVER_SUPERMERCADO");
        add(botonVolver);

        botonRealizarCompra = new JButton("Realizar Compra");
        botonRealizarCompra.setBounds(400, 400, 160, 30);
        botonRealizarCompra.setActionCommand("SUPER_COMPRAR");
        add(botonRealizarCompra);

        botonAnadirAlCarrito1 = new JButton("Anadir al carrito1.");
        botonAnadirAlCarrito1.setBounds(210, 150, 140, 30);
        botonAnadirAlCarrito1.setActionCommand("SUPER_CARRITO1");
        add(botonAnadirAlCarrito1);

        botonAnadirAlCarrito2 = new JButton("Anadir al carrito2.");
        botonAnadirAlCarrito2.setBounds(210, 200, 140, 30);
        botonAnadirAlCarrito2.setActionCommand("SUPER_CARRITO2");
        add(botonAnadirAlCarrito2);

        botonAnadirAlCarrito3 = new JButton("Anadir al carrito3.");
        botonAnadirAlCarrito3.setBounds(210, 250, 140, 30);
        botonAnadirAlCarrito3.setActionCommand("SUPER_CARRITO3");
        add(botonAnadirAlCarrito3);

        botonAnadirAlCarrito4 = new JButton("Anadir al carrito4.");
        botonAnadirAlCarrito4.setBounds(500, 150, 140, 30);
        botonAnadirAlCarrito4.setActionCommand("SUPER_CARRITO4");
        add(botonAnadirAlCarrito4);

        botonAnadirAlCarrito5 = new JButton("Anadir al carrito5.");
        botonAnadirAlCarrito5.setBounds(500, 200, 140, 30);
        botonAnadirAlCarrito5.setActionCommand("SUPER_CARRITO5");
        add(botonAnadirAlCarrito5);

        botonAnadirAlCarrito6 = new JButton("Anadir al carrito6.");
        botonAnadirAlCarrito6.setBounds(500, 250, 140, 30);
        botonAnadirAlCarrito6.setActionCommand("SUPER_CARRITO6");
        add(botonAnadirAlCarrito6);

        eCarrito = new JLabel("Carrito");
        eCarrito.setFont(new Font("Lucida Sans", Font.ITALIC, 20));
        eCarrito.setBounds(70, 310, 100, 30);
        add(eCarrito);

        eCarrito2 = new JLabel("<html>Docena Huevo/s:<br>Bolsa/s 1L Leche:<br>Libra/s Arroz: <br>Esfero/s: <br>Llanta/s carro: <br>Pasta/s Dental:<html>");
        eCarrito2.setBounds(70, 320, 110, 130);
        add(eCarrito2);

        entero1 = 0;
        eCantidad1 = new JLabel(entero1 + "");
        eCantidad1.setBounds(190, 330, 40, 32);
        add(eCantidad1);

        entero2 = 0;
        eCantidad2 = new JLabel(entero2 + "");
        eCantidad2.setBounds(190, 345, 40, 32);
        add(eCantidad2);

        entero3 = 0;
        eCantidad3 = new JLabel(entero3 + "");
        eCantidad3.setBounds(190, 360, 40, 32);
        add(eCantidad3);

        entero4 = 0;
        eCantidad4 = new JLabel(entero4 + "");
        eCantidad4.setBounds(190, 377, 40, 32);
        add(eCantidad4);

        entero5 = 0;
        eCantidad5 = new JLabel(entero5 + "");
        eCantidad5.setBounds(190, 393, 40, 32);
        add(eCantidad5);

        entero6 = 0;
        eCantidad6 = new JLabel(entero6 + "");
        eCantidad6.setBounds(190, 410, 40, 32);
        add(eCantidad6);

        enteroTotal = 0;
        eTotal = new JLabel("Total: " + enteroTotal);
        eTotal.setBounds(400, 330, 200, 32);
        add(eTotal);

        this.add(panelSuperMercado);

    }

     public int sumarEntero(int e) {
        e++;
        return e;
    }

    public int restarEntero(int e){
        e--;
        return e;
    }
    
    public int getEnteroTotal() {
        return enteroTotal;
    }

    public void setEnteroTotal(int enteroTotal) {
        this.enteroTotal = enteroTotal;
    }

   
    
    public int getEntero1() {
        return entero1;
    }

    public void setEntero1(int entero1) {
        this.entero1 = entero1;
    }

    public int getEntero2() {
        return entero2;
    }

    public void setEntero2(int entero2) {
        this.entero2 = entero2;
    }

    public int getEntero3() {
        return entero3;
    }

    public void setEntero3(int entero3) {
        this.entero3 = entero3;
    }

    public int getEntero4() {
        return entero4;
    }

    public void setEntero4(int entero4) {
        this.entero4 = entero4;
    }

    public int getEntero5() {
        return entero5;
    }

    public void setEntero5(int entero5) {
        this.entero5 = entero5;
    }

    public int getEntero6() {
        return entero6;
    }

    public void setEntero6(int entero6) {
        this.entero6 = entero6;
    }

    public JPanel getPanelSuperMercado() {
        return panelSuperMercado;
    }

    public void setPanelSuperMercado(JPanel panelSuperMercado) {
        this.panelSuperMercado = panelSuperMercado;
    }

    public JLabel geteSuperMercado() {
        return eSuperMercado;
    }

    public void seteSuperMercado(JLabel eSuperMercado) {
        this.eSuperMercado = eSuperMercado;
    }

    public JLabel geteProducto1() {
        return eProducto1;
    }

    public void seteProducto1(JLabel eProducto1) {
        this.eProducto1 = eProducto1;
    }

    public JLabel geteProducto2() {
        return eProducto2;
    }

    public void seteProducto2(JLabel eProducto2) {
        this.eProducto2 = eProducto2;
    }

    public JButton getBotonAnadirAlCarrito1() {
        return botonAnadirAlCarrito1;
    }

    public void setBotonAnadirAlCarrito1(JButton botonAnadirAlCarrito1) {
        this.botonAnadirAlCarrito1 = botonAnadirAlCarrito1;
    }

    public JButton getBotonAnadirAlCarrito2() {
        return botonAnadirAlCarrito2;
    }

    public void setBotonAnadirAlCarrito2(JButton botonAnadirAlCarrito2) {
        this.botonAnadirAlCarrito2 = botonAnadirAlCarrito2;
    }

    public JButton getBotonAnadirAlCarrito3() {
        return botonAnadirAlCarrito3;
    }

    public void setBotonAnadirAlCarrito3(JButton botonAnadirAlCarrito3) {
        this.botonAnadirAlCarrito3 = botonAnadirAlCarrito3;
    }

    public JButton getBotonAnadirAlCarrito4() {
        return botonAnadirAlCarrito4;
    }

    public void setBotonAnadirAlCarrito4(JButton botonAnadirAlCarrito4) {
        this.botonAnadirAlCarrito4 = botonAnadirAlCarrito4;
    }

    public JButton getBotonAnadirAlCarrito5() {
        return botonAnadirAlCarrito5;
    }

    public void setBotonAnadirAlCarrito5(JButton botonAnadirAlCarrito5) {
        this.botonAnadirAlCarrito5 = botonAnadirAlCarrito5;
    }

    public JButton getBotonAnadirAlCarrito6() {
        return botonAnadirAlCarrito6;
    }

    public void setBotonAnadirAlCarrito6(JButton botonAnadirAlCarrito6) {
        this.botonAnadirAlCarrito6 = botonAnadirAlCarrito6;
    }

    public JLabel geteCarrito() {
        return eCarrito;
    }

    public void seteCarrito(JLabel eCarrito) {
        this.eCarrito = eCarrito;
    }

    public JLabel geteCarrito2() {
        return eCarrito2;
    }

    public void seteCarrito2(JLabel eCarrito2) {
        this.eCarrito2 = eCarrito2;
    }

    public JLabel geteCantidad1() {
        return eCantidad1;
    }

    public void seteCantidad1(JLabel eCantidad1) {
        this.eCantidad1 = eCantidad1;
    }

    public JLabel geteCantidad2() {
        return eCantidad2;
    }

    public void seteCantidad2(JLabel eCantidad2) {
        this.eCantidad2 = eCantidad2;
    }

    public JLabel geteCantidad3() {
        return eCantidad3;
    }

    public void seteCantidad3(JLabel eCantidad3) {
        this.eCantidad3 = eCantidad3;
    }

    public JLabel geteCantidad4() {
        return eCantidad4;
    }

    public void seteCantidad4(JLabel eCantidad4) {
        this.eCantidad4 = eCantidad4;
    }

    public JLabel geteCantidad5() {
        return eCantidad5;
    }

    public void seteCantidad5(JLabel eCantidad5) {
        this.eCantidad5 = eCantidad5;
    }

    public JLabel geteCantidad6() {
        return eCantidad6;
    }

    public void seteCantidad6(JLabel eCantidad6) {
        this.eCantidad6 = eCantidad6;
    }

    public JLabel geteTotal() {
        return eTotal;
    }

    public void seteTotal(JLabel eTotal) {
        this.eTotal = eTotal;
    }

    public JButton getBotonRealizarCompra() {
        return botonRealizarCompra;
    }

    public void setBotonRealizarCompra(JButton botonRealizarCompra) {
        this.botonRealizarCompra = botonRealizarCompra;
    }

    public JButton getBotonVolver() {
        return botonVolver;
    }

    public void setBotonVolver(JButton botonVolver) {
        this.botonVolver = botonVolver;
    }

}
