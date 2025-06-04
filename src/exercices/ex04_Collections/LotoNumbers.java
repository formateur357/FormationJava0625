import java.util.ArrayList;
import java.util.List;

public class LotoNumbers {
    public static void main(String[] args) {

        /* 1. Création et remplissage de la liste */
        List<Integer> lotoNumbers = new ArrayList<>();
        lotoNumbers.add(3);
        lotoNumbers.add(11);
        lotoNumbers.add(17);
        lotoNumbers.add(26);
        lotoNumbers.add(42);
        lotoNumbers.add(48);

        /* 2. Parcours avec une boucle while */
        System.out.println("— Parcours while —");
        int i = 0;
        while (i < lotoNumbers.size()) {
            System.out.println(lotoNumbers.get(i));
            i++;
        }

        /* 3. Parcours avec une boucle for indexée */
        System.out.println("\n— Parcours for —");
        for (int j = 0; j < lotoNumbers.size(); j++) {
            System.out.println(lotoNumbers.get(j));
        }

        /* 4. Parcours avec un foreach (enhanced for) */
        System.out.println("\n— Parcours foreach —");
        for (Integer num : lotoNumbers) {
            System.out.println(num);
        }
    }
}
