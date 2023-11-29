/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 * Clase Pareja que hereda de persona con los datos del momento en el que una
 * pareja entra a un almacen
 *
 * @author Grupo JAN
 */
public class Pareja extends Persona {

    /**
     * variable dia de tipo String
     */
    private String dia;
    /**
     * variable hora de tipo String
     */
    private String hora;
    /**
     * variable lugar de tipo String
     */
    private String lugar;
    private double cupo;
    private double cantmaxcupo;
    private String correo;
    private double dineroGastado;

    /**
     * Constructor con los datos de la pareja de un cliente
     *
     * @param dia dia que ingresa al almacen
     * @param hora hora a la que ingresa al almacen
     * @param lugar almacen al que ingresa
     * @param nombre nombre de la pareja
     * @param genero genero de la pareja
     * @param usuario usuario de la pareja
     * @param contrasena contraseña de la pareja
     */
    public Pareja(String dia, String hora, String lugar, String nombre, String genero, String usuario,
            String contrasena, double particioncupo, String correo, double dineroGastado) {
        super(nombre, genero, usuario, contrasena);
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.cupo = particioncupo;
        this.cantmaxcupo= particioncupo;
        this.correo = correo;
        this.dineroGastado = dineroGastado;
    }

    /**
     * obtener dia
     *
     * @return dia
     */
    public String getDia() {
        return dia;
    }

    /**
     * definir dia
     *
     * @param dia dia a definir
     */
    public void setDia(String dia) {
        this.dia = dia;
    }

    /**
     * obtener hora
     *
     * @return hora
     */
    public String getHora() {
        return hora;
    }

    /**
     * definir hora
     *
     * @param hora hora a definir
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     * obtener lugar
     *
     * @return lugar
     */
    public String getLugar() {
        return lugar;
    }

    /**
     * definir lugar
     *
     * @param lugar lugar a definir
     */
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    /**
     * obtener nombre
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * definir nombre
     *
     * @param nombre nombre a definir
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * obtener genero
     *
     * @return genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * definir genero
     *
     * @param genero genero a definir
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * obtener usuario
     *
     * @return usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * definir usuario
     *
     * @param usuario usuario a definir
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * obtener contraseña
     *
     * @return contraseña
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * definir contraseña
     *
     * @param contrasena contraseña a definir
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public double getCupo() {
        return cupo;
    }

    public void setCupo(double cupo) {
        this.cupo = cupo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public double getDineroGastado() {
        return dineroGastado;
    }

    public void setDineroGastado(double dineroGastado) {
        this.dineroGastado = dineroGastado;
    }

    public double getCantmaxcupo() {
        return cantmaxcupo;
    }

    public void setCantmaxcupo(double cantmaxcupo) {
        this.cantmaxcupo = cantmaxcupo;
    }
    
    
    @Override
    public String toString() {
        return "Pareja{" + "dia=" + dia + ", hora=" + hora + ", lugar=" + lugar + ", cupo=" + cupo + ", correo=" + correo + ", dineroGastado=" + dineroGastado + '}';
    }

}
