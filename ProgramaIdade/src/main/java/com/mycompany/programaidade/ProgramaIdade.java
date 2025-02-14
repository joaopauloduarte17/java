/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programaidade;

import java.util.Scanner;

/**
 *
 * @author Rikato
 */
public class ProgramaIdade {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int id, ano;
        System.out.print("Digite seu ano de nascimento: ");
        ano = teclado.nextInt();
        id = 2025 - ano;
        System.out.println("Voce tem " + id + " anos");
        if (id >= 18){
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de idade");
        }
    }
}
