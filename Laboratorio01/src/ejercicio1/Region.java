/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Granda
 */
public class Region {
    private String nombre;
    
    //Constructor
    public Region(String n){
        establecerNombre(n);
    }
    
    public void establecerNombre(String n){
       nombre = n;
    }
    public String obtenerNombre(){
       return nombre;
    }
    public String toString(){
        String cadena = String.format("Region: \n\tNombre: %s\n\t",
               obtenerNombre());
        
        return cadena;
   }
}
