/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5;

import javafx.scene.paint.Color;

/**
 *
 * @author pablo
 */
public class EjerMainSWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String color;
        System.out.print("Escribe tu color favorito con la inicial mayuscula\n");
        System.out.print("Introduzca su color favorito");
        color=Entrada.cadena();
        switch(color)
        {
            case "Azul":
                System.out.println("Tu color favorito es Azul");
                break;
            case "Rojo":
                System.out.println("Tu color favorito es Rojo");
                  break;
            case "Amarillo":
                System.out.println("Tu color favorito es Amarillo");
                  break;
            case "Verde":
                System.out.println("Tu color favorito es Verde");
                  break;
            case "Celeste":
                System.out.println("Tu color favorito es Celeste");
                  break;
            case "Negro":
                System.out.println("Tu color favorito es Negro ");
                  break;
            case "Morado":
                System.out.println("Tu color favorito es Morado");
                  break;
            case "Anaranjado":
                System.out.println("Tu color favorito es Anaranjado");
                  break;
            case "Cafe":
                System.out.println("Tu color favorito es Cafe");
                  break;
            case "Blanco":
                System.out.println("Tu color favorito es Blanco");
                  break;
            case "Rosado":
                System.out.println("Tu color favorito es Rosado");
                  break;
            case "Aqua":
                System.out.println("Tu color favorito es Aqua");
                  break;
            default:
                System.out.println("ERROR!!! No has escrito un color programado");
                
                
                
                
                
                
                
                
                
                
        }
        
    }
    
}
