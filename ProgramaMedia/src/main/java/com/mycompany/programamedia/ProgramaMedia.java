/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programamedia;

    import java.util.Scanner; 

/**
 *
 * @author Rikato
 */
public class ProgramaMedia {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float n1, n2, m;
        System.out.print("Primeira nota: ");
        n1 = teclado.nextFloat();
        System.out.print("Segunda nota: ");
        n2 = teclado.nextFloat();
        m = (n1 + n2) / 2;
        System.out.println("Sua media foi " + m);
        if (m > 9) {
            System.out.println("Parabens");    
        }
        
    }
}
