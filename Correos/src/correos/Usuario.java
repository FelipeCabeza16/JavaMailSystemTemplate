/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correos;

/**
 *
 * @author Felipe Cabeza @felipecabeza16
 */
public class Usuario {
    private String nombre, correo, contraseña;
    int edad;

    public Usuario(String nombre, String correo, String contraseña, int edad) {
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
        this.edad = edad;
    }

    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


public String toString(){
  return "Nombre :"+this.nombre+ " correo :"+this.correo;      
        
    }
        
}
