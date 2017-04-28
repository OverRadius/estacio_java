package ListadeExercicios02;
import java.util.Scanner;
/**
 *
 * @author Carlos
 */
public class Ex12 {
    public static void main(String[] args){
        double catA=0,catB=0,somaCatetos=0;
        
        System.out.println("Informe o cateto B:/n");
        Scanner cB = new Scanner(System.in);
        catB=cB.nextDouble();
        
        System.out.println("Informe o cateto A:/n");
        Scanner cA = new Scanner(System.in); 
        catA=cA.nextDouble();
        
        double resultado = hipotenusa(catA,catB);
        System.out.println("A hipotenusa é:" + resultado);
     
}  

public static double hipotenusa(double catA, double catB){
        double somaCatetos=0,hip=0;
       
        somaCatetos=(catA*catA) + (catB*catB);
        hip=Math.sqrt(somaCatetos);
        
        return hip;
    }

}
