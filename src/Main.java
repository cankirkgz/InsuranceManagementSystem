import Customer.Account.*;
import Customer.Adress.AddressManager;
import Customer.Adress.BusinessAddress;
import Customer.Adress.HomeAddress;
import Customer.Adress.IAdress;
import Customer.Insurance.*;
import Customer.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static AccountManager accountManager = new AccountManager();

    public static void main(String[] args) {
        initializeSampleData();

        System.out.println("Welcome to Insurance Management System!");
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Login");
            System.out.println("2. Create Individual Account");
            System.out.println("3. Create Enterprise Account");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    loginMenu();
                    break;
                case 2:
                    createIndividualAccount();
                    break;
                case 3:
                    createEnterpriseAccount();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void loginMenu() {
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        Account loggedInAccount = accountManager.login(email, password);
        if (loggedInAccount != null) {
            System.out.println("Login successful!");
            loggedInAccount.showUserInfo();
            insuranceMenu(loggedInAccount);
        } else {
            System.out.println("Login failed. Invalid email or password.");
        }
    }

    private static void insuranceMenu(Account account) {
        while (true) {
            System.out.println("\nInsurance Menu:");
            System.out.println("1. Add Car Insurance");
            System.out.println("2. Add Health Insurance");
            System.out.println("3. Add Residence Insurance");
            System.out.println("4. Add Travel Insurance");
            System.out.println("5. View Insurances");
            System.out.println("6. Logout");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addCarInsurance(account);
                    break;
                case 2:
                    addHealthInsurance(account);
                    break;
                case 3:
                    addResidenceInsurance(account);
                    break;
                case 4:
                    addTravelInsurance(account);
                    break;
                case 5:
                    viewInsurances(account);
                    break;
                case 6:
                    System.out.println("Logged out.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addCarInsurance(Account account) {
        System.out.print("Enter car make: ");
        String carMake = scanner.nextLine();
        System.out.print("Enter car model: ");
        String carModel = scanner.nextLine();
        System.out.print("Enter car age: ");
        int carAge = scanner.nextInt();
        System.out.print("Coverage for drivers (true/false): ");
        boolean coverageForDrivers = scanner.nextBoolean();
        System.out.print("Coverage for passengers (true/false): ");
        boolean coverageForPassengers = scanner.nextBoolean();

        LocalDate startDate = LocalDate.now();
        LocalDate endDate = startDate.plusYears(1);

        CarInsurance carInsurance = new CarInsurance(account.getUser().getEmail(),
                800, startDate, endDate, carMake, carModel, carAge,
                coverageForDrivers, coverageForPassengers);

        account.addInsurance(carInsurance);
        System.out.println("Car insurance added successfully!");
    }

    private static void addHealthInsurance(Account account) {
        System.out.print("Enter health condition: ");
        String healthCondition = scanner.nextLine();
        System.out.print("Coverage for pre-existing condition (true/false): ");
        boolean coverageForPreExistingCondition = scanner.nextBoolean();
        System.out.print("Enter coverage limit: ");
        double coverageLimit = scanner.nextDouble();

        LocalDate startDate = LocalDate.now();
        LocalDate endDate = startDate.plusYears(1);

        HealthInsurance healthInsurance = new HealthInsurance(account.getUser().getEmail(),
                1000, startDate, endDate, healthCondition,
                coverageForPreExistingCondition, coverageLimit);

        account.addInsurance(healthInsurance);
        System.out.println("Health insurance added successfully!");
    }

    private static void addResidenceInsurance(Account account) {
        System.out.print("Enter building value: ");
        double buildingValue = scanner.nextDouble();
        System.out.print("Enter content value: ");
        double contentValue = scanner.nextDouble();

        LocalDate startDate = LocalDate.now();
        LocalDate endDate = startDate.plusYears(1);

        ResidenceInsurance residenceInsurance = new ResidenceInsurance(account.getUser().getEmail(),
                980, startDate, endDate, buildingValue, contentValue);

        account.addInsurance(residenceInsurance);
        System.out.println("Residence insurance added successfully!");
    }

    private static void addTravelInsurance(Account account) {
        System.out.print("Enter duration (in days): ");
        int duration = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter covered countries (separated by commas): ");
        String countriesInput = scanner.nextLine();
        List<String> coveredCountries = new ArrayList<>();
        for (String country : countriesInput.split(",")) {
            coveredCountries.add(country.trim());
        }

        LocalDate startDate = LocalDate.now();
        LocalDate endDate = startDate.plusYears(1);

        TravelInsurance travelInsurance = new TravelInsurance(account.getUser().getEmail(),
                1200, startDate, endDate, coveredCountries, duration);

        account.addInsurance(travelInsurance);
        System.out.println("Travel insurance added successfully!");
    }

    private static void viewInsurances(Account account) {
        System.out.println("\nInsurances for " + account.getUser().getName() + " " + account.getUser().getSurname());
        ArrayList<Insurance> insurances = account.getInsurances();
        for (Insurance insurance : insurances) {
            System.out.println(insurance);
        }
    }

    private static void createIndividualAccount() {
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        System.out.print("Enter your job: ");
        String job = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        User user = new User(name, surname, email, password, job, age);
        Individual individual = new Individual(user);
        accountManager.addAccount(individual);
        System.out.println("Individual account created successfully!");
    }

    private static void createEnterpriseAccount() {
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        System.out.print("Enter your job: ");
        String job = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter your company name: ");
        String company = scanner.nextLine();

        User user = new User(name, surname, email, password, job, age);
        Enterprise enterprise = new Enterprise(user, company);
        accountManager.addAccount(enterprise);
        System.out.println("Enterprise account created successfully!");
    }

    private static void initializeSampleData() {
        // Sample individual account
        User individualUser = new User("John", "Doe", "john@example.com", "johnpass", "Engineer", 30);
        Individual individual = new Individual(individualUser);
        accountManager.addAccount(individual);

        // Sample enterprise account
        User enterpriseUser = new User("Jane", "Smith", "jane@example.com", "janepass", "CEO", 40);
        Enterprise enterprise = new Enterprise(enterpriseUser, "XYZ Company");
        accountManager.addAccount(enterprise);

        // Sample addresses
        IAdress homeAddress = new HomeAddress("New York", "123 Main St", "USA", 10001);
        IAdress businessAddress = new BusinessAddress("San Francisco", "456 Tech St", "USA", 94105, "XYZ Company");

        individual.addAdress(homeAddress);
        enterprise.addAdress(businessAddress);
    }
}