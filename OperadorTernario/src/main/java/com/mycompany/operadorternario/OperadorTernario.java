/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operadorternario;

import java.util.Scanner; 

/**
 *
 * @author Rikato
 */
public class OperadorTernario {

    public static void main(String[] args) {
        /* int maior;
        int n1 = 2;
        int n2 = 5;
        maior = n1 > n2 ? n1 : n2;
        System.out.println(maior);*/
        
        int maior;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero");
        int n1 = teclado.nextInt();
        System.out.println("Digite o segundo numero");
        int n2 = teclado.nextInt();
        maior = n1 > n2 ? n1 : n2;
        System.out.println(maior);
    }
}
