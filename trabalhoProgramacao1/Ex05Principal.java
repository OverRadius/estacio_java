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
public class Ex05Principal {
    public static void main(String[] args){
        Ex05Autor joao = new Ex05Autor("Joao","joaozinho655DD812@hotmail.com","Masc");
        Ex05Livro inicio = new Ex05Livro("O Inicio ", joao, 58.37,99);
        
        System.out.println("Nome do livro: " + inicio.getNome());
        System.out.println("Preço: " + inicio.getPreco());
        System.out.println("Quantidade em estoque: " + inicio.getQntEmEstoque());
        
     
        
        System.out.println(inicio.imprimeAutor(joao));
        
        
        
        
    }

}
