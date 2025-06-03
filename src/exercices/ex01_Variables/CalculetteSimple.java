package exercices.ex01_Variables;

import java.util.Scanner;

public class CalculetteSimple {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Veuillez entrer 2 nombres dont la somme et le produit seront calculees.");

		int nb = Integer.parseInt(scan.nextLine());
		int nb2 = Integer.parseInt(scan.nextLine());
		
		int somme = nb + nb2;
		
		int produit = nb * nb2;
		
		System.out.println("Somme : " + somme + "\nProduit : " + produit);
	}
}
