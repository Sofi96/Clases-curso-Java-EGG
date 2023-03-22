/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro8;

import java.util.Scanner;

/**
 *
 * @author Sofi
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     * 
     * Diseñe una función que pida el nombre y la edad de N personas e imprima los 
     * datos de las personas ingresadas por teclado e indique si son mayores o 
     * menores de edad. Después de cada persona, el programa debe preguntarle al 
     * usuario si quiere seguir mostrando personas y frenar cuando el usuario 
     * ingrese la palabra “No”.

     */
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        
        datos ();
        
    }
 
    public static void datos (){
        
        Scanner leer=new Scanner (System.in);
        String seguir;
        String datos="Los datos ingresados son:";
        String legalidad;
        String nom;
        int edad;
        
        System.out.println("Para comenzar presione enter");
        do {
            
            
            leer.nextLine();
            System.out.println("Ingrese el nombre");
            nom=leer.nextLine();
           
                                  
            System.out.println("Ingrese la edad de "+ nom);
            edad=leer.nextInt();
            
            
            
            if (edad>=18) {
                
                legalidad= "Mayor de edad";
            }else {
                legalidad= "Menor de edad";
            }
            
            
            datos= datos.concat( "\n"  + nom + "   "+ edad + " años. "+ legalidad);
            
            
            
            System.out.println("Desea continuar ingresando datos? (si/no)");
            seguir=leer.next();
            
                  
            
        } while (seguir.equalsIgnoreCase("si"));
        
        
        System.out.println(datos);
    }
}
