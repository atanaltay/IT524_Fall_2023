package example1;

import javax.swing.plaf.nimbus.State;
import java.sql.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        /*
        * 1- Open Connection
        * 2- Run query, Parse Resultws
        * 3- Close COnnection
        * */

        //Java Steps:
        // Create Connection
        // From connection create Statement
        //Run Statement and get a ResultSet back
        //Close connection


        try(
                Connection conn= DriverManager
                        .getConnection("jdbc:postgresql://24.133.104.67:3323/dvdrental",
                                "cdemetci","7asb2370s");

                ){

            //executeUpdate() -> insert, update, delete
            //executeQuery()-> select
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from film");

            System.out.println("Movies:");

           while(rs.next()){

               System.out.println(rs.getString("title")+ " "+
                       rs.getInt("release_year"));

               System.out.println("----------------");


           }


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}