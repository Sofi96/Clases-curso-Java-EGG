/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Sofi
 */
public class Rectangulo {
    Scanner leer = new Scanner(System.in);
    
    private double base;
    private double altura;

//CONSTRUCTORES
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public Rectangulo() {
    }
    
//SETTERS Y GETTERS

    public void setBase(double base) {
        this.base = base;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }
    public double getAltura() {
        return altura;
    }
    
//METODOS PROPIOS
    
    public void crearRectangulo(){
        System.out.println("Ingrese la base del rectángulo");
        this.base= leer.nextDouble();
        System.out.println("Ingrese la altura del rectángulo");
        this.altura= leer.nextDouble();
    }
    
    
    public double superficie() {
        double superficie = base*altura; 
        return superficie;
    }
    public double perimetro() {
        double perimetro = (base+altura)*2; 
        return perimetro;
    }
    
    //dibujar el contorno del rectangulo
    public void dibujar (){
        
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i==0 || j==0 || i==altura-1 || j==base-1) {
                   System.out.print("*"); 
                }else {
                     System.out.print(" ");
                }      
            }
            System.out.println(" ");
        }
    }
}
