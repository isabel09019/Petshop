package petshop;

public abstract class Animal {
	protected String nome;
	protected int idade;
    protected boolean faminto;
	protected Tutor dono;
	
	public void comer() {
		System.out.println("O" + nome + " comeu!");
		faminto = false;
	}
	
	public abstract void emitirSom();
	public abstract void exibirDados();
}