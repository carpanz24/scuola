package Scuolapubblica;

public class Personaggiscuola {

	String nome;
	String cognome;
	String professione;
	int eta;
	public static int contaPersone;
	
	Personaggiscuola (String nome, String cognome, int eta, String professione){
		
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.professione = professione;
		contaPersone++;
		
		
		
	}
	
	
	
	public void saluta() {
		System.out.println("Un tizio sta salutando");
	}
	
	
		
	






}
