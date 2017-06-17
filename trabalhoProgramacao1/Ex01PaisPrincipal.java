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
public class Ex01PaisPrincipal {
    
    public static void main(String[] args){
    
    Ex01Pais brasil = new Ex01Pais("Brasil","Brasilia","8.516.000 Km²");
    Ex01Pais argentina = new Ex01Pais("Argentina","Buenos Aires","2.780.000 km²");
    Ex01Pais paraguai = new Ex01Pais("Paraguai","Assunção","406.752 Km²");
    Ex01Pais uruguai = new Ex01Pais("Uruguai","Montevidéu","176.215 Km²");
    Ex01Pais venezuela = new Ex01Pais("Venezuela","Caracas","916.445 km²");
    Ex01Pais chile = new Ex01Pais("Chile","Santiago","756.102 km²");
    
        System.out.println(brasil.equals(brasil));
        System.out.println(brasil.equals(argentina));
        
    brasil.setlistaDeFronteiras(argentina,paraguai,uruguai,venezuela);
    argentina.setlistaDeFronteiras(brasil,chile,paraguai,uruguai);
    paraguai.setlistaDeFronteiras(brasil,argentina);
    uruguai.setlistaDeFronteiras(brasil,argentina);
    venezuela.setlistaDeFronteiras(brasil);
    chile.setlistaDeFronteiras(argentina);
    
    imprimeFronteiras(brasil.getlistaDeFronteiras());
    imprimeFronteiras(argentina.getlistaDeFronteiras());
    imprimeFronteiras(paraguai.getlistaDeFronteiras());
    imprimeFronteiras(uruguai.getlistaDeFronteiras());
    imprimeFronteiras(venezuela.getlistaDeFronteiras());
    imprimeFronteiras(chile.getlistaDeFronteiras());
    
    
    imprimeFronteiras(brasil.vizinhosComum(argentina));
    imprimeFronteiras(brasil.vizinhosComum(venezuela));
    
    }
    
    
    
    private static void imprimeFronteiras(Ex01Pais[] listaDeFronteiras){
        for (Ex01Pais pais : listaDeFronteiras){
            
            System.out.println(pais.getNome() + "\n");
        
        }
        
        
    }



}
