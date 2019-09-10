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
public class Usuarios {

    int id;
    String nombre;
    String apellido;
    int pass;

    public Usuarios() {
        
        
            
    }

    public Usuarios(int id, String nombre, String apellido, int pass) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.pass = pass;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

   
   
}
    
       