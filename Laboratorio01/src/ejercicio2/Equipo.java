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
public class Equipo {
    private String nombre;
    private Federacion federacion;
    private int numCampeonatos;
    
    
    
    //Constructor
    public Equipo(String a, Federacion fe, int n){
        establecerNombre(a);
        establecerFederacion(fe);
        establecerNumCampeonatos(n);
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    public void  establecerFederacion(Federacion f){
        federacion = f;
    }
    public void establecerNumCampeonatos(int n){
        numCampeonatos = n;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public Federacion obtenerFederacion(){
        return federacion;
    }
    public int obtenerNumCampeonatos(){
        return numCampeonatos;
    }
    @Override
    public String toString(){
        String cadena = String.format("Equipo: \n\tNombre: %s\n\t"
                + "Federacion: %s\n\tNum_Campeonatos: %s\n\t",
               obtenerNombre(), obtenerFederacion().obtenerNombre(),
               obtenerNumCampeonatos());
        
        return cadena;
   }
}
