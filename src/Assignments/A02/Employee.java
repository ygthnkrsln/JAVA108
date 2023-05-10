package Assignments.A02;

// Do not change anything in this class
public abstract class Employee extends Person {

    protected int yearOfSeniority;

    public Employee() {
    }

    public Employee(String name, int yearOfSeniority) {
        this.name = name;
        this.yearOfSeniority = yearOfSeniority;
        number++;
    }

}