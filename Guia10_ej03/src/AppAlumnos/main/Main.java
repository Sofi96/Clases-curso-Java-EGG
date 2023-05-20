/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppAlumnos.main;

import AppAlumnos.entidades.Alumno;
import AppAlumnos.servicios.AlumnoService;

/**
 *
 * @author Sofi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlumnoService as= new AlumnoService();
        
        as.crearListaAlumnos();
        
        System.out.println(as.notaFinal());
        
        
        
    }
    
}
