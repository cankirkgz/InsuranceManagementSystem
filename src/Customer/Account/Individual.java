package Customer.Account;

import Customer.Insurance.Insurance;
import Customer.User;

import java.util.ArrayList;

public class Individual extends Account{
    public Individual(User user) {
        super(user);
    }

    @Override
    public void addInsurance(Insurance insurance) {
        double price = insurance.getPriceInsurance() * 0.95;
        insurance.setPriceInsurance(price);
        super.getInsurances().add(insurance);

    }

    @Override
    public int compareTo(Account o) {
        return 0;
    }
}
