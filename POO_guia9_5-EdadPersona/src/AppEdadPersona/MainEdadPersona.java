/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppEdadPersona;

import Entidades.Persona;
import Servicios.PersonaService;
import java.util.Scanner;

/**
 *
 * @author Sofi
 */
public class MainEdadPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        PersonaService ps=new PersonaService();
        
        Persona p1= ps.crearPersona();
        
        System.out.println(p1);
        
        System.out.println("La edad es: " + ps.calcularEdad(p1));
        
        System.out.println("Ingrese la edad de corte: ");
        int edad=leer.nextInt();
        
        if (ps.menorQue(p1, edad)) {
            System.out.println("Es menor que la edad de corte");
        } else{
            System.out.println("Es mayor que la edad de corte");
        }

    }
    
    
}
