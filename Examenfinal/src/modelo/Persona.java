/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
/**
 * Clase de tipo persona 
 * @author Grupo JAN
 */
public class Persona {
	/**
	 * variable nombre de tipo String
	 */
	protected String nombre;
	/**
	 * variable genero de tipo String
	 */
	protected String genero;
	/**
	 * variable usuario de tipo String
	 */
	protected String usuario;
	/**
	 * variable contraseña de tipo String
	 */
	protected String contrasena;
/**
 * Constructor general para los clientes y sus parejas
 * @param nombre nombre del cliente o de la pareja
 * @param genero genero del cliente o de la pareja
 * @param usuario usuario del cliente o de la pareja
 * @param contrasena contraseña del cliente o de la pareja
 */
    public Persona(String nombre, String genero, String usuario, String contrasena) {
        this.nombre = nombre;
        this.genero = genero;
        this.usuario = usuario;
        this.contrasena = contrasena;
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
    
}