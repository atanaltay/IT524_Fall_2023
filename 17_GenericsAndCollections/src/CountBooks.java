import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountBooks {

    public static void main(String[] args) {

        String[] products = {"Origin", "Kördüğüm", "Sen Kimsin?", "Anlatsam Geçer mi?",
                "Korkma! İyi bir Annesin", "Sapiens", "Güzel Kaybettik",
                "Seher", "Sen Kimsin?",  "Korkma! İyi bir Annesin", "Sapiens",
                "Korkma! İyi bir Annesin", "Sen Kimsin?", "Kördüğüm", "Kördüğüm",
                "Sen Kimsin?", "Seher", "Kördüğüm", "Korkma! İyi bir Annesin"};

        Map<String ,Integer> bookCount = new TreeMap<>();


        for (String product:products ) {


            if(bookCount.containsKey(product)){
                bookCount.put(product,bookCount.get(product)+1);
            }else {
                bookCount.put(product, 1);
            }
        }

        System.out.println(bookCount);

        System.out.println("-----------------");

        for (String key: bookCount.keySet()) {
            System.out.println(key + ":" + bookCount.get(key));
        }


        //put
        //get(key)
        //containsKey(key)


        /*
                Anlatsam Geçer mi 1
                BBB             3
                CCC             4

         */





    }


}
