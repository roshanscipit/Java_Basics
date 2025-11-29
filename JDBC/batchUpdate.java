package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Arrays;
import java.sql.BatchUpdateException;


public class batchUpdate{

    public static void main(String[] args) throws Exception
    {
        System.out.println("Starting batch update...");
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
        Statement stmt = conn.createStatement();
        stmt.addBatch("INSERT INTO students(name, age) VALUES ('Alice', 22)");  
        stmt.addBatch("INSERT INTO students(name, age) VALUES ('Bob', 24)");
        int[] rowsAffected = stmt.executeBatch();   
        System.out.println("Rows affected: " + Arrays.toString(rowsAffected));
        stmt.close();
        conn.close();
    }
}