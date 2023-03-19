import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetrieveData {
    public static void main(String[] args) {
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM customer")) {
            while (rs.next()) {
                int cid = rs.getInt("cid");
                String cname = rs.getString("cname");
                String loc = rs.getString("loc");
                int age = rs.getInt("age");
                System.out.println(cid + "\t" + cname + "\t" + loc + "\t" + age);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
