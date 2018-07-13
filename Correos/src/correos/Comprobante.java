/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correos;

import java.util.*;
import java.io.*;
/**
 *
 * @author 
 */
public class Comprobante {
private  Usuario logueado;  
    public Comprobante(){
        
        
        
        
        
        
        
    }
    
    public Usuario buscar(String correo, String contraseña){
        Lector lector = new Lector();
   Iterator it =  lector.usuarios.iterator();
        
   while(it.hasNext())
   {
   logueado = (Usuario) it.next();
       if (logueado.getCorreo().equalsIgnoreCase(correo) && logueado.getContraseña().equals(contraseña))
          return logueado; 
           }
    return null;
    }
    
 public Usuario buscarCorreo(String correo){
        Lector lector = new Lector();
   Iterator it =  lector.usuarios.iterator();
        
   while(it.hasNext())
   {
   logueado = (Usuario) it.next();
       if (logueado.getCorreo().equalsIgnoreCase(correo))
          return logueado; 
           }
    return null;
    }


}
