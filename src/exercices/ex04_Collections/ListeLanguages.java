package exercices.ex04_Collections

import java.util.List;

public class ListeLanguages {
	public static void main(String[] args) {
		List<String> languages = new ArrayList<>();
		
		languages.add("PHP");
		languages.add("Java");
		languages.add("JavaScript");
		
		// Affichage le plus simple
		System.out.println("Contenu de la collection : ", languages);
		
		// Affichage avec une boucle for-each
		for (String lang : languages) {
			System.out.println(lang);
		}
		
		// Flux Java 8
		languages.forEach(System.out::println);
	}
}