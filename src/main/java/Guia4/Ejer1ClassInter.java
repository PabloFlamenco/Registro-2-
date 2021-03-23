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
public class Ejer1ClassInter implements Ejer1Interface {

    @Override
    public int suma(int num1, int num2, int num3) {
        return num1+num2+num3;
    }

    @Override
    public int resta(int num1, int num2, int num3) {
        return num1-num2-num3;
    }

    @Override
    public int multiplicacion(int num1, int num2, int num3) {
        return num1*num2*num3;
    }

    @Override
    public int division(int num1, int num2, int num3) {
        return num1/num2/num3;
    }
    
    
}
