package example1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsert {


    public static void main(String[] args) {


        try (
                Connection conn= DriverManager
                        .getConnection("jdbc:postgresql://24.133.104.67:3323/dvdrental",
                                "cdemetci","7asb2370s");
        ){

            PreparedStatement psmt =
                    conn.prepareStatement("insert into users (id,username,password) values(?,?,?)");

            psmt.setInt(1,3);
            psmt.setString(2,"dadada");
            psmt.setString(3,"6789");

            int result = psmt.executeUpdate();

            System.out.println(result  + " number of rows are inserted.");


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

}
