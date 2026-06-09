package petshop;

public class Gato extends Animal {
	private String raca;
	
	Gato(String nome, String raca, int idade) {
		this.nome = nome;
    	this.raca = raca;
    	this.idade = idade;
    	faminto = true;
	}
	
	@Override
	public void emitirSom() {
	  	  System.out.println("O " + raca + "chamado" + nome + "diz: MIAUUUUUUUUUU!");
	    }
	
	@Override
	public void exibirDados() {
	  	  System.out.println("nome: "+nome+"\nraça: "+raca+"\nidade: "+idade +"\n" +nome);
	  	  if (faminto == true) {
	  		  System.out.print(" está com fome!");
	  	  } else {
	  		  System.out.print(" não está com fome!");
	  	  }
		}
}
