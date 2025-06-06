package exemple.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ExemplePreparedStatement {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/ma_base";
        String user = "root";
        String password = "root";

        String sql = "SELECT id, nom, age FROM clients WHERE age > ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, 30); // Paramètre 1 = 30

            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    System.out.println(rs.getString("nom") + ", " + rs.getInt("age"));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

