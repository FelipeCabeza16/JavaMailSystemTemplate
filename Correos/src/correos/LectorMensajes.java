/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Felipe Cabeza @felipecabeza16
 */
public class LectorMensajes {
    private ArrayList<String> mensajes;
    private Scanner lector;
    private String respuesta;
private Usuario logueado;
private Comprobante comp;
    public LectorMensajes(Usuario logueado) {
        this.mensajes = mensajes;
        this.logueado = logueado;
        comp = new Comprobante();
        respuesta = "";
    }

        
        public String recuperarMensajes(){
     
            
                    try
   {
        Scanner lector = new Scanner( new File ( "Mensajes.txt" ) );

        while( lector.hasNext( ) ) 
        {
            
            String nuevaLinea = lector.nextLine( );

             
            StringTokenizer tokenizer = new
                     StringTokenizer( nuevaLinea, "-" );
            String destino = tokenizer.nextToken( );
            String correo = tokenizer.nextToken( );
            String asunto = tokenizer.nextToken( );
             String mensaje = tokenizer.nextToken( );
             
            
 //           System.out.println(comp.buscarCorreo(destino));
 //            System.out.println(comp.buscarCorreo(correo));
            
             if (destino.equalsIgnoreCase(logueado.getCorreo()))
             {
//                  System.out.println("PARA : "+destino+" DE : "+correo+" ASUNTO: "+asunto+ " MENSAJE :"+mensaje);
              respuesta+="PARA : "+destino+" DE : "+correo+" ASUNTO: "+asunto+ " MENSAJE :"+mensaje+"*";
             }
             
           //  System.out.println(destino+correo+asunto+mensaje);
             
             //mensajes.add(new Mensajes(comp.buscarCorreo(destino), logueado, asunto, mensaje));
            }
   }catch (FileNotFoundException ex) {
           System.exit(1);
        }
            //System.out.println(mensajes.toString());
            return respuesta;
           
        }
        
        
        
        
        
    

    public ArrayList<String> getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList<String> mensajes) {
        this.mensajes = mensajes;
    }

    public Usuario getLogueado() {
        return logueado;
    }

    public void setLogueado(Usuario logueado) {
        this.logueado = logueado;
    }

    
}
