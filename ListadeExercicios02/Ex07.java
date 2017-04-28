package ListadeExercicios02;
import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Ex07 {
    public static void main(String[] args){
    int i;
    double x=0, media=0,banconotas=0,avs=0;  
    
        for (i=1; i<=99999; i++){
            
            System.out.println("Informe uma nota:");
            Scanner value= new Scanner(System.in);
            x = value.nextDouble();
            
            if(x!=-1){
                
                banconotas += x;
                avs+=1;
               
            
            }
            else{
                media= banconotas/avs;
                System.out.println("A Média final é: " + media);
                
                break;
            }
            
            
        }   

    } 
}
