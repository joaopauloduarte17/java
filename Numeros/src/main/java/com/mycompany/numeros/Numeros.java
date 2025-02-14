/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numeros;

import java.util.Scanner;

/**
 *
 * @author Rikato
 */
public class Numeros {

    public static void main(String[] args) {
        int n, s=0;
        String resp;
        Scanner teclado = new Scanner(System.in);
        
        do {
            System.out.print("Digite um numero: ");
            n = teclado.nextInt();
            s += n;
            System.out.println("Deseja continuar? [S/N] ");
            resp = teclado.next();
        } while (resp.equals("S") || resp.equals("s"));
        System.out.print("A soma foi de: " + s);
    }
}
