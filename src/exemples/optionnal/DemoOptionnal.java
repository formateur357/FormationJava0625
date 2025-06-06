package exemples.optionnal;

import java.util.Optional;

record User(long id, String email) { }

class UserRepo {
    Optional<User> findById(long id) {                   // ← retourne Optional
        return switch ((int) id) {
            case 1 -> Optional.of(new User(1, "alice@example.com"));
            case 2 -> Optional.of(new User(2, "bob@example.com"));
            default -> Optional.empty();                 // aucun résultat
        };
    }
}

class Mailer {
    void send(String to, String msg) {
        System.out.println("📧  Mail -> " + to + " : " + msg);
    }
}

public class DemoOptionnal {

    public static void main(String[] args) {

        UserRepo repo   = new UserRepo();
        Mailer   mailer = new Mailer();

        long idDemandé = 1;

        /* Chaîne d’opérations sans aucun if/else null-check ------------- */
        repo.findById(idDemandé)                  // Optional<User>
             .map(User::email)                    // Optional<String>
             .filter(e -> e.endsWith("@example.com"))
             .ifPresentOrElse(
                    email -> mailer.send(email, "Offre spéciale !"),
                    ()    -> System.out.println("Aucun e-mail valide trouvé")
             );
        
        // equivalent a ce qui se trouve au dessus
//        Optional<User> user = repo.findById(idDemandé);
//        Optional<String> email = user.map(User::email);
//        Optional<String> emailVerifier = email.filter(e -> e.endsWith("@example.com"));
//        if (emailVerifier.isEmpty()) {
//        	System.out.println("Aucun e-mail valide trouvé");
//        } else {
//        	mailer.send(emailVerifier.get(), "Offre spéciale !");
//        }

        /* Autres récupérations ------------------------------------------ */
        String email = repo.findById(99)          // vide
                           .map(User::email)      
                           .orElse("inconnu@domaine.com");
        System.out.println("Email de secours : " + email);

        String mustExist = repo.findById(2)
                               .map(User::email)
                               .orElseThrow(() -> new IllegalStateException("User manquant"));
        System.out.println("Email obligatoire : " + mustExist);
    }
}
