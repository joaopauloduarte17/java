/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetor04;

import java.util.Arrays;

/**
 *
 * @author Rikato
 */
public class Vetor04 {

    public static void main(String[] args) {
        int n[] = {4, 7, 8, 9, 1, 3, 6};
        Arrays.sort(n);
        int p = Arrays.binarySearch(n, 3);
        System.out.println("O valor procurado esta na posicao: " + p);
    }
}
