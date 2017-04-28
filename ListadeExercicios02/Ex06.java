package ListadeExercicios02;
import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Ex06 {
    public static void main(String[] args){
    
    double av1=0,av2=0,media=0;    
    
    System.out.println("Informe a 1º nota: ");
    Scanner value = new Scanner(System.in);
    av1= value.nextDouble();
    
    System.out.println("Informe a 2º nota: ");
    Scanner valueb = new Scanner(System.in);   
    av2 = valueb.nextDouble();
    
    if(av1>=0 && av2>=0){
    media=(av1+av2)/2;    
    System.out.println("A media do aluno é: " + media);   
    }
    
    else{
        
        System.out.println("Valor Digitado invalido");
        
    }
       
    } 
}
