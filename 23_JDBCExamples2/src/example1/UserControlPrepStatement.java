package example1;

import java.sql.*;
import java.util.Scanner;

public class UserControlPrepStatement {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Username:");

        String username = input.nextLine();

        System.out.println("Password:");

        String password = input.nextLine();


        String query = "select count(*) from users where username=? and password=?";

        try(
                Connection conn= DriverManager
                        .getConnection("jdbc:postgresql://24.133.104.67:3323/dvdrental",
                                "cdemetci","7asb2370s");

        ){

            //executeUpdate() -> insert, update, delete
            //executeQuery()-> select

            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1,username);
            stmt.setString(2,password);


            ResultSet rs = stmt.executeQuery();

            rs.next();

            int userCount = rs.getInt("count");

            if(userCount>0){
                System.out.println("You are logged in");
            }else{
                System.out.println("Username or Password is WRONG!!");
            }




        } catch (SQLException e) {
            e.printStackTrace();
        }




    }


}
