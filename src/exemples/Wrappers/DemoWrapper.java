package exemples.Wrappers;

import java.util.ArrayList;
import java.util.List;

public class DemoWrapper {

    public static void main(String[] args) {

        /* 1.  On crée une liste *d’objets* Integer (impossible avec int) */
        List<Integer> notes = new ArrayList<>();
        notes.add(15);        // autoboxing : int → Integer.valueOf(15)
        notes.add(12);
        notes.add(null);      // possible, car Integer peut être null
        notes.add(18);

        /* 2.  Calcul de la moyenne (ignorer les valeurs nulles) */
        int total = 0, nb = 0;
        for (Integer note : notes) {
            if (note != null) {          // on vérifie car Integer peut être null
                total += note;           // auto-unboxing : Integer → int
                nb++;
            }
        }
        double moyenne = nb == 0 ? 0 : (double) total / nb;

        /* 3.  Conversion / parsing */
        Integer max = Integer.max(20, 17);          // méthode utilitaire
        int    parsed = Integer.parseInt("42");     // String → int

        /* 4.  Affichage */
        System.out.println("Liste         : " + notes);
        System.out.println("Moyenne (int) : " + moyenne);
        System.out.println("Max exemple   : " + max);
        System.out.println("\"42\" → int  : " + parsed);
    }
}
