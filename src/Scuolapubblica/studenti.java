package Scuolapubblica;

public class studenti extends Personaggiscuola {

	studenti(String nome, String cognome, int eta ,String professione) {
		super(nome, cognome, eta, professione);
	
	
	
	}
	
	@Override
	public void saluta() {
		System.out.println("Lo studente sta salutando");
	}








}

