/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia4;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class MainTestAbstrct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ExtendsAbstract Operaciones3=new ExtendsAbstract();
        
        Scanner a= new Scanner(System.in);
        System.out.println("La suma de 3 numeros es: "+Operaciones3.suma(23, 12, 5));
        System.out.println("La resta de 3 numeros es: "+Operaciones3.resta(52, 32, 2));
        System.out.println("La division de 3 numeros es: "+Operaciones3.division(20, 2, 2));
        System.out.println("La multiplicacion de 3 numeros es: "+Operaciones3.multiplicacion(23, 12, 5));

    }
    
}
