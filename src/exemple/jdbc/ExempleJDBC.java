package exemple.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExempleJDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/ma_base";
        String user = "root";
        String password = "root";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT id, nom, age FROM clients")) {

            // Itération sur les résultats
            while (rs.next()) {
                int id = rs.getInt("id");
                String nom = rs.getString("nom");
                int age = rs.getInt("age");

                System.out.println("Client " + id + " : " + nom + ", " + age + " ans");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//Remarques
//La connexion est automatiquement fermée grâce au try-with-resources.
//
//Le Statement permet d’exécuter des requêtes SQL (executeQuery pour les SELECT, executeUpdate pour INSERT/UPDATE/DELETE).
