/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author Granda
 */
public class Federacion {
    private String nombre;
    private Confederacion confederacion;
    private String deporte;
    
    
    //Constructores
    public Federacion(String n, Confederacion c, String d){
        establecerNombre(n);
        establecerConfederacion(c);
        establecerDeporte(d);
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    public void establecerConfederacion(Confederacion c){
        confederacion = c;
    }
    public void establecerDeporte(String d){
        deporte = d;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public Confederacion obtenerConfederacion(){
        return confederacion;
    }
    public String obtenerDeporte(){
        return deporte;
    }
    public String toString(){
        String cadena = String.format("Federacion: \n\tNombre: %s\n\t"
                + "Confederacion: %s\n\tDeporte: %s\n\t",
               obtenerNombre(), obtenerConfederacion().obtenerNombre(),
               obtenerDeporte());
        
        return cadena;
   }
}
