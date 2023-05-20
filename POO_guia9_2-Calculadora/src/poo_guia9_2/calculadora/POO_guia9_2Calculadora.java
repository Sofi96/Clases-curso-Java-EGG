/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_guia9_2.calculadora;

import Entidades.ParDeNumeros;
import Servicios.ParDeNumerosService;

/**
 *
 * @author Sofi
 */
public class POO_guia9_2Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ParDeNumerosService pns= new ParDeNumerosService();
        ParDeNumeros p1= new ParDeNumeros();
        
        pns.mostrarValores(p1);
        System.out.println("mayor: " + pns.devolverMayor(p1));
        System.out.println("potencia: " + pns.calcularPotencia(p1));
        System.out.println("raiz: " + pns.calcularRaiz(p1));
        
        
    }
    
}
