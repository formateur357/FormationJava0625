package exercices.ex02_Conditions;

import java.util.Scanner;

public class NoteApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(
System.in
);
        System.out.print("Saisissez une note entre 0 et 20 : ");

        /* ───────── 1.  Validation d’entrée ───────── */
        if (scan.hasNextInt()) {                 // vérifie qu’on a bien un entier
            int note = scan.nextInt();

            /* ───── 1-b.  Vérifier la plage 0-20 ───── */
            if (note < 0 || note > 20) {
                System.out.println("✘ Valeur hors plage (0-20).");
            } else {

                /* ───────── 2.  Message personnalisé ───────── */
                switch (note) {
                    case 20 ->
                        System.out.println("✨ Parfait ! Note maximale.");
                    case 18, 19 ->
                        System.out.println("🌟 Excellent travail !");
                    case 16, 17 ->
                        System.out.println("👍 Très bien, continue ainsi.");
                    case 14, 15 ->
                        System.out.println("🙂 Bien, mais tu peux encore progresser.");
                    case 12, 13 ->
                        System.out.println("😐 Assez bien. Un effort supplémentaire serait bénéfique.");
                    case 10, 11 ->
                        System.out.println("⚠️  Juste la moyenne, attention.");
                    case 8, 9 ->
                        System.out.println("🔍 Insuffisant : révise la leçon.");
                    default ->                    // 0 à 7
                        System.out.println("❌ Échec. Reprends les bases.");
                }
            }
        } else {
            System.out.println("✘ Entrée invalide : vous devez taper un entier.");
        }

        scan.close();
    }
} 