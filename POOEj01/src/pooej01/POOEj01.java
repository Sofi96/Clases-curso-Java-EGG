/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Sofi
 */
public class POOEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        Persona usuario1 = new Persona();
        Persona usuario2 = new Persona("Cristian");
        Persona usuario3 = new Persona("Morena", 17, "divorciada");

//  CUANDO ES PUBLIC:
//        usuario1.nombre = "Sofia";
//        usuario1.edad= 27 ;
//        usuario1.estadoCivil= "soltera";
//        
//        System.out.println("Persona 1: " + usuario1.nombre + "\n"+ "Persona 2: " + usuario2.nombre + "\n"+ "Persona 3: "+ usuario3.nombre + " " + usuario3.estadoCivil);


//   CUANDO ES PRIVATE:         

//Setters:
        usuario1.setNombre("Sofia");
        usuario1.setEdad(27);
        usuario1.setEstadoCivil("soltero");
        
        usuario2.setEdad (29);
        usuario2.setEstadoCivil("soltero");
        
        usuario3.setEstadoCivil("soltera");
//Getters:        
        System.out.println("Usuario uno de forma manual: ");
        System.out.println("nombre: " + usuario1.getNombre());
        System.out.println("nombre: " + usuario1.getEdad());
        System.out.println("nombre: " + usuario1.getEstadoCivil());
        System.out.println(" ");
        System.out.println("Usuario dos y tres con 'TO STRING'");
        System.out.println(usuario2);
        System.out.println(usuario3);
    }

}
