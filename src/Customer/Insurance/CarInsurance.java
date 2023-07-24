package Customer.Insurance;

import java.time.LocalDate;
import java.util.Date;

public class CarInsurance extends Insurance{
    private String carMake;
    private String carModel;
    private int carAge;
    private boolean coverageForDrivers;
    private boolean coverageForPassengers;

    public CarInsurance(String name, double price, LocalDate startDate, LocalDate endDate,
                        String carMake, String carModel, int carAge,
                        boolean coverageForDrivers, boolean coverageForPassengers) {
        super(name, price, startDate, endDate);
        this.carMake = carMake;
        this.carModel = carModel;
        this.carAge = carAge;
        this.coverageForDrivers = coverageForDrivers;
        this.coverageForPassengers = coverageForPassengers;
    }

    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getCarAge() {
        return carAge;
    }

    public void setCarAge(int carAge) {
        this.carAge = carAge;
    }

    public boolean isCoverageForDrivers() {
        return coverageForDrivers;
    }

    public void setCoverageForDrivers(boolean coverageForDrivers) {
        this.coverageForDrivers = coverageForDrivers;
    }

    public boolean isCoverageForPassengers() {
        return coverageForPassengers;
    }

    public void setCoverageForPassengers(boolean coverageForPassengers) {
        this.coverageForPassengers = coverageForPassengers;
    }

    @Override
    public void calculate() {
        double basePrice = getPriceInsurance();
        String carMake = getCarMake();
        String carModel = getCarModel();
        int carAge = getCarAge();
        boolean coverageForDrivers = isCoverageForDrivers();
        boolean coverageForPassengers = isCoverageForPassengers();
        // calculate the premium based on the base price, car make and model, car age,
        // coverage for drivers and coverage for passengers
        double premium = basePrice;
        if (carMake.equals(carModel)) {
            premium += (basePrice * 0.05);
        }
        if (carAge > 5) {
            premium += (basePrice * 0.03);
        }
        if (coverageForDrivers && coverageForPassengers) {
            premium += (basePrice * 0.02);
        }
        setPriceInsurance(premium);
    }

    @Override
    public String toString() {
        return "CarInsurance [name=" + getInsuranceName() + ", price=" + getPriceInsurance()
                + ", startDate=" + getStartDate()
                + ", endDate=" + getFinnishDate()
                + ", carMake=" + carMake + ", carModel=" + carModel + ", carAge=" + carAge
                + ", coverageForDrivers=" + coverageForDrivers + ", coverageForPassengers=" + coverageForPassengers
                + "]";
    }
}
