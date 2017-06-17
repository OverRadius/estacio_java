/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoProgramacao1;

/**
 *
 * @author Carlos
 */
public class Ex03MatrizPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int [][] matrizA = new int[2][2];
    int [][] matrizB = new int[2][2];  
    int [][] somaMatriz = new int [2][2];
    int [][] multMatriz = new int [2][2];
    
    matrizA[0][0] = 1;
    matrizA[0][1] = 2;
    matrizA[1][0] = 4;
    matrizA[1][1] = 6;
    
    matrizB[0][0] = 5;
    matrizB[0][1] = 3;
    matrizB[1][0] = 1;
    matrizB[1][1] = 8;
    
    Ex03Matriz objetoMatriz = new Ex03Matriz();
        System.out.println("MatrizA");
        objetoMatriz.Imprime(2, 2, matrizA);
   
        System.out.println("MatrizB");
        objetoMatriz.Imprime(2, 2, matrizB);
    
    somaMatriz = objetoMatriz.somaDuasMatrizes(2, 2, matrizA, matrizB);
        System.out.println("A Soma das matrizes:" );
        objetoMatriz.Imprime(2, 2, somaMatriz);
    
    multMatriz = objetoMatriz.multDuasMatrizes(2, 2, matrizA, matrizB);
        System.out.println("A Multiplicação das matrizes: ");
        objetoMatriz.Imprime(2,2, multMatriz);
    } 
    
    
    
}
