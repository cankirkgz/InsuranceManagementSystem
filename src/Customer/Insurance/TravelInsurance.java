package Customer.Insurance;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class TravelInsurance extends Insurance{
    private List<String> coveredCountries;
    private int duration;

    public TravelInsurance(String name, double price, LocalDate startDate, LocalDate endDate,
                           List<String> coveredCountries, int duration) {
        super(name, price, startDate, endDate);
        this.coveredCountries = coveredCountries;
        this.duration = duration;
    }

    public List<String> getCoveredCountries() {
        return coveredCountries;
    }

    public void setCoveredCountries(List<String> coveredCountries) {
        this.coveredCountries = coveredCountries;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public void calculate() {
        double basePrice = getPriceInsurance();
        int duration = getDuration();
        int numberOfCountries = getCoveredCountries().size();
        // calculate the premium based on the base price, duration, and number of
        // covered countries
        double premium = basePrice + (basePrice * 0.1 * duration) + (basePrice * 0.05 * numberOfCountries);
        setPriceInsurance(premium);
    }

    @Override
    public String toString() {
        return "TravelInsurance [name=" + getInsuranceName() + ", price=" + getPriceInsurance() + ", startDate=" + getStartDate()
                + ", endDate=" + getFinnishDate()
                + ", coveredCountries=" + coveredCountries + ", duration=" + duration + "]";
    }
}
