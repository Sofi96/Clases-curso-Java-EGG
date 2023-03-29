/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Sofi
 */
public class Persona {
    private String nombre;
    private int edad;
    private String estadoCivil;
    
    

    
//CONSTRUCTORES:
    
    public Persona() {
        
    }
    public Persona(String nombre, int edad, String estadoCivil) {
        this.nombre = nombre;
        this.edad = edad;
        
        if (estadoCivil.equals("soltero") || estadoCivil.equals("casado")) {
            this.estadoCivil = estadoCivil;
        }
        
    }
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
//SETTERS:
    
    public void setNombre (String nombre){
        this.nombre= nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setEstadoCivil(String estadoCivil) {
        if (estadoCivil.equals("soltero") || estadoCivil.equals("casado")) {
            this.estadoCivil = estadoCivil;
        }
    }
    
//GETTERS:

    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public String getEstadoCivil() {
        return estadoCivil;
    }

//TO STRING (IMPRIMIR TODOS CON EL NOMBRE ASIGNADO):
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", estadoCivil=" + estadoCivil + '}';
    }

    
}
