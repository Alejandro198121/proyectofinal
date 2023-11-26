/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Cliente extends Persona{

    private String correo;
    private String tarjetaCredito;

    public Cliente(String correo, String tarjetaCredito, String nombre, String genero, String usuario, String contrasena) {
        super(nombre, genero, usuario, contrasena);
        this.correo = correo;
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return ("nombre "+getNombre()+"\ngenero "+getGenero()+"\ntarjeta "+getTarjetaCredito()+"\ncorreo "+getCorreo()+"\nusuario "+getUsuario()+"\ncontraseña "+getContrasena());
    }

    
}