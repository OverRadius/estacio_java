package ListadeExercicios02;

import java.util.Scanner;
/**
 *
 * @author Carlos
 */
public class Ex05 {
    public static void main(String[] args){
        int operador;
        double num1,num2;
        
        System.out.println("Escolha o operador digitando o numero(1-Soma;2-subtração;3-multiplicação;4-divisão;)");
        Scanner input = new Scanner(System.in);
        operador = input.nextInt();
        if(operador > 4){
            System.out.println("Operador Invalido"); 
        }
     
        System.out.println("Qual o primeiro numero? /n");
        Scanner n = new Scanner(System.in);
        num1 = n.nextDouble();
        
        System.out.println("Qual o primeiro numero? /n");
        Scanner n2 = new Scanner(System.in);
        num2 = n2.nextDouble();
        
        switch(operador){
            
            case 1 : System.out.println("A soma dos numeros " + num1 + " e" + num2 + " é:");
                     System.out.println(num1 + num2);   
            
            case 2 : System.out.println("A subtração dos numeros " + num1 + " e" + num2 + " é:");
                     System.out.println(num1 - num2);   
            
            case 3 : System.out.println("A multiplicação dos numeros " + num1 + " e" + num2 + " é:");
                     System.out.println(num1 * num2);   
            
            case 4 : System.out.println("A divisão dos numeros " + num1 + " e" + num2 + " é:");
                     System.out.println(num1 / num2);   
            
            defalt: System.out.println("Operação Invalida");
        
            break;
        }
        
    
    }
    
}
