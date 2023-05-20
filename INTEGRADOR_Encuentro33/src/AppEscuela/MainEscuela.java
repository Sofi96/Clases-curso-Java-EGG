/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppEscuela;

import Entidades.Estudiante;
import Servicios.EstudianteService;

/**
 *
 * @author Sofi
 */
public class MainEscuela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EstudianteService es= new EstudianteService();
        
        Estudiante [] esc1=es.crearEscuela();
        
        es.mostrarEscuela(esc1);
        System.out.println("El promedio de notas de la escuela es: "+ es.promedio(esc1));
        
        es.mostrarVector(es.mayorAlPromedio(esc1));
        
       
    }
    
}
