/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListadeExercicios02;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Ex09 {
    public static void main(String[] args) {
        int x, numero=1;
        System.out.println("Digite um número inteiro");
        Scanner num = new Scanner(System.in);
        x = num.nextInt();
        int[][] matriz = new int[x][x];
        for(int i=0;i<matriz.length;i++){ 
            for(int j=0;j<matriz[i].length;j++){
                   matriz[i][j]=numero++;
        System.out.printf("\t%d",matriz[i][j]);
    
            
            
            }          
 
        }
    }
}
 