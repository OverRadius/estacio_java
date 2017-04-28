package ListadeExercicios02;

/**
 *
 * @author Carlos
 */
public class Ex14 {

   
    public static void main(String[] args) {
     
        Ex14_2 aluno= new Ex14_2();
        aluno.nomear("Joao");
        aluno.gerarRA(156236486);
        
        System.out.println("Qual seu RA?");
        System.out.println(aluno.responderRA());
        
    }
    
}
