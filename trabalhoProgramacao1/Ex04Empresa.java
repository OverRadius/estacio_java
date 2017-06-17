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
public class Ex04Empresa {
    private Ex04Funcionario[] vetorFuncionario = new Ex04Funcionario[10];
     
    
    public void listarFuncionarios(){
        Ex04Funcionario funcionario;
        
        for(int i=0; i<vetorFuncionario.length; i++){
            funcionario = vetorFuncionario[i];
            System.out.println(funcionario);

        }
    }
}