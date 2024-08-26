/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java;

/**
 *
 * @author aluno.den
 */
public class Principal {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        
        System.out.println(calculadora.calculadora(2, 4));
        System.out.println(calculadora.calculadora(10.0, 100.0));
    }
}
