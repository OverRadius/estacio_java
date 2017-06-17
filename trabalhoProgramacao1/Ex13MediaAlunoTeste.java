/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoProgramacao1;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Ex13MediaAlunoTeste {
    public static void main(String[] args) {
        int resposta=0;
        Ex13MediaAluno obj = new Ex13MediaAluno();
          
        System.out.println("Quantas notas quer calcular?");
        Scanner input = new Scanner(System.in);
        resposta= input.nextInt();
        obj.qtdeNotas(resposta);
            int nota;
            
            for(int i=0; i<resposta; i++){
            
            System.out.println("Digite uma nota de 0 a 100 : ");
            Scanner input2 = new Scanner(System.in);
            nota= input2.nextInt(); 
        
            obj.addNotaVetor(i,nota);   
                
                   
            }
            
            System.out.println("A media é: " + obj.calcMedia());
    
    
    
    
    
    
    
    /*public static void main(String[] args) {
        int nota;
        char resposta;
        Ex13MediaAluno obj = new Ex13MediaAluno();
        do{        
            System.out.println("Deseja digitar uma nota?S/N ");
            Scanner input = new Scanner(System.in);
            resposta= input.next(".").charAt(0);
        
            System.out.println("Digite uma nota de 0 a 100 : ");
            Scanner input2 = new Scanner(System.in);
            nota= input2.nextInt();  
            
            if(nota <0 && nota>100){             
            System.out.println("Só é possivel adicionar notas inteiras e menores que 100");   
            }
            else{
                Ex13MediaAluno add = new Ex13MediaAluno();      
                add.addNota(nota);      
            }
        }while(resposta!='n' || resposta!='N');
         System.out.println(" " + obj.media);
    }
    */
    }
}
