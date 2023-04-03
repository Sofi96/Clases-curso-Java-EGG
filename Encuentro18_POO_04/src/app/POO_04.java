/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import Entidades.Rectangulo;

/**
 *
 * @author Sofi
 */
public class POO_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Rectangulo r1= new Rectangulo();
        
        r1.crearRectangulo();
        
        System.out.println("El perimetro es: " + r1.perimetro());
        System.out.println("Ls superficie es: " + r1.superficie());
        
        r1.dibujar();
        
    }
    
}
