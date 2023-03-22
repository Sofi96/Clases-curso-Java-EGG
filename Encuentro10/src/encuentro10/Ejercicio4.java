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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     * 
     * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios 
     * y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A 
     * se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        Random rd= new Random();
        
        int [][] matriz= new int [4][4];
        int [][] trans= new int [4][4];
        
        System.out.println("Matriz A");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                
                matriz[i][j]= (int) rd.nextInt(9);
                System.out.print("[" + matriz[i][j]+ "]");
            }
            System.out.println(" ");
        }
        
        System.out.println("Matriz B transpuesta");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                
                trans[i][j]= matriz[j][i];
                System.out.print("[" + trans[i][j]+ "]");
            }
            System.out.println(" ");
        }
    }
    
}
