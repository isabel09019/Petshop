package petshop;

public abstract class Cachorro extends Animal implements ANE {
	private String raca;
	    
	    Cachorro(String nome, String raca, int idade) {
	    	this.nome = nome;
	    	this.raca = raca;
	    	this.idade = idade;
	    	faminto = true;
	    }
	    
	    @Override
	    public void emitirSom() {
	    	System.out.println("O " + raca + "chamado" + nome + "diz: AU AU!!!");
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
	    
	    @Override
	    public void darBanho() {
	    	System.out.println("Dando banho no cachorro...");
	    }
	    
	    @Override
	    public void cortarUnhas() {
	    	System.out.println("cortando unha do cachorro ...");
	    }
}
