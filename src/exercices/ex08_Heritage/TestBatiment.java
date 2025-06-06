package exercices.ex08_Heritage;

public class TestBatiment {

	public static void main(String[] args) {

        /*--- Instances de test ---*/
        Batiment b1 = new Batiment();
        Batiment b2 = new Batiment("12 rue des Lilas");

        Maison m1 = new Maison();
        Maison m2 = new Maison("8 avenue Victor Hugo", 5);

        /*--- Affichage ---*/
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(m1);
        System.out.println(m2);

        /*--- Utilisation des mutateurs ---*/
        m1.setAdresse("3 impasse des Acacias");
        m1.setNbPieces(3);
        System.out.println("\nAprès modifications :");
        System.out.println(m1);
	}

}
