package Lab_Studies.Lab03.Payroll_Exercise;

public class SalariedEmployee extends Employee{
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double salary) {
        super(firstName, lastName, socialSecurityNumber);
        setWeeklySalary(salary);
    }

    public void setWeeklySalary(double salary) {
        this.weeklySalary = Math.max(salary, 0.0);
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public double earnings() {
        return getWeeklySalary();
    }

    public String toString() {
        return String.format("Salaried Employee: %s\n%s: $%.2f", super.toString(), "Weekly Salary", getWeeklySalary());
    }
}
