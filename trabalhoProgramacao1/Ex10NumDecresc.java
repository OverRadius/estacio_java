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
public class Ex10NumDecresc {
    int j,numA;
    
    public int[] numDecresc(int numA){
        int [] vetorNumA = new int [numA+1];
        
        for(j=0; j<vetorNumA.length; j++){    
            vetorNumA[j] = j;
        }
    return vetorNumA;    
        
    
    }
}
