package Customer.Account;


import Customer.Adress.IAdress;
import Customer.Insurance.Insurance;
import Customer.User;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public abstract class Account implements Comparable<Account>{
    private User user;
    private AuthenticationStatus authenticationStatus;
    private ArrayList<Insurance> insurances;

    public Account(User user) {
        this.user = user;
        this.authenticationStatus = AuthenticationStatus.FAIL;
        this.insurances = new ArrayList<>();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public AuthenticationStatus getAuthenticationStatus() {
        return authenticationStatus;
    }

    public void setAuthenticationStatus(AuthenticationStatus authenticationStatus) {
        this.authenticationStatus = authenticationStatus;
    }

    public ArrayList<Insurance> getInsurances() {
        return insurances;
    }

    public void setInsurances(ArrayList<Insurance> insurances) {
        this.insurances = insurances;
    }

    public final void showUserInfo(){
        System.out.println("Name: " + user.getName());
        System.out.println("Surname: " + user.getSurname());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Job: " + user.getJob());
        System.out.println("Last Login Date: " + user.getLastLoginDate());

        System.out.println("Addresses:");
        ArrayList<IAdress> addresses = user.getAddresses();
        for (IAdress address : addresses) {
            System.out.println(address.getAddressDetails());
        }
    }

    public void login(String email, String password) throws InvalidAuthenticationException {
        if (this.user.getEmail().equals(email) && this.user.getPassword().equals(password)) {
            this.authenticationStatus = AuthenticationStatus.SUCCESS;
        } else {
            this.authenticationStatus = AuthenticationStatus.FAIL;
            throw new InvalidAuthenticationException("Invalid email or password");
        }
    }

    public void addAdress(IAdress adress){
        if (this.authenticationStatus == AuthenticationStatus.SUCCESS)
            this.user.getAddresses().add(adress);
    }

    public void removeAdress(IAdress adress){
        if (this.authenticationStatus == AuthenticationStatus.SUCCESS)
            this.user.getAddresses().remove(adress);
    }

    public abstract void addInsurance(Insurance insurance);

    @Override
    public int compareTo(Account account){
        return this.user.getEmail().compareTo(account.user.getEmail());
    }

    @Override
    public int hashCode() {
        return this.user.getEmail().hashCode();
    }

    @Override
    public boolean equals(Object otherObj) {
        if (this == otherObj) {
            return true;
        }
        if (!(otherObj instanceof Account)) {
            return false;
        }
        Account otherAccount = (Account) otherObj;
        // Burada hesaplamanızı farklı bir özellik veya kritere göre yapabilirsiniz.
        // Örneğin, hesapları kullanıcı adlarına göre eşleştirelim.
        return this.user.getEmail().equals(otherAccount.user.getEmail());
    }
}
