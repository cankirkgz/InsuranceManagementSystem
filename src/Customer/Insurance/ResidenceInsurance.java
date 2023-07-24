package Customer.Insurance;

import java.time.LocalDate;
import java.util.Date;

public class ResidenceInsurance extends Insurance{
    private double buildingValue;
    private double contentValue;

    public ResidenceInsurance(String name, double price, LocalDate startDate, LocalDate endDate,
                              double buildingValue, double contentValue) {
        super(name, price, startDate, endDate);
        this.buildingValue = buildingValue;
        this.contentValue = contentValue;
    }

    public double getBuildingValue() {
        return buildingValue;
    }

    public void setBuildingValue(double buildingValue) {
        this.buildingValue = buildingValue;
    }

    public double getContentValue() {
        return contentValue;
    }

    public void setContentValue(double contentValue) {
        this.contentValue = contentValue;
    }

    @Override
    public void calculate() {
        double basePrice = getPriceInsurance();
        double buildingValue = getBuildingValue();
        double contentValue = getContentValue();
        // calculate the premium based on the base price, building value, and content
        // value
        double premium = basePrice + (buildingValue * 0.002) + (contentValue * 0.001);
        setPriceInsurance(premium);
    }

    @Override
    public String toString() {
        return "ResidenceInsurance [name=" + getInsuranceName() + ", price=" + getPriceInsurance() + ", startDate=" + getStartDate()
                + ", endDate=" + getFinnishDate() + ", buildingValue=" + buildingValue + ", contentValue=" + contentValue
                + "]";
    }
}
