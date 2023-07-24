package Customer.Account;

import Customer.Insurance.Insurance;
import Customer.User;

import java.util.ArrayList;

public class Enterprise extends Account{
    private String company;

    public Enterprise(User user, String company) {
        super(user);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public void addInsurance(Insurance insurance) {
        double price = insurance.getPriceInsurance() * 1.1;
        insurance.setPriceInsurance(price);
        super.getInsurances().add(insurance);
    }

    @Override
    public int compareTo(Account o) {
        return 0;
    }
}
