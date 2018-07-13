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
public class Mensajes {
   private String contenido, asunto;
   private Usuario origen, destino;

    public Mensajes(Usuario origen, Usuario destino, String asunto, String contenido) {
        this.contenido = contenido;
        this.origen = origen;
        this.destino = destino;
        this.asunto = asunto;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
public String getAsunto() {
        return asunto;
    }

    
    public Usuario getOrigen() {
        return origen;
    }

    public void setOrigen(Usuario origen) {
        this.origen = origen;
    }

    public Usuario getDestino() {
        return destino;
    }

    public void setDestino(Usuario destino) {
        this.destino = destino;
    }
    
    
}
