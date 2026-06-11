package pet;

public class ClinicaVeterinaria {

	public static void main(String[] args) {
		Cachorro filaEstetica[] = new Cachorro[2];
		Cachorro a = new Cachorro("palmitto", "golden retriever", 1);
		filaEstetica[0] = a;
		
		Cachorro b = new Cachorro("mel", "borderline", 2);
		filaEstetica[1] = b;
		
		for (int i = 0; i < filaEstetica.length; i++) {
			filaEstetica[i].cortarUnhas();
			filaEstetica[i].darBanho();
		}
	}

}
