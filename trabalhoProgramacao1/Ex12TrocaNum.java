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
public class Ex12TrocaNum {
    
    public void numReverse(int numA,int numB){
        int nA=numA;
        int nB=numB;
        nA+=nB-nA; 
        numB+=numA-numB;
        numA = nA;
        System.out.println(" O Numero A:" + numA + "\n O Numero B:" + numB);
    }

   

        
    }
