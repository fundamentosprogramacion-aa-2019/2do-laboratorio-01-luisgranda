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
public class Confederacion {
    private String nombre;
    private String siglas;
    
    
    //Constructor
    public Confederacion(String n, String s){
        establecerNombre(n);
        establecerSiglas(s);
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    public void establecerSiglas(String s){
        siglas = s;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public String obtenerSiglas(){
        return siglas;
    }
    public String toString(){
        String cadena = String.format("Confederacion: \n\tNombre: %s\n\t"
                + "Siglas: %s\n\t",
               obtenerNombre(), obtenerSiglas());
        
        return cadena;
   }
}
