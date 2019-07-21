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
public class Principal {
    public static void main(String[] args){
        
        
        Confederacion c1 = new Confederacion("Asiática", "AFC");
        Confederacion c2 = new Confederacion("Africana", "CAF");
        Confederacion c3 = new Confederacion("Oceanía", "OFC");
        Confederacion c4 = new Confederacion("Europea", "UEFA");
        
        Federacion f1 = new Federacion("Australia", c1, "Fútbol");
        Federacion f2 = new Federacion("Japón", c1, "Fútbol");
        Federacion f3 = new Federacion("Egipto", c1, "Fútbol");
        Federacion f4 = new Federacion("Camerún", c1, "Fútbol");
        Federacion f5 = new Federacion("Thonga", c1, "Fútbol");
        Federacion f6 = new Federacion("Vanuatu", c1, "Fútbol");
        Federacion f7 = new Federacion("Alemania", c1, "Fútbol");
        Federacion f8 = new Federacion("Rusia", c1, "Fútbol");
        
        Equipo eq1 = new Equipo("Melbourne Victory", f1, 12);
        Equipo eq2 = new Equipo("Newcastle United Jets", f1, 2);
        Equipo eq3 = new Equipo("Kawasaki", f2, 6);
        Equipo eq4 = new Equipo("Kashima", f2, 21);
        Equipo eq5 = new Equipo("Al-Ahly", f3, 20);
        Equipo eq6 = new Equipo("Pyramids FC", f3, 1);
        Equipo eq7 = new Equipo("Coton Sport", f4, 14);
        Equipo eq8 = new Equipo("Feutcheu FC", f4, 1);
        Equipo eq9 = new Equipo("Veitongo FC", f5, 2);
        Equipo eq10 = new Equipo("Tafea FC", f6, 4);
        Equipo eq11 = new Equipo("Bayern de Múnich", f7, 29);
        Equipo eq12 = new Equipo("F.C Zenit", f8, 5);
        
        Equipo [] equipos = new Equipo[12];
        equipos [0] = eq1;
        equipos [1] = eq2;
        equipos [2] = eq3;
        equipos [3] = eq4;
        equipos [4] = eq5;
        equipos [5] = eq6;
        equipos [6] = eq7;
        equipos [7] = eq8;
        equipos [8] = eq9;
        equipos [9] = eq10;
        equipos [10] = eq11;
        equipos [11] = eq12;
        
        OperacionEquipo operacion = new OperacionEquipo(equipos);
        operacion.establecerSumaCampeonatos();
        
        for(int i = 0; i < equipos.length; i++){
            System.out.println(equipos[i]);
        }
        
        System.out.println(operacion);
        
        
    }
    
}
