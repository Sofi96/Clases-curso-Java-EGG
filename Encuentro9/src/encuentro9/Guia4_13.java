/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro9;

import java.util.Scanner;

/**
 *
 * @author Sofi
 */
public class Guia4_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        String [] equipo= new String [3];
        
        for (int i = 0; i < 3; i++) {
            
            System.out.println("Ingrese su nombre compa nº " + (i+1));
            equipo [i]= leer.nextLine();
            
        }
        
        for (int i = 0; i < 3; i++) {
            
            System.out.println(equipo[i] + " ");
                       
        }
    }
    
}
