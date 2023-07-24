package Customer.Insurance;

import java.time.LocalDate;
import java.util.Date;

public abstract class Insurance {
    private String insuranceName;
    private double priceInsurance;
    private LocalDate startDate;
    private LocalDate finnishDate;

    public Insurance(String insuranceName, double prineInsurance, LocalDate startDate, LocalDate finnishDate) {
        this.insuranceName = insuranceName;
        this.priceInsurance = prineInsurance;
        this.startDate = startDate;
        this.finnishDate = finnishDate;
    }

    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public double getPriceInsurance() {
        return priceInsurance;
    }

    public void setPriceInsurance(double priceInsurance) {
        this.priceInsurance = priceInsurance;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getFinnishDate() {
        return finnishDate;
    }

    public void setFinnishDate(LocalDate finnishDate) {
        this.finnishDate = finnishDate;
    }

    public void calculate(){}
}
