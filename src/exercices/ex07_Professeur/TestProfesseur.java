package exercices.ex07_Professeur;

public class TestProfesseur {

	public static void main(String[] args) {

		/*--- 5 spécialités ---*/
		Specialite maths = new Specialite("Mathématiques", 1);
		Specialite physique = new Specialite("Physique", 2);
		Specialite progJava = new Specialite("Programmation Java", 3);
		Specialite reseaux = new Specialite("Réseaux", 4);
		Specialite anglais = new Specialite("Anglais", 5);

		/*--- 4 professeurs ---*/
		Professeur p1 = new Professeur("Mme Jean", "Jean", "0607090804", "Jeanjean@live.fr", maths);
		Professeur p2 = new Professeur("M. Martin", "Jean", "0607340804", "Martinjean@live.fr", physique);
		Professeur p3 = new Professeur("Mme Chen", "Jean", "0607012804", "Chenjean@live.fr", reseaux);
		Professeur p4 = new Professeur("M. Gomez", "Jean", "0607045804", "Gomezjean@live.fr", anglais);

		/*--- Attribution des spécialités ---*/
		p1.ajouterSpecialite(physique);
		p1.ajouterSpecialite(anglais);

		p2.ajouterSpecialite(progJava);

		p3.ajouterSpecialite(anglais);
		p3.ajouterSpecialite(maths);

		// p4 reste sans spécialité pour l'exemple

		/*--- Affichage ---*/
		System.out.println(p1);
		System.out.println();
		System.out.println(p2);
		System.out.println();
		System.out.println(p3);
		System.out.println();
		System.out.println(p4);
	}
}
