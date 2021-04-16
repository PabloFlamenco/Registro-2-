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
public class Coche {
    private String color;
    private int velocidad;
    private float tamaño;
    public static int numeroRuedas=4;
    public static final String timon= "Izquierda";
    
    public static String arrancar(){
        return "El coche arranco";
    }
    public static String frenar(){
    return "El coche freno";
    }
    public static String girar(){
        return "El coche ejecuto un giro";
    }
    public static String combustible(){
    return "El coche cargo combustible";
    
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public float getTamaño() {
        return tamaño;
    }

    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }

    public static int getNumeroRuedas() {
        return numeroRuedas;
    }

    public static void setNumeroRuedas(int numeroRuedas) {
        Coche.numeroRuedas = numeroRuedas;
    }
}
