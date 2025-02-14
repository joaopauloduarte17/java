/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programapernas;

import java.util.Scanner;

/**
 *
 * @author Rikato
 */
public class ProgramaPernas {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       String tipo;
       System.out.print("Escreva a quantidade de pernas: ");
       int pernas = teclado.nextInt();
       switch(pernas) {
           case 1: 
               tipo = "Saci";
               break;
           case 2:
               tipo = "Bípede";
               break;
           case 4:
               tipo = "Quadrupede";
               break;
           case 6, 8: 
               tipo = "Aranha";
               break;
           default:
               tipo = "ET";
    }
        System.out.println(tipo);
       
    }
}
