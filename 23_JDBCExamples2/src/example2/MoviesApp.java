package example2;

import com.sun.source.tree.Tree;
import com.sun.source.util.Trees;

import java.sql.*;
import java.util.*;

public class MoviesApp {

    public static void main(String[] args) {


        try(
                Connection conn= DriverManager
                        .getConnection("jdbc:postgresql://24.133.104.67:3323/dvdrental",
                                "cdemetci","7asb2370s");
                ) {

            String query = "select f.title,c.name as category,f.release_year from film f inner join film_category fc on f.film_id = fc.film_id " +
                    "inner join category c on fc.category_id = c.category_id;";

            PreparedStatement psmt = conn.prepareStatement(query);
            ResultSet rs = psmt.executeQuery();

            Map<String, TreeSet<Movie>> data = new TreeMap<>();

            while(rs.next()){
                String title = rs.getString("title");
                String category = rs.getString("category");
                int year = rs.getInt("release_year");

                Movie movie = new Movie(title,category,year);

                if(data.containsKey(category)){

                    data.get(category).add(movie);

                }else{

                    TreeSet<Movie> cat_movies = new TreeSet<>();

                    cat_movies.add(movie);

                    data.put(category,cat_movies);

                }


            }


            for (String key: data.keySet()) {

                System.out.println("Category:" + key);

                TreeSet<Movie> movs = data.get(key);

                for (Movie mov: movs) {
                    System.out.println("\t" +  mov);
                }


            }





        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

}
