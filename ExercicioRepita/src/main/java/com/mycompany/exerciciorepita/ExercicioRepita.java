/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author Rikato
 */
public class ExercicioRepita {

    public static void main(String[] args) {
       int n, totV=0, totPar=0, totImp=0, acCem=0, tot=0;
       double m;
       do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html> Infome um número: <br> (0 interrompe) </br> </html>"));
            tot += n;
            totV += 1;
            if (n % 2 == 0) {
                totPar += 1;
            }else {
                totImp += 1;
            }
            
            if (n > 100) {
                acCem +=1;
            }
            
            m = tot / totV;
            
       } while (n != 0);
       
       JOptionPane.showMessageDialog(null, String.format("<html> Resultado <br> -------------- </br> <br> Total de Valores: %d </br> "
               + "<br> Total de Pares: %d </br> <br> Total de Ímpares: %d </br> <br> Acima de 100: %d </br> "
               + " <br> Média dos valores: %.2f </br> </html>", totV, totPar, totImp, acCem, m));
    }
}
