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
public class InterfaceMainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClassTestInter pruebainter= new ClassTestInter();
        System.out.print ("La suma es: "+pruebainter.suma(50,100));
        System.out.print ("La resta es: "+pruebainter.resta(50,10));
        System.out.print ("La multiplicacion es: "+pruebainter.multiplicacion(10,5));
        System.out.print ("La suma es: "+pruebainter.division(100, 10));


    }
    
}
