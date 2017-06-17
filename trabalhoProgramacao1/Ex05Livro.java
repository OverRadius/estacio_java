/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoProgramacao1;
import trabalhoProgramacao1.Ex05Autor;
/**
 *
 * @author Carlos
 */
public class Ex05Livro {
    
    private String nome;
    private Ex05Autor autor;
    private double preco;
    private int qntEmEstoque; 

    public Ex05Livro(String nome, Ex05Autor autor, double preco, int qntEmEstoque) {
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
        this.qntEmEstoque = qntEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Ex05Autor getAutor() {
        return autor;
    }

    public void setAutor(Ex05Autor autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQntEmEstoque() {
        return qntEmEstoque;
    }

    public void setQntEmEstoque(int qntEmEstoque) {
        this.qntEmEstoque = qntEmEstoque;
    }

    @Override
    public String toString() {
        return "Nome: " + autor + "|" + "Preço " + autor + "|" + "Quantidade " + autor + "|";
    }
    
    public Ex05Autor imprimeAutor(Ex05Autor autor){
        
        System.out.println("Nome: " + autor.getNome() + "\n" + "Email: " 
                + autor.getEmail() + "\n" + "Sexo: " + autor.getSexo()); 
        return null;
    }
    
}
