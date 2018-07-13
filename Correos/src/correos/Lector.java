/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correos;

import java.io.*;
import java.util.*;
/**
 *
 * @author Felipe Cabeza @felipecabeza16
 */
public class Lector {
    ArrayList<Usuario> usuarios;
    public Lector(){
        usuarios = new ArrayList<Usuario>();
        leerUsuarios();
        
    }

    public void leerUsuarios() {

    
       

        try
   {
        Scanner lector = new Scanner( new File ( "Registrados.txt" ) );

        while( lector.hasNext( ) ) 
        {
            
            String nuevaLinea = lector.nextLine( );

             
            StringTokenizer tokenizer = new
                     StringTokenizer( nuevaLinea, "-" );
            String correo = tokenizer.nextToken( );
            String contraseña = tokenizer.nextToken( );
            String nombre = tokenizer.nextToken( );
             
            try
            {
               int edad =
                   Integer.parseInt( tokenizer.nextToken( ) );
             

               Usuario tmp = new Usuario(nombre,correo , contraseña,edad );

               // add FlightRecord obj to listFlightRecords
               usuarios.add( tmp );
            }

           catch ( NumberFormatException nfe )
           {
                System.exit(1);
           }
       }

      // release resources associated with flights.txt
      lector.close();
   }

   catch ( FileNotFoundException fnfe )
   {
     System.exit(0);
   }

   catch ( IOException ioe )
   {
     ioe.printStackTrace( );
   }

    }
    
}
