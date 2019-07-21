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
public class OperacionEquipo {
    private Equipo [] losEquipos;
    private int sumaCampeonatos;
    
    public OperacionEquipo(Equipo [] Equipos){
        losEquipos = Equipos;
    }
    public void establecerLosEquipos(Equipo[] ents){
        losEquipos = ents;
    }
    public void establecerSumaCampeonatos(){
        int suma = 0;
        for (int i = 0; i < losEquipos.length; i++ ){
            suma = suma + losEquipos[i].obtenerNumCampeonatos();
        }
        sumaCampeonatos = (int) suma;
    }
    public Equipo[] obtenerLosEquipos(){
        return losEquipos;
    }
    public int obtenerSumaCampeonatos(){
        return sumaCampeonatos;
    }
    @Override
    public String toString(){
        String cadena = String.format("Suma Campeonatos: %s\n",
                obtenerSumaCampeonatos());
        return cadena;
    }
}
