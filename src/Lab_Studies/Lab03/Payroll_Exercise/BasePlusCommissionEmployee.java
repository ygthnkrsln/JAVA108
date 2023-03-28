package Lab_Studies.Lab03.Payroll_Exercise;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double sales, double rate, double salary) {
        super(firstName, lastName, socialSecurityNumber, sales, rate);
        setBaseSalary(salary);
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double earnings() {
        return getBaseSalary() + super.earnings();
    }

    public String toString() {
        return String.format("%s %s; %s: $%.2f",
                "Base-salaried", super.toString(),
                "Base Salary ", getBaseSalary());
    }
}
