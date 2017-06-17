package trabalhoProgramacao1;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlos
 */
public class Ex01Pais {
   public String nome,nomeCapital,dimensao;
   private Ex01Pais[] listaDeFronteiras;

    public Ex01Pais(String nome, String nomeCapital, String dimensao) {
        this.nome = nome;
        this.nomeCapital = nomeCapital;
        this.dimensao = dimensao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNomeCapital(String nomeCapital) {
        this.nomeCapital = nomeCapital;
    }

    public void setDimensao(String dimensao) {
        this.dimensao = dimensao;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeCapital() {
        return nomeCapital;
    }

    public String getDimensao() {
        return dimensao;
    }

    public Ex01Pais[] getlistaDeFronteiras() {
        return listaDeFronteiras;
    }
   
   public boolean equals(Ex01Pais outro){
       return this.nome.equals(outro.getNome()) && this.nomeCapital.equals(outro.getNomeCapital());
   }
   

   public void setlistaDeFronteiras(Ex01Pais...todosPaises){
       int qntMsmPaises=0,i;
       
       for(i=0; i<todosPaises.length;i++){
           if(this.equals(todosPaises[i])){
               qntMsmPaises++;
               
           }
           
       }
        this.listaDeFronteiras= new Ex01Pais[todosPaises.length - qntMsmPaises];
        int j,y=0;
       
        for(j = 0; j < todosPaises.length; j++){
            if(!this.equals(todosPaises[j])) {
				this.listaDeFronteiras[y] = todosPaises[j];
                                y++;
                                }
        }       
   
   }	
        public Ex01Pais[] vizinhosComum(Ex01Pais outroPais){
		int numPaisIguais = 0;
		for(Ex01Pais paisA: this.listaDeFronteiras) {
			for(Ex01Pais paisB: outroPais.listaDeFronteiras) {
				if(paisA.equals(paisB)) {
					numPaisIguais++;
				}
			}
		}

	
            if(numPaisIguais > 0) {
			int s = 0;
			Ex01Pais[] bancoVizinhos = new Ex01Pais[numPaisIguais];
			for(Ex01Pais paisA: this.listaDeFronteiras) {
				for(Ex01Pais paisB: outroPais.listaDeFronteiras) {
					if(paisA.equals(paisB)) {
						bancoVizinhos[s] = paisB;
						s++;
					}
				}
			}
			
			return bancoVizinhos;
		}
		
            else 
               return null;
            
	

    }

}
