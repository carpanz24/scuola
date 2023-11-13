package Scuolapubblica;

public class scuolaMedia {

	public static void main(String[] args) {

	bidelli bidello1 = new bidelli("Mario", "Rossi", 38, "bidello del primo piano");
	bidelli bidello2 = new bidelli("Luca", "Verdi", 22, "bidello del secondo piano");

	studenti studente1 = new studenti("Paolo", "Lalli", 18, "Studente del quinto anno");
	studenti studente2 = new studenti("Gianni", "Varti", 16, "Studente del terzo anno");
	studenti studente3 = new studenti("Fede", "Polli", 14, "Studente del primo anno");
	studenti studente4 = new studenti("Lorenzo", "Belluni", 15, "Studente del secondo anno");
	studenti studente5 = new studenti("Giulia", "Lallano", 16, "Studente del terzo anno");
	studenti studente6 = new studenti("Virgi", "Battino", 17, "Studente del quarto anno");

	insegnanti insegnante1 = new insegnanti ("Laura", "Narani", 58, "Professoressa di italiano");
	insegnanti insegnante2 = new insegnanti ("Maria", "Babbi", 45, "Professoressa di storia");
	
	Personaggiscuola [] scuola = {bidello1,bidello2,studente1,studente2,studente3,studente4,studente5,studente6,insegnante1,insegnante2};
	
	System.out.println("Elenco personale e studenti scuola Duca d'aosta: ");
	System.out.println();
	System.out.println("nome / cognome |   eta    |    professione");
	System.out.println();
	
	for (Personaggiscuola personale : scuola) {
		
		System.out.println(personale.nome + " " + personale.cognome + "        |" + personale.eta + "|     " + personale.professione + "\n");
	}
	
	System.out.println("Le persone all'interno della scuola sono: " + Personaggiscuola.contaPersone);
	System.out.println();

	if (Personaggiscuola.contaPersone >= 10) {
		System.out.println("Le iscrizioni alla scuola sono finite, siamo al completo");
	}
	


	
	
	
	
	
	
	
	}

}
