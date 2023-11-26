/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.HashMap;

/**
 *
 * @author alejo
 */
public class Almacen {

    private String lugar;
    private HashMap<String, Integer> productos;

    public Almacen(String lugar) {
        this.lugar = lugar;
        this.productos = new HashMap<>();
        productos.put("Docena Huevos", 1000000);
        productos.put("Bola 1L Leche", 2000000);
        productos.put("Libra Arroz", 1000000);
        productos.put("Cocaina", 5000000);
        productos.put("Llanta carro", 3000000);
        productos.put("Pasta Dental", 9000000);
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public HashMap<String, Integer> getProductos() {
        return productos;
    }

    public void setProductos(HashMap<String, Integer> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Almacen{" + "lugar=" + lugar + ", productos=" + productos + '}';
    }

}
