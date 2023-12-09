//JavaBean, POJO: Plain Old Java Object
public class Address {

    private String city;
    private String street;
    private String postCode;


    public Address(){

    }

    public Address(String city, String street, String postCode) {
        this.city = city;
        this.street = street;
        this.postCode = postCode;
    }

    public String printSummary(){

        return String.format("Address - City: %s, Street: %s, Postcode: %s",
                city,street,postCode);

    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
}
