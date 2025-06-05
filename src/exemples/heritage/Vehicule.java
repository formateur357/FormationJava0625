package exemples.heritage;

public abstract class Vehicule {

	/*--------- Attributs communs ---------*/
	private final String immatriculation;
	private final String marque;
	private final double poids; //kg
	
	/*--------- Constructeur ---------*/
	protected Vehicule(String immatriculation, String marque, double poids) {
		this.immatriculation 	= immatriculation;
		this.marque 			= marque;
		this.poids 				= poids;
	}
	
	/*--------- Accesseurs ---------*/
	public String getImmatriculation() { return immatriculation; }
	public String getMarque() { return marque; }
	public double getPoids() { return poids; }
	
	/*--------- Methodes communes ---------*/
	public void demarrer() { System.out.println(immatriculation + " demarre.");}
	public void arreter() { System.out.println(immatriculation + " s'arrete.");}
	
	/** Consommation pour un trajet de km ( unites : L/100 ou kwh/100). */
	public abstract double consommation(double km);

	@Override
	public String toString() {
		return String.format("%s %s %s (%.0f kg)", getClass().getSimpleName(), immatriculation, marque, poids);
	}
}
