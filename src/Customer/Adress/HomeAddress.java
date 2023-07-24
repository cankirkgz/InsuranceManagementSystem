package Customer.Adress;

public class HomeAddress implements IAdress {
    private String city;
    private String street;
    private String country;
    private int postNumber;

    public HomeAddress(String city, String street, String country, int postNumber) {
        this.city = city;
        this.street = street;
        this.country = country;
        this.postNumber = postNumber;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPostNumber() {
        return postNumber;
    }

    public void setPostNumber(int postNumber) {
        this.postNumber = postNumber;
    }

    @Override
    public String getAddressDetails() {
        return "Home Address: " + city + ", " + street + " " + postNumber;
    }
}
