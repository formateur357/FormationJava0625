package exercices.ex07_Professeur;

import java.util.ArrayList;
import java.util.List;

public class Professeur {
	
	/*------------- Attributs -------------*/ 
	private static int nextId = 0;
	
	private final int id;
	private String nom;
	private String prenom;
	private String telephone;
	private String email;
	private List<Specialite> specialites = new ArrayList<>();

	/*------------- Constructeurs -------------*/ 
	public Professeur(String nom, String prenom, String telephone, String email, Specialite specialite) {
		this.id = Professeur.nextId++;
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.email = email;
		this.specialites.add(specialite);
	}
	
	/*------------- Accesseurs -------------*/ 
	public int getId() { return id; }
	public String getNom() { return nom; }
	public String getPrenom() { return prenom; }
	public String getTelephone() { return telephone; }
	public String getEmail() { return email; }
	public List<Specialite> getSpecialites() { return new ArrayList<>(specialites); }
	
	/*------------- Mutateurs -------------*/ 
	public void setNom(String nom) { this.nom = nom; }
	public void setPrenom(String prenom) { this.prenom = prenom; }
	public void setTelephone(String telephone) { this.telephone = telephone; }
	public void setEmail(String email) { this.email = email; }
	
	public void ajouterSpecialite(Specialite s) {
		if (s != null && !specialites.contains(s)) {
			specialites.add(s);
		}
	}
	
	/*------------- toString -------------*/
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(
			String.format("Professeur  #%d - %s %s%n %s%n %s%n Specialites :", id, nom, prenom, telephone, email)
		);
		
		if (specialites.isEmpty()) {
			sb.append(" (aucune)");
		} else {
			specialites.forEach(sp -> sb.append("\n    . ").append(sp.getLibelle()));
		}
		
		return sb.toString();
	}
}
