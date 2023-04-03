/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej3;

import Entidad.Operacion;

/**
 *
 * @author Cristian
 */
public class Encuentro18POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Operacion op1= new Operacion();
        
        op1.crearOperacion();
        
        System.out.println("la suma de los numeros ingresados es: " + op1.suma());
        
        System.out.println("la resta de los numeros ingresados es: " + op1.resta());
        
        System.out.println("la multiplicacion de los numeros ingresados es: " + op1.multiplicacion());
        
        System.out.println("la division de los numeros ingresados es: " + op1.division());
        
        
        
    }
    
}
