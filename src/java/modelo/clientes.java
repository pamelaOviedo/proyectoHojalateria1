/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class clientes {

    int idclientes;
    String nombre;
    String apellido;
    int telefono;
    String direccion;
    String observacion;

    public clientes() {
    }

    public clientes(int idclientes, String nombre, String apellido, int telefono, String direccion, String observacion) {
        this.idclientes = idclientes;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.observacion = observacion;
    }

    public int getidclientes() {
        return idclientes;
    }

    public void setidclientes(int idclientes) {
        this.idclientes = idclientes;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getapellido() {
        return apellido;
    }

    public void setapellido(String apellido) {
        this.apellido = apellido;
    }

    public int gettelefono() {
        return telefono;
    }

    public void settelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getdireccion() {
        return direccion;
    }

    public void setdireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getobservacion() {
        return observacion;
    }

    public void setobservacion(String observacion) {
        this.observacion = observacion;
    }

}


