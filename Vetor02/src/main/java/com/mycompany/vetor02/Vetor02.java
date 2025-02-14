/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetor02;

import java.util.Scanner;

/**
 *
 * @author Rikato
 */
public class Vetor02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int dia[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        
        System.out.print("Informe o ano que deseja: ");
        int ano = teclado.nextInt();
        
        if (ano % 4 != 0) {
            for (int c = 0; c < mes.length; c++) {
            System.out.println("O mes de " + mes[c] + " tem " + dia[c] + " dias");
        }
        }else {
            dia[1] = 29;
            for (int c = 0; c < mes.length; c++) {
            System.out.println("O mes de " + mes[c] + " tem " + dia[c] + " dias");
        }
        }
    }
}
