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
public class Ex07Retangulo extends Ex07Corpo{
    private int comprimento,largura;

    public Ex07Retangulo(String cor,int comprimento, int largura) {
        super(cor);
        this.comprimento = comprimento;
        this.largura = largura;
        
    }

    @Override
    public String toString() {
        return " ";
    }


    
    @Override
    public float getArea(){
        return comprimento * largura;
    }


}
