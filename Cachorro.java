package pet;

public class Cachorro extends Animal  {
	private String nome;
	private String raca;
	private int idade;
    boolean faminto;
    private static int totalCachorros;
	Tutor dono;

	Cachorro(String nome, String raca, int idade) {
		totalCachorros += 1;
		this.nome = nome;
		this.raca = raca;
		this.idade = idade;
	}

	public void comer() {
		System.out.println("O" + nome + " comeu!");
	  	faminto = false;
	}
	    @Override
	public void emitirSom() {
	    System.out.println("O " + raca + "chamado" + nome + "diz: AU AU!!!");
	}
	
	    @Override
		public String exibirDados() {
		  	if (faminto == true) {
		  		return " está com fome!";
		  	} else {
		  		return " não está com fome!";
		  	}
		  	
		  	//return "nome: "+getNome()+"\nraça: "+getRaca()+"\nidade: "+getIdade() +"\n";
		}
	    
	    public void latir() {
		  	System.out.println("O " + raca + "chamado" + nome + "diz: AU AU!");
	    }
	    
		public void darBanho() {
			System.out.println("Dando banho no cachorro...");
		}
		
		public void cortarUnhas() {
			System.out.println("Cortando unhas...");
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getRaca() {
			return raca;
		}

		public void setRaca(String raca) {
			this.raca = raca;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			if (idade >= 0) {
				this.idade = idade;
			}
		}

		public boolean isFaminto() {
			return faminto;
		}

		public void setFaminto(boolean faminto) {
			this.faminto = faminto;
		}

		public Tutor getDono() {
			return dono;
		}

		public void setDono(Tutor dono) {
			this.dono = dono;
		}
		    
		public static int getTotalCachorros () {
			return totalCachorros;
		}
}
