import java.sql.*;
public class SignUp {
    public static void main(String args[]) throws ClassNotFoundException,
            SQLException {
        String q = "select * from signup";
//step 1 Driver registration
        Class.forName("com.mysql.cj.jdbc.Driver");
//step 2 Connection establishment

        Connection
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_for_storage_task_1", "root", "root");
//step 3 create Statement
        Statement st = con.createStatement();
//step 4 query
        ResultSet rs = st.executeQuery(q);
        while (rs.next()) {
            System.out.println("no is " + rs.getInt(1));
            System.out.println("Email is " + rs.getString(2));
            System.out.println("Password is " + rs.getString(3));
        }
//step 5 close connection
        con.close();
    }
}