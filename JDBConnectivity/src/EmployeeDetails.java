import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDetails {
    public static void main(String[] args) {
        // Database URL, username, and password
        String url = "jdbc:mysql://localhost:3306/database_for_storage_task_1";
        String user = "root";
        String password = "root";

        // SQL query to retrieve employee details
        String query = "SELECT * FROM employee";

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Step 1: Load and register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish a connection
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection successful!");

            // Step 3: Create a statement
            statement = connection.createStatement();

            // Step 4: Execute the query
            resultSet = statement.executeQuery(query);

            // Step 5: Process the result set
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String position = resultSet.getString("position");
                double salary = resultSet.getDouble("salary");
                java.sql.Date hireDate = resultSet.getDate("hire_date");

                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Position: " + position);
                System.out.println("Salary: " + salary);
                System.out.println("Hire Date: " + hireDate);
                System.out.println("----------");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("SQL exception occurred.");
            e.printStackTrace();
        } finally {
            // Step 6: Close resources
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
