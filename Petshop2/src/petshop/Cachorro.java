package petshop;

public class Cachorro {
	private String nome;
	private String raca;
	private int idade;
    boolean faminto;
	Tutor dono;
	    
	    Cachorro(String nome, String raca, int idade) {
	    	this.nome = nome;
	    	this.raca = raca;
	    	this.idade = idade;
	    	faminto = true;
	    }
	    
	    public void comer() {
	  	  System.out.println("O" + nome + " comeu!");
	  	  faminto = false;
	    }
	    
	    public void latir() {
	  	  System.out.println("O " + raca + "chamado" + nome + "diz: AU AU!");
	    }
	    
	    public void exibirDados() {
	  	  System.out.println("nome: "+nome+"\nraça: "+raca+"\nidade: "+idade +"\n" +nome);
	  	  if (faminto == true) {
	  		  System.out.print(" está com fome!");
	  	  } else {
	  		  System.out.print(" não está com fome!");
	  	  }
	    }
}
