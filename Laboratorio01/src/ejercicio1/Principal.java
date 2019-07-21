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
public class Principal {
    public static void main(String[] args){
        //Creacion de tres Regiones
        Region r1 = new Region("costa");
        Region r2 = new Region("Amazonia");
        Region r3 = new Region("Sierra");
        //Creacion de cinco Provincias
        Provincia p1 = new Provincia("Loja", r3);
        Provincia p2 = new Provincia("Guayas", r1);
        Provincia p3 = new Provincia("Pichincha", r3);
        Provincia p4 = new Provincia("Azuay", r3);
        Provincia p5 = new Provincia("Tungurahua", r2);
        //Creacion de 10 Ciudades
        Ciudad c1 = new Ciudad("Loja", 180000, p1);
        Ciudad c2 = new Ciudad("Cuenca", 388420, p4);
        Ciudad c3 = new Ciudad("Guayaquil", 2000291, p2);
        Ciudad c4 = new Ciudad("Ambato", 178538, p5);
        Ciudad c5 = new Ciudad("Macará", 18350, p1);
        Ciudad c6 = new Ciudad("Esmeraldas", 161868, p1);
        Ciudad c7 = new Ciudad("Machala", 241791, p1);
        Ciudad c8 = new Ciudad("Quito", 1000619, p3);
        Ciudad c9 = new Ciudad("Carchi", 164524, p1);
        Ciudad c10 = new Ciudad("Latacunga", 98355, p1);
        
        //Arreglo para emprimir las Ciudades
        Ciudad [] ciudades = new Ciudad[10];
        ciudades[0] = c1;
        ciudades[1] = c2;
        ciudades[2] = c3;
        ciudades[3] = c4;
        ciudades[4] = c5;
        ciudades[5] = c6;
        ciudades[6] = c7;
        ciudades[7] = c8;
        ciudades[8] = c9;
        ciudades[9] = c10;
        
        
        System.out.println("******* Ejercicio 1 *******");
        //For para imprimir las 10 ciudades con sus objetos 
        for(int i = 0; i < ciudades.length; i++){
            System.out.println(ciudades[i]);
        }
        //Operacion que permite imprimir el promedio de todas las poblaciones
        OperacionCiudad operacion = new OperacionCiudad(ciudades);
        operacion.PromedioPoblacion();
        System.out.println("***********************************");
        System.out.printf("Promedio de la Poblacion: %s\n",
                operacion.obtenerPromedioPoblacion());
        
    }
}
