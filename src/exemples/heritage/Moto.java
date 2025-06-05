package exemples.heritage;

public class Moto extends Vehicule {

	private final int cylindree; // cm3
	
	public Moto(String imma, String marque, double poids, int cylindree) {
		super(imma, marque, poids);
		this.cylindree = cylindree;
	}
	
	public int getCylindree() { return cylindree; }
	
	@Override
	public double consommation(double km) {
		// L/100 = 3 + (cylindree / 1000)
		return km * (3 + cylindree / 1000.0) / 100;
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format(" - %dcc", cylindree);
	}
}
