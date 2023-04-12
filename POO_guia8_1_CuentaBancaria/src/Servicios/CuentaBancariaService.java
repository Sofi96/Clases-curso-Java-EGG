/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Sofi
 */
public class CuentaBancariaService {
    
    private Scanner leer= new Scanner(System.in).useDelimiter("\n");
    
    
    public CuentaBancaria crearCuentaBancaria (){
    
        System.out.println("Ingrese su Numero de cuenta");
        int numeroCuenta= leer.nextInt();
        
        System.out.println("Ingrese su dni");
        long dniCliente= leer.nextLong();
                      
        System.out.println("Ingrese su saldo");
        double saldoActual= leer.nextDouble();
                
        return new CuentaBancaria (numeroCuenta, dniCliente, saldoActual);
}
    
    public void ingresar(CuentaBancaria c){
        
        System.out.println("Indique el valor a ingresar");
        double valorIngresado= leer.nextDouble();
        
        double saldoActual= c.getSaldoActual();
        
        c.setSaldoActual(saldoActual + valorIngresado);               
        
    }
    
    public void retirar (CuentaBancaria c) {
        
        System.out.println("Indique el monto a retirar");
        double valorRetirado= leer.nextDouble();
        
        double saldoActual= c.getSaldoActual();
        
        if (valorRetirado> saldoActual) {
            c.setSaldoActual(0);            
        } else{
            c.setSaldoActual(saldoActual - valorRetirado);
        }
            
    }
            
    public void extraccionRapida (CuentaBancaria c) {
        
        System.out.println("Indique el monto a retirar en extraccion rapida (hasta 20% de su saldo)");
        double valorRetirado= leer.nextDouble();
        
        double saldoActual= c.getSaldoActual();
        
        if (valorRetirado> (saldoActual*0.20)) {
            System.out.println("El monto requerido es mayor al 20% de su saldo, intente realizar la operacion mediante la extraccion general");
        } else {
            c.setSaldoActual (saldoActual- valorRetirado);
        }
        
       
    }
    
    public double consultarSaldo (CuentaBancaria c){
                       
        return c.getSaldoActual() ;
    }
    
    public void consultarDatos (CuentaBancaria c) {
        
        System.out.println(c);
    }
}
