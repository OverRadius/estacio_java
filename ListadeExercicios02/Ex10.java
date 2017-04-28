package ListadeExercicios02;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class Ex10 {
    public static void main(String[] args){
        
        Object[] vetorCidade = new Object[5];
        int i;
        String cidade;
        
        for(i=0; i<=4; i++){
            
        cidade = JOptionPane.showInputDialog("Digite o nome da cidade");    
            
        if(cidade!=null){
            vetorCidade[i]=cidade;
        }
        else
        System.exit(0);
                    
                        
           
        
        Object selCidade = JOptionPane.showInputDialog(null, 
        "Selecione uma Cidade", "Cidades", 
        JOptionPane.INFORMATION_MESSAGE, null, 
        vetorCidade, vetorCidade[0]);
        
        JOptionPane.showMessageDialog(null, "Cidade selecionada " + selCidade);
        }
        
        
        
    }
    
}

     
     
        
        
        
        