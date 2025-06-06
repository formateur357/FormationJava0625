package exercices.ex08_Heritage;

public class Batiment {
	private String adresse;
	
	public Batiment() {
		this.adresse = "Adresse inconnue";
	}
	
	public Batiment(String adresse) {
		this.adresse = adresse;
	}
	
	public String getAdresse() { return adresse; }
	
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	// Autre facon de l'ecrire avec un nom de param different de l'attribut
//	public void setAdresse(String ad) {
//		adresse = ad;
//	}
	
	@Override
	public String toString() {
		return String.format("Batiment situe %s", adresse);
	}
}
