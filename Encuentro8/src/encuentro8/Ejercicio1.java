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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     * 
     * Crea una aplicación que le pida dos números al usuario y este pueda elegir 
     * entre sumar, restar, multiplicar y dividir. La aplicación debe tener una 
     * función para cada operación matemática y deben devolver sus resultados para 
     * imprimirlos en el main. 
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        int num1, num2;
        String opc;
        
        System.out.println("Ingrese un numero");
        num1=leer.nextInt();
        System.out.println("Ingrese un numero");
        num2=leer.nextInt();
        
        menu (num1, num2);
        
        
        
    }
    
    public static void menu (int num1, int num2) {
        int opcion;
        Scanner leer= new Scanner (System.in);
        
        System.out.println("MENÚ ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
       
        System.out.println("Elija una opción: ");
        opcion= leer.nextInt();
        
       switch (opcion) {
           case 1: 
               int suma= suma (num1, num2);
               System.out.println("La suma es: " + suma);
               break;
           case 2: 
               int resta= resta (num1, num2);
               System.out.println("La resta es: " + resta);
               break;
           case 3: 
               int multiplicacion= multiplicacion(num1, num2);
               System.out.println("La multiplicacion es: "+ multiplicacion);
               break; 
           case 4: 
               int division= division (num1, num2);
               System.out.println("La division es: " + division);
               break;
               
       }
        
  
    }
    
    public static int suma (int num1, int num2) {
        
        int resultado= num1+num2;
        
        return resultado;
    }
    
    public static int resta (int num1, int num2) {
        
        int resultado= num1-num2;
        
        return resultado;
    }
    
    public static int multiplicacion (int num1, int num2) {
        
        int resultado= num1*num2;
        
        return resultado;
    }
    
    public static int division (int num1, int num2) {
        
        int resultado= num1/num2;
        
        return resultado;
    }
}
