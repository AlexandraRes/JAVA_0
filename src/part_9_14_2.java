
public class part_9_14_2 extends part_9_14_1  {
    private double grossSales;
    private double commissionRate;

    public part_9_14_2(String firstName, String lastName, String socialSecurityNumber,
                              double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    @Override
    public String toString() {
        return String.format("%s\nGross Sales: %.2f\nCommission Rate: %.2f",
                super.toString(), getGrossSales(), getCommissionRate());
    }
}
