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
public class AbstractMainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        AbstractTest prueba=new AbstractTest();
        System.out.println("La suma es:"+prueba.suma(10, 5));
        System.out.println("La resta es:"+prueba.resta(50, 10));
        System.out.println("La division es:"+prueba.division(50, 10));
        System.out.println("La multiplicaciones es:"+prueba.multiplicacion(10, 10));
        
        
    }
    
}
