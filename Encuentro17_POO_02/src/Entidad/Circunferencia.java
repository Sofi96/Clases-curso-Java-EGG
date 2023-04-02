/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Sofi
 */
public class Circunferencia {
    Scanner leer= new Scanner (System.in);
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public Circunferencia() {
    }

    
//GETTER Y SETTER:
    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    
//MÉTODOS PROPIOS:

    public void crearCircunferencia() {
        
        System.out.println("Ingrese el radio");
        double rd= leer.nextDouble();
        rd=radio;
      
    }
    public double area (){
        
        double area= 3.14 * (Math.pow(radio, 2));
        return area;
    }
}
