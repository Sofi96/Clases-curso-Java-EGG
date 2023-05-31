/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RuletaRusaApp.Servicios;

import RuletaRusaApp.Entidades.RevolverDeAgua;

/**
 *
 * @author Sofi
 */
public class JugadorService {
    
    private RevolverService rs;
    
    
//    
//    disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
//mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
//revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
//devuelve true, sino false.
    
    public boolean disparo(RevolverDeAgua r){
        
        boolean m=rs.mojar(r);
        rs.siguienteChorro(r);
        
        
        return m;
    }
}
