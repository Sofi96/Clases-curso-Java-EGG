/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro25_guia9;

/**
 *
 * @author Sofi
 */
public class UtilidadInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer numero1 = 10;

        Integer numero2 = 15;

        System.out.println("------------------------------------------------------");
        System.out.println("CompareTo: ");
        System.out.println("El numero " + numero1 + " comparado con " + numero2
                + " para saber si son iguales dio un resultado de " + numero1.compareTo(numero2));

        System.out.println("------------------------------------------------------");
        System.out.println("DoubleValue: ");

        double numReal = numero1.doubleValue();

        System.out.println("Numero transformado a real: " + numReal);

        System.out.println("------------------------------------------------------");
        System.out.println("Equals: ");
        System.out.println("El numero " + numero1 + " es igual a 10"
                + "/ Resultado: " + numero1.equals(10));

        System.out.println("------------------------------------------------------");
        System.out.println("ParseInt: ");

        int num = Integer.parseInt("20");

        System.out.println("La cadena pasada a num quedo: " + num);

        System.out.println("------------------------------------------------------");
        System.out.println("ToString: ");

        String numCadena = numero1.toString();

        System.out.println("El numero pasado a cadena quedo: " + numCadena);
    }
    
}
