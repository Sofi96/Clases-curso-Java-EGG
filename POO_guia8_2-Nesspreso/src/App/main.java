/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Entidades.Cafetera;
import Servicios.CafeteraService;

/**
 *
 * @author Sofi
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CafeteraService cs= new CafeteraService();
        Cafetera nesspreso = new Cafetera (5000,0);
        
        System.out.println(nesspreso);
        cs.llenarCafetera(nesspreso);
          System.out.println(nesspreso);
        cs.servirTaza(nesspreso);
          System.out.println(nesspreso);
        cs.agregarCafe(nesspreso);
          System.out.println(nesspreso);
        cs.vaciarCafetera(nesspreso);
          System.out.println(nesspreso);
        
    }
    
}
