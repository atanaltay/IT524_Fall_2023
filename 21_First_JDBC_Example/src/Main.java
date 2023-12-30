import java.sql.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://24.133.104.67:3323/dvdrental",
                    "cdemetci","7asb2370s");



           Statement stmt =  conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from actor");

            while(rs.next()){

                System.out.println(rs.getString("first_name"));
            }

            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}