/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro.pkg5;

import java.util.Scanner;

/**
 *
 * @author Sofi
 */
public class Guia5_DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        double num, contador=1, suma=0;
        
        do {
            System.out.println("Ingrese un numero positivo");
            num=leer.nextDouble();
            
            contador=contador+1;
                    
            if (num==0) {
                System.out.println("Se capturó el número cero");
                break;
            }
            
            if (num>0) {
                suma=suma+num;
            }
        
        } while (contador<=20);
        
        System.out.println("La suma es de " + suma);
        
                
    }
    
    
}
