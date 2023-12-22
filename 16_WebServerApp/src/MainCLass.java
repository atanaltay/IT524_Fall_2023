import model.HomePage;
import model.ProductPage;
import model.WebServer;

public class MainCLass {

    public static void main(String[] args) {

        WebServer server = new WebServer();

        HomePage homePage = new HomePage("altug",
                "Home","Home page content.....");

        ProductPage prodPage = new ProductPage(new String[]{
                "TV","Laptop","Mouse", "Keyboard"
        });


        server.displayPage(homePage);
        server.displayPage(prodPage);


    }


}
