package Assignments.A02;

import java.util.Objects;

public class Department {

    protected String name;
    protected int numberOfWorker;
    public static int number;

    // Do not change anything in this method
    public String getName() {
        return name;
    }

    // Fill in the blanks.
    public Department(String name, int numberOfEmployee) {
        this.name = name;
        this.numberOfWorker = numberOfEmployee;
        number++;
    }

    // Erase the content. Fill in the blanks. If name and numberOfWorker are equal, it returns true
    @Override
    public boolean equals(Object obj) {
        Department objDepartment = (Department) obj;

        return Objects.equals(objDepartment.name, name) && objDepartment.numberOfWorker == numberOfWorker; // don't forget to delete this line
    }

    // Erase the content. Fill in the blanks. Format: [name]/[numberOfWorker]
    // For example: Android/number of worker : 30
    @Override
    public String toString() {
        return name + "/number of worker : " + numberOfWorker;
    }

}