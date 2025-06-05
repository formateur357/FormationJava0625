package exemples.heritage;

public abstract class Voiture extends Vehicule {

	private final int nbPortes;
	
	protected Voiture(String imma, String marque, double poids, int nbPortes) {
		super(imma, marque, poids);
		this.nbPortes = nbPortes;
	}
	
	public int getNbPortes() { return nbPortes; }
	
	// Chaque voiture fournira sa propre consommation et autonomie
	public abstract double autonomie();
	
	@Override
	public String toString() {
		return super.toString() + String.format(" - %d portes", nbPortes);
	}}
