//4️⃣ Introduction à l'API JPA : objectifs et petite démo
//Qu’est-ce que JPA ?
//JPA = Java Persistence API
//
//API de mapping objet-relationnel (ORM) standardisée pour Java
//
//Permet de manipuler les entités Java et de les synchroniser avec la base de données, sans écrire de SQL.
//
//Objectifs
//✅ Simplifier le développement
//✅ Éviter le code "plomberie" de JDBC
//✅ Orienté objet
//✅ Gestion automatique du cycle de vie des entités
//✅ Support de transactions

package exemple.jdbc;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ExempleJPA {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ma_pu");
        EntityManager em = emf.createEntityManager();

        // Transaction
        em.getTransaction().begin();

        // Création d'un client
        Client c = new Client();
        c.setNom("Alice");
        c.setAge(35);
        em.persist(c); // Enregistrement en base

        em.getTransaction().commit();

        // Lecture
        Client clientLu = em.find(Client.class, c.getId());
        System.out.println(clientLu);

        em.close();
        emf.close();
    }
}

//Résultat
//Plus besoin de gérer les Connection, Statement, etc.
//
//Requêtes plus orientées objet.
//
//Support d'un contexte transactionnel.


// Conclusion

// _________________________________|_____________________________________________________
// JDBC								| JPA
// _________________________________|_____________________________________________________
// Bas niveau, SQL direct			| Haut niveau, abstrait, ORM
// Contrôle fin						| Simplification importante
// Beaucoup de code "plomberie"		| API objet élégante
// Bonne perf sur requêtes simples	| Parfait pour la gestion du cycle de vie des entités


//➡️ Résumé du cours
//✅ JDBC : Connexion → Statement → ResultSet
//✅ PreparedStatement : requêtes paramétrées
//✅ CallableStatement : procédures stockées
//✅ JPA : ORM + entités + EntityManager
