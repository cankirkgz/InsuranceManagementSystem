package Customer;

import Customer.Adress.IAdress;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class User {
    private String name;
    private String surname;
    private String email;
    private String password;
    private String job;
    private int age;
    private ArrayList<IAdress> addresses;
    private LocalDate lastLoginDate;

    public User(String name, String surname, String email, String password, String job, int age) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.job = job;
        this.age = age;
        this.addresses = new ArrayList<IAdress>();
        this.lastLoginDate = LocalDate.now();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public ArrayList<IAdress> getAddresses() {
        return addresses;
    }

    public void setAddresses(ArrayList<IAdress> addresses) {
        this.addresses = addresses;
    }

    public LocalDate getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(LocalDate lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public void addAdress(IAdress adress) {
        this.addresses.add(adress);
    }
    public void removeAddress(IAdress address) {
        this.addresses.remove(address);
    }

    public void updateLastLogin() {
        this.lastLoginDate = LocalDate.now();
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }
}
