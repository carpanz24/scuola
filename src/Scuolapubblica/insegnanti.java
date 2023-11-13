package Scuolapubblica;

public class insegnanti extends Personaggiscuola {

	insegnanti(String nome, String cognome, int eta ,String professione) {
		super(nome, cognome, eta, professione);
	
	
	
	
	}
	
	@Override
	public void saluta() {
		System.out.println("La professoressa sta salutando gli alunni e si chiama " + this.nome);
	}
	







}
