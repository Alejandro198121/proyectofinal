/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 * Clase de tipo Cliente que hereda de Persona la cual maneja los datos de cada
 * cliente
 */
public class Cliente extends Persona {
/**
 * variable correo de tipo String
 */
	private String correo;
	/**
	 * variable tarjetaCredito de tipo String
	 */
	private String tarjetaCredito;
        private ArrayList<Pareja> parejascliente;
        private double cantparejascliente;
        private double cantmaxcupo;
        private double sobrecupo;
        private double deuda;
	/**
	 * Constructor que define los datos de un cliente
	 * 
	 * @param correo         correo del cliente
	 * @param tarjetaCredito terjeta de credito del cliente
	 * @param nombre         nombre del cliente
	 * @param genero         genero del cliente
	 * @param usuario        usuario del cliente
	 * @param contrasena     contraseña del cliente
	 */

    public Cliente(String correo, String tarjetaCredito, String nombre, String genero, String usuario, String contrasena, int cantparejas) {
        super(nombre, genero, usuario, contrasena);
        this.correo = correo;
        this.tarjetaCredito = tarjetaCredito;
        this.cantmaxcupo = Double.parseDouble(tarjetaCredito);
        this.cantparejascliente= cantparejas;
        this.parejascliente= new ArrayList<Pareja>();
    }
        
        
/**
 * obtener correo
 * @return correo
 */
	public String getCorreo() {
		return correo;
	}
/**
 * definir correo 
 * @param correo correo a definir
 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}
/**
 * obtener tarjeta de credito
 * @return tarjeta de credito
 */
	public String getTarjetaCredito() {
		return tarjetaCredito;
	}
/**
 * definir tarjeta de credito
 * @param tarjetaCredito tarjeta de credito a definir
 */
	public void setTarjetaCredito(String tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}
	/**
	 * obtener nombre
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}
/**
 * definir nombre
 * @param nombre nombre a definir
 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
/**
 * obtener genero
 * @return genero
 */
	public String getGenero() {
		return genero;
	}
/**
 * definir genero
 * @param genero genero a definir
 */
	public void setGenero(String genero) {
		this.genero = genero;
	}
/**
 * obtener usuario
 * @return usuario
 */
	public String getUsuario() {
		return usuario;
	}
/**
 * definir usuario
 * @param usuario usuario a definir
 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
/**
 * obtener contraseña
 * @return contraseña
 */
	public String getContrasena() {
		return contrasena;
	}
/**
 * definir contraseña 
 * @param contrasena contraseña a definir
 */
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
/**
 * toString que imprime datos de un cliente
 */
	@Override
	public String toString() {
		return ("nombre " + getNombre() + "\ngenero " + getGenero() + "\ntarjeta " + getTarjetaCredito() + "\ncorreo "
				+ getCorreo() + "\nusuario " + getUsuario() + "\ncontraseña " + getContrasena());
	}

    public ArrayList<Pareja> getParejascliente() {
        return parejascliente;
    }

    public void setParejascliente(ArrayList<Pareja> parejascliente) {
        this.parejascliente = parejascliente;
    }

 

    public double getCantparejascliente() {
        return cantparejascliente;
    }

    public void setCantparejascliente(double cantparejascliente) {
        this.cantparejascliente = cantparejascliente;
    }

    public double getCantmaxcupo() {
        return cantmaxcupo;
    }

    public void setCantmaxcupo(double cantmaxcupo) {
        this.cantmaxcupo = cantmaxcupo;
    }

    public double getSobrecupo() {
        return sobrecupo;
    }

    public void setSobrecupo(double sobrecupo) {
        this.sobrecupo = sobrecupo;
    }

    public double getDeuda() {
        return deuda;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }

    public String recorrerParejasususario(){
        for ( Pareja x: parejascliente ){
           String a= x.getUsuario();
           return a;
        }
    }    
    public void recorrerParejascontraseñas(){
        for (int i=0; i<parejascliente.size();i++){
            parejascliente.get(i).getContrasena();
        }
    } 
}