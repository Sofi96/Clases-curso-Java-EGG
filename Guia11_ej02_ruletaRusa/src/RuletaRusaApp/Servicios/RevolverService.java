/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RuletaRusaApp.Servicios;

import RuletaRusaApp.Entidades.RevolverDeAgua;
import java.util.Random;

/**
 *
 * @author Sofi
 */
public class RevolverService {
    
    public void llenarRevolver (RevolverDeAgua r){
        Random random = new Random();
        
        r.setPosicionActual(random.nextInt(6) + 1);
        r.setPosicionAgua(random.nextInt(6) + 1);
        
    }
    
    public boolean mojar(RevolverDeAgua r){
        boolean m;
        if (r.getPosicionActual()==r.getPosicionAgua()) {
            m=true;
        }else {
            m=false;
        }
        
        return m;
    }
    
    public void siguienteChorro (RevolverDeAgua r){
        int pa= r.getPosicionActual();
        
        if (pa== 1 || pa== 2 || pa== 3 || pa== 4 || pa== 5){
           r.setPosicionActual(pa+1);
        }else if (pa==6) {
            r.setPosicionActual(1);
        }
    }
    
    
}
