package Lab_Studies.Lab01.Course;

public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents = 0;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        int i;

        for (i = 0; i < students.length; i++) {
            if (students[i] == null) break;

            if (students[i].equals(student)) {
                for (int j = i + 1; j < students.length; j ++) {
                    students[j - 1] = students[j];
                }

                students[students.length - 1] = null;
                numberOfStudents--;

                break;
            }
        }
    }
}
