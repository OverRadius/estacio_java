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
public class Ex04Funcionario {
    private String nome,cargo,superior;
    
    public Ex04Funcionario(){};
    
    public Ex04Funcionario(String nome, String cargo, String superior){
        this.nome = nome;
        this.cargo = cargo;
        this.superior = superior;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

  
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSuperior() {
        return superior;
    }

    public void setSuperior(String superior) {
        this.superior = superior;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " " + "||" + " Cargo: " + cargo;
    }
    
}
