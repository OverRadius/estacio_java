package Estacio.aula08.calculadora;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class ExercicioCalculadora {
    
    public static void main(String[] args) {
        String primeiroNum, segundoNum, operador = null;
        double num1 = 0, num2 = 0, total=0;
        int aviso=0;
        
        do {
            primeiroNum = JOptionPane.showInputDialog(null, "Digite o primeiro valor");
            
            if (primeiroNum == null) {
                break;
            }
            
            operador= JOptionPane.showInputDialog("Escolha o operador: (+, -, /, *)");
            
            segundoNum= JOptionPane.showInputDialog(null, "Digite o segundo valor");
            if (segundoNum == null) {
                break;
            }
            
            num1= Double.parseDouble(primeiroNum);
            num2= Double.parseDouble(segundoNum);
        
           
            
            
            switch(operador)
            {
                case "+": total = num1 + num2; break;
                case "-": total = num1 - num2; break;
                case "*": total = num1 * num2; break;
                case "/": total = num1 / num2; break;
                default: JOptionPane.showMessageDialog(null, "Operador invalido!");
                
            
            
            }
            JOptionPane.showMessageDialog(null,num1 + " "+operador+" "+num2+" = "+total);
            aviso = JOptionPane.showConfirmDialog(null, "Continue?",
                "Aviso", JOptionPane.YES_NO_OPTION);

        }while (aviso == 0);
        JOptionPane.showMessageDialog(null, "Até a proxima");

    }
}




