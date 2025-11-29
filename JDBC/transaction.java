package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;


public class transaction {
    // Transaction management code would go here

    public static void main(String[] args) throws Exception {
        System.out.println("Transaction management example");

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
        try {   
            conn.setAutoCommit(false); // Start transaction

            // Perform multiple database operations here

            conn.commit(); // Commit transaction
            System.out.println("Transaction committed successfully!");
        } catch (Exception e) {
            conn.rollback(); // Rollback transaction on error
            System.out.println("Transaction rolled back due to error: " + e.getMessage());
        } finally {
            conn.setAutoCommit(true); // Restore default auto-commit behavior
            conn.close();
        }
    }
}
