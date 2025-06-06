package exercices.ex08_Heritage;

public class Maison extends Batiment {

	private int nbPieces;
	
	public Maison() {
		super();
		this.nbPieces = 1;
	}
	
	public Maison(String adresse) {
		super(adresse);
		this.nbPieces = 3;
	}
	
	public Maison(int nbPieces) {
		super();
		this.nbPieces = nbPieces;
	}
	
	public Maison(String adresse, int nbPieces) {
		super(adresse);
		this.nbPieces = nbPieces;
	}
	
	public int getNbPieces() { return nbPieces; }
	
	public void setNbPieces(int nbPieces) {
		this.nbPieces = nbPieces;
	}
	
	@Override
	public String toString() {
		return String.format("Maison situe %s%n Nombre de pieces : %d.", getAdresse(), nbPieces);
	}
}
