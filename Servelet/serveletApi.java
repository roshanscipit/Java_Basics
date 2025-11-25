package Servelet;

public class serveletApiDemo extends javax.servlet.http.HttpServlet {

    private Connection connection;

    @Override
    public void init() throws javax.servlet.ServletException {
        // Initialize database connection
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = java.sql.DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mydb", "user", "password");
        } catch (Exception e) {
            throw new javax.servlet.ServletException("DB Connection error", e);
        }
    }

    @Override
    public void service(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, java.io.IOException {
        String action = request.getParameter("action");
        if ("fetch".equals(action)) {
            // Fetch data from database
            try {
                java.sql.Statement stmt = connection.createStatement();
                java.sql.ResultSet rs = stmt.executeQuery("SELECT * FROM mytable");
                java.io.PrintWriter out = response.getWriter();
                while (rs.next()) {
                    out.println("Data: " + rs.getString("data_column"));
                }
            } catch (java.sql.SQLException e) {
                throw new javax.servlet.ServletException("DB Query error", e);
            }
        } else {
            response.getWriter().println("Unknown action");
        }
    }
    
    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, java.io.IOException {
        response.setContentType("text/plain");
        response.getWriter().println("Hello, Servlet API!");
    }

    @Override
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, java.io.IOException {
        String data = request.getParameter("data");
        response.setContentType("text/plain");
        response.getWriter().println("Received data: " + data);
    }

    @Override
    public void destroy() {
        // Clean up database connection
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
    }


public class serveletApi {

    public static void main(String[] args) {
        // Placeholder for Servlet API example

        
    }
    
}