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
public class Principal {
    public static void main(String[] args){
        
        //Personas
        Persona pe1 = new Persona("Jorge", "Bailon", 54);
        Persona pe2 = new Persona("Patricia", "Lopez", 35);
        Persona pe3 = new Persona("Robert", "Blacio", 36);
        Persona pe4 = new Persona("Maximo", "Quizhpe", 38);
        Persona pe5 = new Persona("Karla", "Gonzalez", 41);
        Persona pe6 = new Persona("Marco", "Leon", 29);
        Persona pe7 = new Persona("Andrea", "Bustamante", 30);
        Persona pe8 = new Persona("Mercy ", "Guerrero", 44);   
        
        //Creacion de tres ciudades
        Ciudad c1 = new Ciudad("Loja", "Loja");
        Ciudad c2 = new Ciudad("Quito", "Pichincha");
        Ciudad c3 = new Ciudad("Guayaquil", "Guayas");
        
        //Creacion de cuatro municipios
        Municipio m1 = new Municipio("Loja", c1);
        Municipio m2 = new Municipio("Catamayo", c1);
        Municipio m3 = new Municipio("Cumbaya", c2);
        Municipio m4 = new Municipio("Urdesa", c3);
        
        //Creacion de cinco Areas Municipales
        AreaMunicipal am1 = new AreaMunicipal("Nivel Politico", pe1, m1);
        AreaMunicipal am2 = new AreaMunicipal("Nivel Acesor", pe2, m2);
        AreaMunicipal am3 = new AreaMunicipal("Nivel de Apoyo", pe3, m3);
        AreaMunicipal am4 = new AreaMunicipal("Nivel Operativo", pe4, m4);
        AreaMunicipal am5 = new AreaMunicipal("Dependencias Generales", pe5, m4);
        
        DepartamentoMunicipal dm1 = new DepartamentoMunicipal("Alcaldia",
                am1, 4000, pe1);
        DepartamentoMunicipal dm2 = new DepartamentoMunicipal("Alacaldia-Secretaria",
                am1, 500, pe2);
        DepartamentoMunicipal dm3 = new DepartamentoMunicipal("Procuraduría Síndica",
                am2, 800, pe3);
        DepartamentoMunicipal dm4 = new DepartamentoMunicipal("Dirección Financiera",
                am3, 600, pe4);
        DepartamentoMunicipal dm5 = new DepartamentoMunicipal("Comisaría de Higiene",
                am4, 400, pe5);
        DepartamentoMunicipal dm6 = new DepartamentoMunicipal("Comisaría de Ornato",
                am4, 400, pe6);
        DepartamentoMunicipal dm7 = new DepartamentoMunicipal("Jefe de Cultura",
                am4, 550, pe7);
        DepartamentoMunicipal dm8 = new DepartamentoMunicipal("Jefe de Presupuesto",
                am5, 780, pe8);
        
        //Arreglo para emprimir las Ciudades
        DepartamentoMunicipal [] depMunicipales = new DepartamentoMunicipal[8];
        depMunicipales[0] = dm1;
        depMunicipales[1] = dm2;
        depMunicipales[2] = dm3;
        depMunicipales[3] = dm4;
        depMunicipales[4] = dm5;
        depMunicipales[5] = dm6;
        depMunicipales[6] = dm7;
        depMunicipales[7] = dm8;
        
        //For para imprimir las 10 ciudades con sus objetos 
        for(int i = 0; i < depMunicipales.length; i++){
            System.out.println(depMunicipales[i]);
        }
        
        OperacionDepartamento operacion = new OperacionDepartamento();
        System.out.printf("\nLa suma de presupuestos es: %.2f$",operacion.obtenerSumaPresuspuestos(depMunicipales));
        System.out.printf("\nEl promedio de edades es: %.2f años\n",operacion.obtenerPromedioEdades(depMunicipales));
    }
    
}
