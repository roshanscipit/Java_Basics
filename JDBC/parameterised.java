package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class parameterised{

    public static void main(String[] args) throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = null;
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
        System.out.println("✓ Connection successful!");
        
        PreparedStatement stmt =conn.prepareStatement("INSERT INTO students(name, age) VALUES (?, ?)");
        stmt.setString(1, "John Doe");
        stmt.setInt(2, 25);  // age as integer
        int rowsInserted = stmt.executeUpdate();
        if (rowsInserted > 0) {

            System.out.println("A new user was inserted successfully!");
        } else {
            System.out.println("✗ No rows inserted!");
        }
        
        stmt.close();
        conn.close();
        System.out.println("✓ Connection closed!");
    }
}