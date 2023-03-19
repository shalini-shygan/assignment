import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {
    public static void main(String[] args) {
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement("UPDATE customer SET age = ? WHERE cname = ?")) {
            pstmt.setInt(1, 45);
            pstmt.setString(2, "Bob Johnson");
            int rowsUpdated = pstmt.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Data updated successfully");
            } else {
                System.out.println("No data updated");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
