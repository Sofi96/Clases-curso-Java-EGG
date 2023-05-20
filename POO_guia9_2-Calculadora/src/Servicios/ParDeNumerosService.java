/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.ParDeNumeros;
import static java.lang.Math.abs;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.round;
import static java.lang.Math.sqrt;

/**
 *
 * @author Sofi
 */
public class ParDeNumerosService {
    
    public void mostrarValores (ParDeNumeros p){
        
        System.out.println("Numero 1: " + p.getNum1());
        System.out.println("Numero 2: " + p.getNum2());
    }
    
    public double devolverMayor (ParDeNumeros p){
        double mayor;
        
        mayor= max(p.getNum1(),p.getNum2());
               
        return mayor;
    }
    
    public double calcularPotencia (ParDeNumeros p){
        
        double mayor= round(devolverMayor(p));
        double menor= round(min(p.getNum1(),p.getNum2()));
        
        double potencia= Math.pow(mayor,menor);
        return potencia;
        
    }
    public double calcularRaiz (ParDeNumeros p){
        double menor= round(min(p.getNum1(),p.getNum2()));
        
        return sqrt(abs(menor));
    }
    
}
