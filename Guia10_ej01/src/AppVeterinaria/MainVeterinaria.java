/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppVeterinaria;

import Servicios.ServiceGenera;

/**
 *
 * @author Sofi
 */
public class MainVeterinaria {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServiceGenera sg= new ServiceGenera();

        sg.listaRazas();
        
        sg.eliminarRaza();
        
        sg.mostrarListaRazas();
        
        
    }
    
}
