/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author alejo
 */
public class DirectorioClientes {
    private ArrayList<Cliente> directorioClientes;

    public DirectorioClientes() {
        directorioClientes = new ArrayList<Cliente>();
    }
    
    public void addCliente(Cliente x){
        directorioClientes.add(x);
    }
    
    public void quitarCliente(Cliente x) {
		directorioClientes.remove(x);
	}

    public ArrayList<Cliente> getDirectorioClientes() {
        return directorioClientes;
    }

    public void setDirectorioClientes(ArrayList<Cliente> directorioClientes) {
        this.directorioClientes = directorioClientes;
    }
    
    
}
