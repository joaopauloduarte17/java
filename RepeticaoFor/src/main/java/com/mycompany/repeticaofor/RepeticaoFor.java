/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.repeticaofor;

/**
 *
 * @author Rikato
 */
public class RepeticaoFor {

    public static void main(String[] args) {
        for (int cc = 1; cc <= 100; cc += 10) {
            System.out.println(cc);
            if (cc == 1) {
                cc = 0;
            }
        }
    }
}
