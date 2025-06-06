package exemples.generique;

import java.util.ArrayList;
import java.util.List;

public class TestBoite {

    public static void main(String[] args) {

        /* ---------- 1. DÉMONSTRATION DE Boite<T> ---------- */
        Boite<String> b1 = new Boite<>();
        b1.set("Coucou");
        String s = b1.get();                    // pas de cast
        System.out.println("Boite<String> : " + s);

        Boite<Integer> b2 = new Boite<>();
        b2.set(42);
        int n = b2.get();                       // auto-unboxing
        System.out.println("Boite<Integer> : " + n);

        /* ---------- 2. LISTE DE LISTES (pas de tableau générique) ---------- */
//		List<String>[] tab = new List<String>[10]; // compile error
        List<List<String>> classes = new ArrayList<>();

        List<String> c0 = new ArrayList<>();    // <String> ajouté
        c0.add("Alice");
        c0.add("Bob");
        classes.add(c0);

        List<String> c1 = List.of("Julie", "Tom");  // liste immuable, c’est OK
        classes.add(c1);

        classes.get(0).add("Axel");             // OK : c0 est modifiable

        String eleve = classes.get(1).get(1);   // "Tom"
        System.out.println("\nÉlève récupéré : " + eleve + "\n");

        /* ---------- 3. AFFICHAGE PROPRE DES CLASSES ---------- */
        for (int i = 0; i < classes.size(); i++) {
            List<String> classe = classes.get(i);
            System.out.println("Classe " + i + " (" + classe.size() + " élèves) :");
            classe.forEach(e -> System.out.println("  • " + e));
            System.out.println();
        }
    }
}
