package model;

public class ProductPage implements Page{

    private String[] products;

    public ProductPage(String[] products) {
        this.products = products;
    }

    @Override
    public void getContent() {

        System.out.println("Products:");

        for (String prod:products
             ) {
            System.out.println(prod);
        }


    }
}
