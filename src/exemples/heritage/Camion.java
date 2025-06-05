package exemples.heritage;

public class Camion extends Vehicule {
	
	private final double chargeMax; // kg
	
	public Camion(String imma, String marque, double poids, double chargeMax) {
		super(imma, marque, poids);
		this.chargeMax = chargeMax;
	}
	
	public double getChargeMax() { return chargeMax; }
	
	@Override
	public double consommation(double km) {
		// L/100 = 20 + (chargeMax / 1000)
		return km * (20 + chargeMax / 1000.0) / 100;
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format(" - Camion (charge %.2f kg", chargeMax);
	}
}
