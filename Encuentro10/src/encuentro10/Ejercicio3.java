/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro10;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Sofi
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     * 
     * Recorrer un vector de N enteros contabilizando cuántos números son de 1 
     * dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).

     */
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        Random rd = new Random();
        int longi, contador1=0, contador2=0, contador3=0, contador4=0, contador5=0;
        String numero;
        
        
        System.out.println("Ingrese el tamaño del vector:");
        int n = leer.nextInt();
        
        int [] vector = new int [n];
        
        
        
        for (int i = 0; i < n; i++) {
            vector [i]= (int) rd.nextInt(20000);
            System.out.print(vector[i] + " ");
        }
        
        for (int i = 0; i < n; i++) {
            
           numero= Integer.toString(vector[i]);
           longi= numero.length();
           
            if (longi==1) {
                contador1 += 1;
            } else if (longi==2) {
                contador2+= 1;
            } else if (longi==3) {
                contador3+= 1;
            }else if (longi==4) {
                contador4+=1;
            }else if (longi==5) {
                contador5 +=1;
            }
                
        }
        
        System.out.println("Hay: ");
        System.out.println(contador1 + " números de 1 cifra");
        System.out.println(contador2 + " números de 2 cifras");
        System.out.println(contador3 + " números de 3 cifras");
        System.out.println(contador4 + " números de 4 cifras");
        System.out.println(contador5 + " números de 5 cifras");
    }
    
}
