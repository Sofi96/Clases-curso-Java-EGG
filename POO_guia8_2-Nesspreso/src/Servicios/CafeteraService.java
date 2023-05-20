/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Sofi
 */
public class CafeteraService {
    
    private Scanner leer= new Scanner(System.in).useDelimiter("\n");
    
    public void llenarCafetera(Cafetera c){
      //  : hace que la cantidad actual sea igual a la capacidad máxima. 
      
      c.setCantidadActual(c.getCapacidadMáxima());
    }
    
    public void servirTaza (Cafetera c) {
        
        System.out.println("Ingrese el tamaño de la taza a llenar");
        int taza= leer.nextInt();
        
        if (taza<= c.getCantidadActual()) {
           c.setCantidadActual(c.getCantidadActual()-taza);
        }else {
            System.out.println("La taza se llenó con la cantidad de café restante en la cafetera: " + c.getCantidadActual() + " ml");
            c.setCantidadActual(0);
        }
    }
    
    public void vaciarCafetera (Cafetera c){
        c.setCantidadActual(0);
    }
    
    public void agregarCafe (Cafetera c) {
        System.out.println("Indique la cantidad de café a agregar");
        int cafeAgregado = leer.nextInt();
        
        int actual =c.getCantidadActual();
        int maxima = c.getCapacidadMáxima();
        if ((cafeAgregado+actual)> maxima) {
            System.out.println("La cafetera se llenó hasta el límite");
            c.setCantidadActual(maxima);
        }else {
            c.setCantidadActual(actual+ cafeAgregado);
            System.out.println("La cantidad disponible de café es de: " + c.getCantidadActual()+ " ml");
        }
    }
}
