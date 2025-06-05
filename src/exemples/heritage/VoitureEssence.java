package exemples.heritage;

public class VoitureEssence extends Voiture {

	private final double volumeReservoir; // Litres
	
	public VoitureEssence(String imma, String marque, double poids, int nbPortes, double vol) {
		super(imma, marque, poids, nbPortes);
		this.volumeReservoir = vol;
	}
	
	public double getVolumeReservoir() { return volumeReservoir; }
	
	@Override
	public double consommation(double km) {
		double lPer100 = 6 + getPoids() / 1000.0; // L/100
		return km * lPer100 / 100;
	}
	
	@Override
	public double autonomie() {
		return (volumeReservoir / (6 + getPoids() / 1000.0)) * 100;
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format(" - Essence (reservoir %.0f L", volumeReservoir);
	}
}
