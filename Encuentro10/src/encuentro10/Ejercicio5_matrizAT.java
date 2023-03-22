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
 * @author Cristian
 */
public class Ejercicio5_matrizAT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        Random rd= new Random();
        
        int [][] matriz = new int [3][3];
        int [][] trans = new int [3][3];
        
        matriz [0][0] = 0;
        matriz [0][1] = -2;
        matriz [0][2] = 4;        
        matriz [1][0] = 5;
        matriz [1][1] = 0;
        matriz [1][2] = 2;
        matriz [2][0] = -4;
        matriz [2][1] = -2;
        matriz [2][2] = 0;
        
        System.out.println("Matriz A");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               trans[i][j]=matriz[j][i];
                System.out.print("[" + matriz[i][j] + "]");
               
                
            }
            System.out.println(" ");
        
        }
        System.out.println("Matriz AT");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + trans[i][j] + "]");
                
            }
            System.out.println(" ");
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                if (matriz[i][j] != -(trans[i][j]) ) {
                    System.out.println("La matriz no es antisimetrica");
                    break;
                }else if(matriz[2][2] == -(trans[2][2])&& i==2 && j==2 ){   
                    System.out.println("La matriz es antisimetrica");
                    
                }
                
            }
            
        }
        
    }
    
}
