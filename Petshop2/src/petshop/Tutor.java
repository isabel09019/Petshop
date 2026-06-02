package petshop;

public class Tutor {
	private String nome;
	private String telefone;
	
	Tutor(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}
	
	public void exibirInformacoes() {
		System.out.println("Tutor: " + this.nome + "\nTelefone: " + this.telefone);
	}
}
