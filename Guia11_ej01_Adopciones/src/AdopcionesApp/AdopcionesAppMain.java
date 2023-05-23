/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdopcionesApp;

import AdopcionesApp.Entidades.Perro;
import AdopcionesApp.Entidades.Persona;

/**
 *
 * @author Sofi
 */
public class AdopcionesAppMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1= new Persona ();
        Persona p2= new Persona ();
        
        Perro m1= new Perro("Mara", "Ovejero", 5, "mediano");
        Perro m2= new Perro("Luli", "caniche", 9, "chico");
        
        p1.setNombre("Roxana");
        p1.setApellido("Blanes");
        p1.setDocumento(21857050);
        p1.setEdad(52);
        p1.setPerro(m2);
        
        p2.setNombre("Edgardo");
        p2.setApellido("Cassiani");
        p2.setDocumento(20757050);
        p2.setEdad(55);
        p2.setPerro(m1);
        
        System.out.println(p1);
        System.out.println("--------------------------------------------");
        System.out.println(p2);
        
        
        
        
    }
    
}
