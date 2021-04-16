/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia6;

/**
 *
 * @author pablo
 */
public class MainClassEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("El metodo retorna: "+Camisa.Estado());
        
        Camisa Camisa01= new Camisa();
        Camisa01.setColor("Verde Claro");
        System.out.println("La camisa es color: " +Camisa01.getColor() );
        
        Camisa01.setPrecio(6.50);
        System.out.println("El precio de la camisa es: "+Camisa01.getPrecio());
        
        Camisa01.setTalla("S");
        System.out.println("La talla de la camisa es: "+Camisa01.getTalla());
    }
    
    
    
}
