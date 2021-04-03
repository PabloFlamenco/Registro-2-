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
public class EjerMainIF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double nota1,nota2,nota3,notaf;
        System.out.print("Introduce la primera nota: ");
        nota1=Entrada.real();
        System.out.print("Introduce la segunda nota: ");
        nota2=Entrada.real();
        System.out.print("Introduce la tercera nota: ");
        nota3=Entrada.real();
        
        notaf=(nota1+nota2+nota3)/3;
        
        if (notaf>7){
           System.out.println("La nota es: "+notaf );
           System.out.println("Muy buen promedio,Sigue asi");
        }
        else {
        System.out.println("La nota es: " +notaf);
        System.out.println("Muy mal promedio, tienes que estudiar mas");
                }   
       
        
        
        

        
        
    }
    
    
}
