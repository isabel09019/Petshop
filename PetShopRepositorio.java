package pet;
import java.util.ArrayList;
import java.util.List;

public class PetShopRepositorio {
	private final ArrayList<Animal> animais = new ArrayList<>();

	public void adicionar(Animal a) {
		animais.add(a);
	}

	public Animal buscarPorNome(String nome) {

		return null;
	}

	public boolean remover(String nome) {
		return true;
	}


	public ArrayList<Animal> listarTodos() {
		return animais;
	}


	public int quantidade() {
		return 0;
	}
}
