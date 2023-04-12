/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaService;

/**
 *
 * @author Sofi
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       CuentaBancariaService cs = new CuentaBancariaService();
       
       CuentaBancaria cuenta1= cs.crearCuentaBancaria();
       
       System.out.println(cuenta1);
        
       /*
       cs.ingresar(cuenta1);
       
       System.out.println(cuenta1);
       
       cs.retirar(cuenta1);
       
       System.out.println(cuenta1);
       
       
       
       cs.extraccionRapida(cuenta1);
       
       System.out.println(cuenta1);
*/
       
        System.out.println("Su saldo actual es de: " + cs.consultarSaldo(cuenta1));
        
        cs.consultarDatos(cuenta1);
    }
    
    
}
