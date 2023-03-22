/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro11;

import java.util.Scanner;

/**
 *
 * @author Sofi
 */
public class Ejercicioextra1 {

    /**
     * @param args the command line arguments
     * 
     * Realizar un algoritmo que calcule la suma de todos los elementos de un 
     * vector de tamaño N, con los valores ingresados por el usuario.

     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int suma=0;
        
        
        System.out.println("Ingrese el tamaño del vector");
        int n= leer.nextInt();
        
        int [] vector= new int [n];
        for (int i = 0; i < n; i++) {
            
            System.out.println("Ingrese el "+ (i+1) + "º número del vector");
            vector[i]= leer.nextInt();
            
            
        }
        
        for (int i = 0; i < n; i++) {
            
            System.out.print("["+ vector[i]+ "]");
            suma+= vector[i];
            
        }
        
        System.out.println("La suma de los elementos del vector es: "+ suma);
        
    }
    
}
