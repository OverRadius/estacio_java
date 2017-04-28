package ListadeExercicios02;
import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Ex04 {
    public static void main(String[] args) {
       
       int x=0; 
   
       System.out.println("Digite o numero:");
       Scanner num = new Scanner(System.in);
       x=num.nextInt();
       
        if(x%2==0){
       System.out.println("O numero" + x + "é Par");
        }
        else {
       
       System.out.println("O numero " + x + ": é Impar");
       
        }
    
    }  

}
