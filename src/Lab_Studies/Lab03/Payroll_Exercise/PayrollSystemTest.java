package Lab_Studies.Lab03.Payroll_Exercise;

public class PayrollSystemTest {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", 800);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "222-22-2222", 10000, .06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis", "333-33-3333", 5000, .04, 300);

        Employee[] employees = new Employee[3];

        employees[0] = salariedEmployee;
        employees[1] = commissionEmployee;
        employees[2] = basePlusCommissionEmployee;

        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);

            System.out.printf("earned $%, .2f\n\n", currentEmployee.earnings());
        }
    }
}
