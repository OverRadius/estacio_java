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
public class Ex03Matriz {
    
    public void Imprime(int qntLinhas, int qntColunas,  int[][] matriz){
        for(int i=0; i<qntLinhas; i++){
            for(int j=0; j<qntColunas; j++){
                System.out.println(matriz[i][j] + " ");
                
                
            }           
            
        }
            
    } 
        
        public int[][] somaDuasMatrizes(
            int qntLinhas, int qntColunas,int[][] matrizA, int[][] matrizB) {
        
        int[][] matrizC;
        matrizC = new int[qntLinhas][qntColunas];
        
         for (int i = 0; i < qntLinhas; i++) {
            for (int j = 0; j < qntColunas; j++) {
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        return matrizC;
    }   

        public int[][] multDuasMatrizes(int qntLinhas, int qntColunas, 
                int[][] matrizA, int[][] matrizB){
            
            int[][] matrizC = new int[qntLinhas][qntColunas];
            
            matrizC[0][0] = (matrizA[0][0] * matrizB[0][0]) + (matrizA[0][1] * matrizB[1][0]);
            matrizC[0][1] = (matrizA[0][0] * matrizB[1][0]) + (matrizA[0][1] * matrizB[1][1]);
            matrizC[1][0] = (matrizA[1][0] * matrizB[0][0]) + (matrizA[1][1] * matrizB[1][0]);
            matrizC[1][1] = (matrizA[1][0] * matrizB[0][1]) + (matrizA[1][1] * matrizB[1][1]);
         
         
            
        return matrizC;
        
        }

}
