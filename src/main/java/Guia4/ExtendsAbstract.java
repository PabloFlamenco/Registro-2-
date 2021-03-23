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
public class ExtendsAbstract extends AbstractEj1{

    @Override
    public int suma(int a, int b, int c) {
        return a+b+c;
    }

    @Override
    public int resta(int a, int b, int c) {
        return a-b-c;
    }

    @Override
    public int division(int a, int b, int c) {
        return a/b/c;
    }

    @Override
    public int multiplicacion(int a, int b, int c) {
        return a*b*c;
    }
    
}
