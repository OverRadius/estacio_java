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
public class Ex09MaiorNumero {
    private int numA,numB;
    
    
    public int getNumA() {
        return numA;
    }

    public void setNumA(int numA) {
        this.numA = numA;
    }

    public int getNumB() {
        return numB;
    }

    public void setNumB(int numB) {
        this.numB = numB;
    }
    
    /*public boolean maiorNum(int numA, int numB){
        if(numA > numB)
            System.out.println("O Numero:" + numA + " é maior que numero: " + numB);
        else if(numA==numB)
            System.out.println("O Numero:" + numA + " é igual ao numero: " + numB);
        else if(numB>numA)
            System.out.println("O Numero:" + numB + " é maior que numero: " + numB);
        return true;
        }
*/
    public int maiorNum(int numA ,int numB){
        int x=0;
        x=Math.max(numA, numB);
        return x;
    }
    

}   