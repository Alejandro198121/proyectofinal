/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Random;

/**
 * Clase de tipo banco que define el cupo del usuario
 * 
 * @author Grupo JAN
 */
public class Banco {
	/**
	 * variable cupo de tipo double con valor de 0
	 */
	private double cupo = 0;
	/**
	 * variable cupousado de tipo double con valor de 0
	 */
	private double cupousado = 0;
	/**
	 * variable rand de tipo Random
	 */
	private Random rand;

	/**
	 * Constructor que define el cupo como un numero aleatorio
	 */
	public Banco() {
		rand = new Random();
	}
/**
 * obtener cupo
 * @return cupo
 */
	public double getCupo() {
		return cupo;
	}

	/**
	 * Clase que le asigna un cupo al usuario
	 * 
	 * @return cupo asignado
	 */
	public double asignarCupo() {
		return this.cupo = rand.nextInt(10000000 - 1000000 + 1) + 1000000;
	}
/**
 * obtener cupo usado
 * @return cupo usado
 */
	public double getCupousado() {
		return cupousado;
	}
/**
 * definir cupo usado
 * @param cupousado cupo usado a definir
 */
	public void setCupousado(double cupousado) {
		this.cupousado = cupousado;
	}

}