/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testefuncao01;



/**
 *
 * @author Rikato
 */
public class TesteFuncao01 {
    
     static int soma (int a, int b) {
        int s = a + b;
         return s;
    }

    public static void main(String[] args) {
       int so = soma(7,5);
        System.out.println("A soma vale: " + so);
    }
}
