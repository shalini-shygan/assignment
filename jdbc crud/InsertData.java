import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {
    public static void main(String[] args) {
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement("INSERT INTO customer (cid, cname, loc, age) VALUES (?, ?, ?, ?)")) {
            pstmt.setInt(1, 1);
            pstmt.setString(2, "John Smith");
            pstmt.setString(3, "New York");
            pstmt.setInt(4, 30);
            pstmt.executeUpdate();

            pstmt.setInt(1, 2);
            pstmt.setString(2, "Jane Doe");
            pstmt.setString(3, "Los Angeles");
            pstmt.setInt(4, 25);
            pstmt.executeUpdate();

            pstmt.setInt(1, 3);
            pstmt.setString(2, "Bob Johnson");
            pstmt.setString(3, "Chicago");
            pstmt.setInt(4, 40);
            pstmt.executeUpdate();

            pstmt.setInt(1, 4);
            pstmt.setString(2, "Alice Lee");
            pstmt.setString(3, "San Francisco");
            pstmt.setInt(4, 35);
            pstmt.executeUpdate();

            System.out.println("Data inserted successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
