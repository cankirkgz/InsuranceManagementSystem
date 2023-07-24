package Customer.Adress;

public class BusinessAddress implements IAdress {
    private String city;
    private String street;
    private String country;
    private int postNumber;
    private String companyName;


    public BusinessAddress(String city, String street, String country, int postNumber, String companyName) {
        this.city = city;
        this.street = street;
        this.country = country;
        this.postNumber = postNumber;
        this.companyName = companyName;
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String getAddressDetails() {
        return "Business Address: " + city + ", " + street + ", Country: " + country + ", " + postNumber
                + "Company: " + companyName;
    }


}
