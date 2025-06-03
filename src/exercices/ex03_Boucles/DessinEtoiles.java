package exercices.ex03_Boucles;

import java.util.Scanner;

public class DessinEtoiles {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = 0;          // valeurs par défaut pour éviter « may not have been initialized »
        int largeur = 0;
        int longueur = 0;

        /* 1. Choix de la figure ------------------------------------------------ */
        System.out.print("""
                Que voulez-vous dessiner ?
                  1 -> Ligne
                  2 -> Carré
                  3 -> Triangle
                  4 -> Rectangle

                Votre choix : """);

        int choix = scan.hasNextInt() ? scan.nextInt() : -1;
        scan.nextLine(); // vide le reste de la ligne

        /* 2. Lecture des dimensions ------------------------------------------- */
        if (choix == 1 || choix == 2 || choix == 3) {
            do {
                System.out.print("Entrez un entier (1–50) : ");
                n = scan.hasNextInt() ? scan.nextInt() : -1;
                scan.nextLine();
            } while (n <= 0 || n > 50);
        } else if (choix == 4) {
            do {
                System.out.print("Largeur (1–50)  : ");
                largeur = scan.hasNextInt() ? scan.nextInt() : -1;
                scan.nextLine();
            } while (largeur <= 0 || largeur > 50);

            do {
                System.out.print("Longueur (1–50) : ");
                longueur = scan.hasNextInt() ? scan.nextInt() : -1;
                scan.nextLine();
            } while (longueur <= 0 || longueur > 50);
        } else {
            System.out.println("Choix invalide.");
            scan.close();
            return;
        }

        /* 3. Dessin ------------------------------------------------------------ */
        switch (choix) {
            case 1 -> dessinerLigne(n);
            case 2 -> dessinerCarre(n);
            case 3 -> dessinerTriangle(n);
            case 4 -> dessinerRectangle(largeur, longueur);
            default -> {}   // ne peut plus arriver
        }

        scan.close();
    }

    /* ---------- Fonctions d'affichage ---------------------------------------- */

    private static void dessinerLigne(int n) {
        System.out.println("*".repeat(n));
    }

    private static void dessinerCarre(int n) {
        String ligne = "*".repeat(n);
        for (int i = 0; i < n; i++) {
            System.out.println(ligne);
        }
    }

    private static void dessinerTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("*".repeat(i));
        }
    }

    private static void dessinerRectangle(int largeur, int longueur) {
        String ligne = "*".repeat(largeur);
        for (int i = 0; i < longueur; i++) {
            System.out.println(ligne);
        }
    }
}
