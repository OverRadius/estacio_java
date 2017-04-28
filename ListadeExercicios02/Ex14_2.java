package ListadeExercicios02;

/**
 *
 * @author Carlos
 */
public class Ex14_2 {
    private int RA;
    private String nome;
    private String endereço;
    private String curso;
    private String dataDeNascimento;
    private int idade;
    
    
    
    public int responderRA() {
        return RA;
        
        
     }
    
    void nomear(String nome){
        this.nome = nome;
        
    }

    void gerarRA(int RA) {
       this.RA = RA;
    }
    
}
