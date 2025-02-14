/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contador01;

/**
 *
 * @author Rikato
 */
public class Contador01 {

    public static void main(String[] args) {
        int cc = 0;
        while (cc <= 15) {
        cc++;
        if ((cc == 5) || (cc == 7) || (cc == 9)){
            continue;  
        }
        if (cc == 10){
            break;
        }
        System.out.println("Contador " + cc);
        
    }
    }
}
