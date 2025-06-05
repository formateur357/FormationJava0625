package exercices.ex05_Classe;

public class Livre {
	// Attributs
	private static int prochainId = 0; // Compteur commun a tous les livres
	
	private String 		titre;
	private String 		auteur;
	private double 		prix;
	private final int 	id; // identifiant auto-incremente
	
	/** 
	 * Constructeur, construit un livre avec les valeurs sqisie par l'utilisateur.
	 * L'identifiant est attribue automatiquement
	 */
	public Livre(String titre, String auteur, double prix) {
		this.id = Livre.prochainId++; 
		this.titre = titre;
		this.auteur = auteur;
		this.prix = prix;
	}
	
	// Accesseurs (get)
	public int getId() { return id; }
	public String getTitre() { return titre; }
	public String getAuteur() { return auteur; }
	public double getPrix() { return prix; }

	// Mutateurs (set)
	public void setTitre(String titre) { this.titre = titre; }
	public void setAuteur(String auteur) { this.auteur = auteur; }
	public void setPrix(float prix) { this.prix = prix; }

	@Override
	public String toString() {
		return String.format(
				"Livre n~%d - << %s >>, %s (%.2f $)",
				id, titre, auteur, prix);
	}
}