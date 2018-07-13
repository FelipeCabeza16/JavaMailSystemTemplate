/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correos;
import java.io.*;
/**
 *
 * @author SANDRA
 */
public class Escribir {
    Usuario usuario;
    public Escribir(Usuario usuario){
        this.usuario = usuario;
     
        
    }

    public void registrarUsuario(Usuario us) {
    
        try
        {
            FileWriter escritor = new FileWriter( "Registrados.txt", true);


            BufferedWriter bufferescritor = new BufferedWriter( escritor );

                
        bufferescritor.write(us.getCorreo() +"-");
        bufferescritor.write(us.getContraseña()+"-");
        bufferescritor.write(us.getNombre()+"-");
        bufferescritor.write(us.getEdad() +"-");
     
                bufferescritor.newLine();
        bufferescritor.close( );    
        }
catch( IOException ioe )
        {
            ioe.printStackTrace( );
        }
            
            
         
        }

        
        
    }
    

