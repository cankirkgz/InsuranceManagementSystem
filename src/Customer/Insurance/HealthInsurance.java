package Customer.Insurance;

import java.time.LocalDate;
import java.util.Date;

public class HealthInsurance extends Insurance{
    private String healthCondition;
    private boolean coverageForPreExistingCondition;
    private double coverageLimit;

    public HealthInsurance(String name, double price, LocalDate startDate, LocalDate endDate,
                           String healthCondition, boolean coverageForPreExistingCondition,
                           double coverageLimit) {
        super(name, price, startDate, endDate);
        this.healthCondition = healthCondition;
        this.coverageForPreExistingCondition = coverageForPreExistingCondition;
        this.coverageLimit = coverageLimit;
    }

    public String getHealthCondition() {
        return healthCondition;
    }

    public void setHealthCondition(String healthCondition) {
        this.healthCondition = healthCondition;
    }

    public boolean isCoverageForPreExistingCondition() {
        return coverageForPreExistingCondition;
    }

    public void setCoverageForPreExistingCondition(boolean coverageForPreExistingCondition) {
        this.coverageForPreExistingCondition = coverageForPreExistingCondition;
    }

    public double getCoverageLimit() {
        return coverageLimit;
    }

    public void setCoverageLimit(double coverageLimit) {
        this.coverageLimit = coverageLimit;
    }

    @Override
    public void calculate() {
        double basePrice = getPriceInsurance();
        boolean coverageForPreExistingCondition = isCoverageForPreExistingCondition();
        double coverageLimit = getCoverageLimit();
        // calculate the premium based on the base price, coverage for pre-existing
        // condition and coverage limit
        double premium = basePrice;
        if (coverageForPreExistingCondition) {
            premium += (basePrice * 0.05);
        }
        if (coverageLimit < 1000000) {
            premium += (basePrice * 0.03);
        }
        setPriceInsurance(premium);
    }

    @Override
    public String toString() {
        return "HealthInsurance [name=" + getInsuranceName() + ", price=" + getPriceInsurance()
                + ", startDate=" + getStartDate()
                + ", endDate=" + getFinnishDate()
                + ", healthCondition=" + healthCondition + ", coverageForPreExistingCondition="
                + coverageForPreExistingCondition
                + ", coverageLimit=" + coverageLimit + "]";
    }

}
