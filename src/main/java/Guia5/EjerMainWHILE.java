/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5;

/**
 *
 * @author pablo
 */
public class EjerMainWHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num=0;
        int suma = 0;
        System.out.println("Escribe -1 para terminar");
        System.out.println("Introduzca un numero: ");
        num=Entrada.entero();
        while(num!=-1)
        {
            suma+=num;
        System.out.println("Introduzca otro numero");
        num=Entrada.entero();
        }
        System.out.println("La suma de los numeros es:"+suma);
        
        
        
    }
    
}
