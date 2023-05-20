/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppFrase;

import Entidades.Cadena;
import Servicios.CadenaService;

/**
 *
 * @author Sofi
 */
public class mainCadena{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CadenaService cs= new CadenaService();
        Cadena c1= new Cadena ("casa blanca");
        
        
        System.out.println(cs.contiene(c1, "f"));
       
    }
    
}
