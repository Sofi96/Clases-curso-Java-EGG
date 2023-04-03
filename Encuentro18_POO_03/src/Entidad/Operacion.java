/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */

public class Operacion {
    Scanner leer = new Scanner (System.in);
    
    private double num1;
    private double num2;
    

    //CONSTRUCTOR CON ATRIBUTOS
    
    public Operacion(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    //CONSTRUCTOR SIN ATRIBUTOS
    
    public Operacion (){
        
    }
    
    //GETTER Y SETTER

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    //METODOS PROPIOS
    
    public void crearOperacion(){
        System.out.println("Ingrese el primer numero");
        this.num1 = leer.nextDouble();
        System.out.println("Ingrese el segundo numero");
        this.num2 = leer.nextDouble();
    }
    
    public double suma(){
        double suma = num1 + num2;
        return suma;
    }
    
    public double resta(){
        double resta = num1 - num2;
        return resta;
        
        }
    
    public double multiplicacion(){
        double multiplicacion;
        
        if (num1 ==0 || num2 ==0) {
            System.out.println("error al multiplicar por cero");
            multiplicacion = 0;
            
                    
            
        }else {
           multiplicacion = num1*num2;
        }
        
        return multiplicacion;
    }
    
    public double division(){
        double division;
        
        if (num1 ==0 || num2 ==0) {
            System.out.println("error al dividir por cero");
            division = 0;
            
                    
            
        }else {
           division = num1/num2;
        }
        
        return division;
    }
        
        
    
        
        
}
