package exemples.heritage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestVehicule {

	public static void main(String[] args) {

        List<Vehicule> flotte = new ArrayList<>();

        // Une moto
        flotte.add(new Moto("M-001", "Yamaha", 180, 600));

        // Deux voitures essence
        flotte.add(new VoitureEssence("E-101", "Renault", 1250, 5, 50));
        flotte.add(new VoitureEssence("E-102", "Peugeot", 1400, 3, 45));

        // Une voiture électrique
        flotte.add(new VoitureElectrique("EL-201", "Tesla", 1850, 5, 75));

        // Un camion
        flotte.add(new Camion("C-301", "Volvo", 7500, 12000));

        /*-------------- Parcours et actions ---------------*/
        for (Vehicule v : flotte) {
            v.demarrer();
            v.arreter();

            double conso150 = v.consommation(150);
            System.out.printf("%s → conso pour 150 km : %.2f L/kWh%n",
                              v.getImmatriculation(), conso150);

            if (v instanceof Voiture car) {
                System.out.printf("    autonomie : %.0f km%n", car.autonomie());
            }
            System.out.println();
        }

        /*-------------- Tri par poids ---------------------*/
        // tri en fonction du poids
        flotte.sort(Comparator.comparing(Vehicule::getPoids));
        
        // tri en fonction du poids decroissant
        flotte.sort((v1, v2) -> Double.compare(v2.getPoids(), v1.getPoids()));

        // tri en fonction du poids decroissant
        flotte.sort(Comparator.comparing(Vehicule::getPoids).reversed());
        
        System.out.println("=== Parc trié par poids croissant ===");
        flotte.forEach(System.out::println);
	}

}
