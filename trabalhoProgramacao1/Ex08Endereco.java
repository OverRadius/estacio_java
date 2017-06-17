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
public class Ex08Endereco {
    String rua,cep;

    public Ex08Endereco(String rua, String cep) {
        this.rua = rua;
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Cep: " + cep.substring(0,5) + "-" + cep.substring(5);
    }
    
}
