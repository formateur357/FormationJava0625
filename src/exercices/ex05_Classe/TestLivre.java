package exercices.ex05_Classe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestLivre {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Livre> rayon = new ArrayList<>();
		
		System.out.println("Combien de livres voulez-vous saisir ?");
		int nb = scan.hasNextInt() ? scan.nextInt() : 0;
		scan.nextLine(); // consomme le retour chariot.
		
		// Creation d'une instance de livre livre 
		// Livre livre1 = new Livre("Le horla, Zola, 5");

		for (int i = 0; i < nb; i++) {
			System.out.printf("%n--- Livre %d ---%n", i + 1);
			
			System.out.print("Titre : ");
			String titre = scan.nextLine().trim();
			
			System.out.print("Auteur : ");
			String auteur = scan.nextLine().trim();
			
			System.out.print("Prix ($): ");
			double prix = scan.hasNextDouble() ? scan.nextDouble() : 0.0;
			scan.nextLine(); // consomme le retour chariot.

			// creation du livre et ajout du livre au rayon
			rayon.add(new Livre(titre, auteur, prix));
			
		}
		
		// Affichage du resultat
		System.out.println("\n== Catalogue ==");
		rayon.forEach(System.out::println);

		scan.close();
	}
}