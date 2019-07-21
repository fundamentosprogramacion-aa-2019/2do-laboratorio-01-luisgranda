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
public class DepartamentoMunicipal {
    private String nombre;
    private AreaMunicipal area;
    private double presupuesto;
    private Persona jefe;
    
    //Constructor
    public DepartamentoMunicipal(String n, AreaMunicipal a, 
            double p, Persona pe){
        establecerNombre(n.toUpperCase());
        establecerArea(a);
        establecerPresupuesto(p);
        establecerJefe(pe);
        
    }
    
    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerArea(AreaMunicipal a) {
        area = a;
    }

    public void establecerPresupuesto(double p) {
        presupuesto = p;
    }

    public void establecerJefe(Persona j) {
        jefe = j;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public AreaMunicipal obtenerArea() {
        return area;
    }

    public double obtenerPresupuesto() {
        return presupuesto;
    }

    public Persona obtenerJefe() {
        return jefe;
    }
    @Override
    public String toString(){
        String cadena = String.format("Departamento Municipal: \n\tNombre: %s\n\t"
                + "Area Municipal: %s\n\tPresupuesto: %s\n\t"
                + "Jefe: %s %s\n\t",
               obtenerNombre(), 
               obtenerArea().obtenetNombre(),
               obtenerPresupuesto(),
               obtenerJefe().obtenerNombre(),obtenerJefe().obtenerApellido());
        
        return cadena;
   }
    
    
}
