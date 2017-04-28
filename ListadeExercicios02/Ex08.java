package ListadeExercicios02;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Ex08 {
    public static void main(String[] args)	{
            
            int d=0;
            System.out.println("Informe um numero:");
            Scanner value= new Scanner(System.in);
            d = value.nextInt();
                    
                   
                    
                    
               
               
                
		
		StringBuffer binario = new StringBuffer();
		while (d > 0) {
			int b = d % 2;
			binario.append(b);
			d = d >> 1; 
		}
		System.out.println(binario.reverse().toString()); 
	}

    }


