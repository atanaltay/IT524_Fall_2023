import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {


    public static void main(String[] args) {


        Map<String,Double> products
                = new HashMap<>();



        products.put("TV",10000.0);
        products.put("keyboard",1000.0);
        products.put("mouse",1000.0);
        products.put("stereo",15000.0);
        products.put("laptop",20000.0);


        System.out.println("Price of TV:" +  products.get("TV"));

        products.put("TV",15000.0);

        System.out.println("Price of TV:" +  products.get("TV"));

        System.out.println("----------------");

        for (String key:products.keySet()
             ) {
            System.out.println(key + ":" + products.get(key));
        }


        if(products.containsKey("TV")){
            System.out.println("TV key exists");
        }

        System.out.println("-----------------------");


        products = new TreeMap<>();

        products.put("tv",10000.0);
        products.put("keyboard",1000.0);
        products.put("mouse",1000.0);
        products.put("stereo",15000.0);
        products.put("laptop",20000.0);

        for (String key:products.keySet()
        ) {
            System.out.println(key + ":" + products.get(key));
        }


    }





}
