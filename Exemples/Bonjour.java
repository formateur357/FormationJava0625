public class Bonjour { // Accolade débutant la classe Bonjour
	public static void main(String args[]) { // Accolade débutant la méthode main
		// verifier qu'au moins un argument a ete fourni
		if (args.length == 0) {
			System.out.println("Usage: java Bonjour <prenom>");
			return;
		}
		
		for (String arg : args) {
			System.out.println("Bonjour " + arg );
		}
	} // Accolade fermant la méthode main
} 

// java Bonjour Morgan Pierre Alain
// -> Bonjour Morgan
// -> Bonjour Pierre
// -> Bonjour alain