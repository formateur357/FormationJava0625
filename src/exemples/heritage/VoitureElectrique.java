package exemples.heritage;

public class VoitureElectrique extends Voiture {

	private final double capaciteBatterie; // kWh
	
	public VoitureElectrique(String imma, String marque, double poids, int nbPortes, double capaciteBatterie) {
		super(imma, marque, poids, nbPortes);
		this.capaciteBatterie = capaciteBatterie;
	}
	
	public double getCapaciteBatterie() { return capaciteBatterie; }
	
	@Override
	public double consommation(double km) {
		double kWhPer100 = 15 + getPoids() / 200.0; // kWh/100
		return km * kWhPer100 / 100;
	}
	
	@Override
	public double autonomie() {
		return (capaciteBatterie / (15 + getPoids() / 200.0)) * 100;
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format(" - Electrique (capacite %.0f kWh", capaciteBatterie);
	}
}
