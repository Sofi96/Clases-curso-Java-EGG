/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Sofi
 */
public class PersonaService {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona() {
        
        //  nombre, edad, sexo (‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro), peso y altura.
        System.out.println("Ingrese el nombre de la persona");
        String nombre = leer.next();
        
        System.out.println("Ingrese la edad de la persona");
        int edad = leer.nextInt();
        
        System.out.println("Ingrese el sexo de la persona (H - M - O)");
        char sexo = leer.next().charAt(0); //se lee como string y se transforma a char
        
        System.out.println("Ingrese el peso de la persona");
        double peso = leer.nextDouble();
        
        System.out.println("Ingrese la altura de la persona en cm");
        double altura = leer.nextDouble();
        
        
        return new Persona(nombre,edad, sexo, peso,altura);
    }
    
    public boolean esMayorDeEdad (Persona p) {
        boolean mayorEdad;
        
        if (p.getEdad()>17) {
            mayorEdad = true;
        } else {
            mayorEdad= false;
        }
        
        return mayorEdad;
    }
    
    public int calcularIMC(Persona p){
        
        
        double peso = p.getPeso();
        double altura = p.getAltura();
        int IMC;
        
        if ((peso/Math.pow(altura,2)) < 20) {
            IMC=-1;
        }else if ((peso/Math.pow(altura,2)) >=20 && (peso/Math.pow(altura,2)) <=25) {
            IMC=0;
        }else {
            IMC=1;
        }
        return IMC;
    }
}
