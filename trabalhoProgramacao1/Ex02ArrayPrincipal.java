/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoProgramacao1;

/**
 *
 * @author Carlos
 */
public class Ex02ArrayPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        boolean retorno;
        int i;
        
        Ex02Array objetoArray = new Ex02Array();
        for(i=0; i<=15; i++){
            retorno = objetoArray.insereDadosNoVetor(i, 2);
            if (retorno) {
                System.out.println("O valor " + 2 + " foi inserido na posicao " + i);
            } else {
                System.out.println("O valor " + 2 + " não foi inserido na posicao " + i);
            }

        }
	
        int resultadoDaSoma;

        resultadoDaSoma = objetoArray.soma();

        System.out.println("O valor da soma eh: " + resultadoDaSoma);

}
}
