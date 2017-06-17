/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoProgramacao1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlos
 */
public class Ex13MediaAluno{
    int[] notas ;
 
    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }
    
    public void addNotaVetor(int posicao, int nota){
        if(nota<100 || nota>0){
            notas[posicao] = nota;
        }
        
        else if(nota>100 && nota<0){
            System.out.println("Só é possivel colocar numeros de 0 a 100");     
        }    
            
        else
             System.out.println("Digite a poha de um numero desgraça");
        
        
        
    }    

    public void qtdeNotas(int resposta){
        notas = new int[resposta];
    }
    
    public int calcMedia(){
        int soma=0,media = 0;
        
        for(int i=0; i<notas.length; i++){
            soma+= notas[i];
            
        }
     return soma/notas.length;   
    } 
}


/*
        public boolean addNota(int nota) throws ExceptionA{     
            List <Integer> notas = new ArrayList<Integer>();
            try{
            if(nota<100 || nota>0){
            notas.add(nota);  
            }
            
            }catch(Exception a){
                throw new ExceptionA("Só é possivel colocar valores de 0 a 100");
            }
            return true;
        }
        
        public int calcMedia(List <Integer> notas){
            int soma=0,y=notas.size();
            int media;
            for(int i=0; i<y; i++){
                
                soma+=notas.get(i);     
            }
            
            return soma/y;
        }
  
    
    
    public class ExceptionA extends Exception{
        ExceptionA(String mensagem){
           super(mensagem); 
        }
        
    }
    
 */       