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
public class Ex11Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,y,x,somaP=0,somaI=0;
        int [] vetorNum = new int[30];
        
        for(i=1; i<30; i++){
            vetorNum[i] = i;
        }
        
        for (x=1; x<vetorNum.length; x++){ 
            y=vetorNum[x];
            if(y % 2 ==0){
              somaP+=y;  
  
            }
            else{
                somaI+=y;
            }
            
            
        }
        
        System.out.println(somaP+"\n" + somaI);
    }    
    
}
