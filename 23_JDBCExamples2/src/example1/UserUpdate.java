package example1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserUpdate {

    public static void main(String[] args) {


        try (
                Connection conn= DriverManager
                        .getConnection("jdbc:postgresql://24.133.104.67:3323/dvdrental",
                                "cdemetci","7asb2370s");
                ){

            PreparedStatement psmt =
                    conn.prepareStatement("update users set username=? where id=?");
            psmt.setString(1,"mehmet");
            psmt.setInt(2,2);

            int result = psmt.executeUpdate();

            System.out.println(result  + " number of rows are updated.");


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }



}
