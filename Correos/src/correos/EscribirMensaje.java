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
public class EscribirMensaje {
    
    public EscribirMensaje(Mensajes mensaje){
        try
        {
            FileWriter escritor = new FileWriter( "Mensajes.txt", true);


            BufferedWriter bufferescritor = new BufferedWriter( escritor );

                
        bufferescritor.write(mensaje.getDestino().getCorreo()+"-");
        bufferescritor.write(mensaje.getOrigen().getCorreo()+"-");
        bufferescritor.write(mensaje.getAsunto()+"-");
        bufferescritor.write(mensaje.getContenido()+"-");
     
                bufferescritor.newLine();
        bufferescritor.close( );    
        }
catch( IOException ioe )
        {
            System.out.println("Error leyendo archivo");
            ioe.printStackTrace( );
        }
        
        
        
    }
}
