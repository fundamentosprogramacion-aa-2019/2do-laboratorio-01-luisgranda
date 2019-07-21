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
public class Ciudad {
    private String nombre;
    private int poblacion;
    private Provincia provincia;
    
    //Constructor
    public Ciudad(String n, int v, Provincia a){
        establecerNombre(n);
        establecerPoblacion(v);
        establecerProvincia(a);
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    public void establecerPoblacion(int v){
        poblacion = v;
    }
    public void establecerProvincia(Provincia a){
        provincia = a;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public int obtenerPoblacion(){
        return poblacion;
    }
    public Provincia obtenerProvincia(){
        return provincia;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Ciudad: \n\tNombre:%s\n\tPoblacion"
                + ":%s\n\tProvincia:%s\n\tRegion: %s", obtenerNombre(),
                obtenerPoblacion(),
                obtenerProvincia().obtenerNombre(),
                obtenerProvincia().obtenerRegion().obtenerNombre());
        return cadena;
    }
}
/*public String toString(){
        String cadena = String.format("Entrenador:%n\tNombre:%s\n\t"
                + "Deporte:%s\n\tEquipo: %s\n\tProvincia: %s\n", 
                obtenerNombre(), obtenerDeporte(), 
                obtenerEquipo().obtenerNombre(), 
                obtenerEquipo().obtenerCiudad().obtenerProvincia());
        return cadena;
    }*/