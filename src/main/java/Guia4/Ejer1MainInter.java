/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia4;

/**
 *
 * @author pablo
 */
public class Ejer1MainInter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ejer1ClassInter impri= new Ejer1ClassInter();
        System.out.println("Suma 24+5+10");
        System.out.println("La suma de los 3 numeros es:"+impri.suma(24, 5, 10));
        System.out.println("Resta 43-4-22");
        System.out.println("La resta de los 3 numeros es:"+impri.resta(43, 4, 22));
        System.out.println("Multiplica 27*5*14");
        System.out.println("La multiplicacion de los 3 numeros es:"+impri.multiplicacion(27, 6, 14));
        System.out.println("Divide 100/5/2");
        System.out.println("La division de los 3 numeros es:"+impri.suma(100, 5, 2));

    }
    
}
