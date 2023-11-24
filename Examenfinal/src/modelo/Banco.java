/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.Random;
/**
 *
 * @author sebas
 */
public class Banco {
    private double cupo=0;
    private double cupousado=0;
    private Random rand;

    public Banco() {
        rand = new Random();
    }

    public double getCupo() {
        return cupo;
    }

    public double asignarCupo() {
        return this.cupo = rand.nextInt(10000000-1000000+1)+1000000;
    }

    public double getCupousado() {
        return cupousado;
    }

    public void setCupousado(double cupousado) {
        this.cupousado = cupousado;
    }
    
}