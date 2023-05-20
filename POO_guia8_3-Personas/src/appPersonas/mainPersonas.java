/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appPersonas;

import Entidades.Persona;
import Servicios.PersonaService;
import java.util.Scanner;

/**
 *
 * @author Sofi
 */
public class mainPersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String estado= "";
        PersonaService ps= new PersonaService();
        Scanner leer= new Scanner(System.in).useDelimiter("\n");
        
        Persona persona1= ps.crearPersona();
      switch (ps.calcularIMC(persona1)) {
          case -1: estado= "bajo peso";
          break;
          case 0: estado= "peso ideal";
          break;
          case 1: estado= "sobrepeso";
          break;   
      }
        System.out.println("El estado de IMC de la persona ingresada es: " + estado);
        if (ps.esMayorDeEdad(persona1)) {
            System.out.println("La persona es mayor de edad");
        }else {
            System.out.println("La persona es menor de edad");
        }
        
        Persona persona2= ps.crearPersona();
        Persona persona3= ps.crearPersona();
        Persona persona4= ps.crearPersona();
        
        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);
        System.out.println(persona4);
        
        
        
    }
    
}
