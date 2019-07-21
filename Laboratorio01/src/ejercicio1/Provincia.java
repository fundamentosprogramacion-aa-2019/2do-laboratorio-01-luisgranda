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
public class Provincia {
    private String nombre;
    private Region region;
    //Constructor
    public Provincia(String n, Region a){
        establecerNombre(n);
        establecerRegion(a);
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    public void establecerRegion(Region a){
        region = a;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public Region obtenerRegion(){
        return region;
    }
    public String toString(){
        String cadena = String.format("Provincia:%s\n\tNombre:%s\n\tRegion:",
                obtenerNombre(),
                obtenerRegion().obtenerNombre());
        return cadena;
    }
}
