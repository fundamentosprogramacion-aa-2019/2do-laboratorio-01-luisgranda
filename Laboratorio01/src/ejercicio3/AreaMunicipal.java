/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author Granda
 */
public class AreaMunicipal {
    private String nombre;
    private Persona directorArea;
    private Municipio municipio;
    
    //Constructor 
    public AreaMunicipal(String n, Persona p, Municipio m){
        establecerNombre(n);
        establecerDirectorArea(p);
        establecerMunicipio(m);
        
    }
    
    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerDirectorArea(Persona d) {
        directorArea = d;
    }

    public void establecerMunicipio(Municipio m) {
        municipio = m;
    }

    public String obtenetNombre() {
        return nombre;
    }

    public Persona obtenetDirectorArea() {
        return directorArea;
    }

    public Municipio obtenetMunicipio() {
        return municipio;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Area Municipal: \n\tNombre: %s\n\t"
                + "Director: %s\n\tMunicipio: %s\n\t",
               obtenetNombre(), 
               obtenetDirectorArea().obtenerNombre(),
               obtenetMunicipio().obtenerNombre());
        
        return cadena;
   }
    
}
