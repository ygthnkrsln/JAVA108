package Lab_Studies.Lab03.Payroll_Exercise;

public class CommissionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double sales, double rate) {
        super(firstName, lastName, socialSecurityNumber);
        setGrossSales(sales);
        setCommissionRate(rate);
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }

    public String toString() {
        return String.format("%s: %s\n%s: $%.2f; %s: %.2f",
                "Commission Employee ", super.toString(),
                "Gross Sales ", getGrossSales(),
                "Commission Rate ", getCommissionRate());
    }
}
