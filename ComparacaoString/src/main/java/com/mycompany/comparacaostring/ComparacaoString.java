/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.comparacaostring;

/**
 *
 * @author Rikato
 */
public class ComparacaoString {

    public static void main(String[] args) {
       /* COMPARANDO A ESTRUTURA
        
       String nome1 = "Joao";
       String nome2 = new String("Joao");
       String res;
       res = nome1 == nome2 ? "igual" : "diferente";
        System.out.println(res);*/
       
       //COMPARANDO O CONTEÚDO
       String nome1 = "Joao";
       String nome2 = new String("Joao");
       String res;
       res = nome1.equals(nome2) ? "igual": "diferente";
       System.out.println(res);
    }
}
