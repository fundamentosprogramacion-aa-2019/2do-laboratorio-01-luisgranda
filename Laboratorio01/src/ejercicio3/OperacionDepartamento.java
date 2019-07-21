/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author carlo
 */
public class OperacionDepartamento {
    
    
    public double obtenerSumaPresuspuestos(DepartamentoMunicipal[] departamentos){
        double sumaPresuspuestos = 0;
        
        for (int i = 0; i < departamentos.length; i++) {           
            sumaPresuspuestos += (double)departamentos[i].obtenerPresupuesto();
        }
        return sumaPresuspuestos;       
    }
    
    
    public double obtenerPromedioEdades(DepartamentoMunicipal[] departamentos){
        double sumaEdades = 0;
        double promedio;
        for (int i = 0; i < departamentos.length; i++) {           
            sumaEdades += (double)departamentos[i].obtenerJefe().obtenerEdad();
        }
        
        promedio = sumaEdades / departamentos.length;
        return promedio;
    }
    
}
