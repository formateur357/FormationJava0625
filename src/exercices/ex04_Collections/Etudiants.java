package exercices.ex04_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Etudiants {

    public static void main(String[] args) {

        List<String> etudiants = new ArrayList<>();
        Scanner scan           = new Scanner(System.in);
        boolean continuer      = true;

        while (continuer) {
            /* ----------- 1.  Menu principal ----------- */
            System.out.println("""
                -------------------------
                Choisissez une action :
                  A  →  Ajouter un étudiant
                  B  →  Voir la liste
                  C  →  Quitter
                -------------------------""");
            System.out.print("Votre choix : ");

            String choix = scan.nextLine().trim().toUpperCase();

            /* ----------- 2.  Dispatcher ----------- */
            switch (choix) {
                case "A" -> {
                    System.out.print("Nom de l’étudiant à ajouter : ");
                    String nom = scan.nextLine().trim();
                    if (!nom.isEmpty()) {
                        etudiants.add(nom);
                        System.out.printf("✅  %s ajouté(e).%n%n", nom);
                    } else {
                        System.out.println("✘ Nom vide : rien ajouté.\n");
                    }
                }
                case "B" -> {
                    System.out.println("\n===== Liste des étudiants =====");
                    if (etudiants.isEmpty()) {
                        System.out.println("(liste vide)");
                    } else {
                        for (int i = 0; i < etudiants.size(); i++) {
                            System.out.printf("%2d. %s%n", i + 1, etudiants.get(i));
                        }
                    }
                    System.out.println("===============================\n");
                }
                case "C" -> {
                    System.out.println("Au revoir !");
                    continuer = false;
                }
                default -> System.out.println("Choix inconnu — veuillez saisir A, B ou C.\n");
            }
        }
        scan.close();
    }
}
