package Lab_Studies.Lab01.Course;

public class TestCourse {
    public static void main(String[] args) {
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");

        course1.addStudent("Peter Jones");
        course1.addStudent("Brian Smith");
        course1.addStudent("Anne Kennedy");
        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");

        System.out.println("Number of students in course1: "
                + course1.getNumberOfStudents());
        String[] students = course1.getStudents();

        for (int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.print(students[i] + ", ");

        System.out.println();
        System.out.println("Number of students in course2: "
                + course2.getNumberOfStudents());

        course1.dropStudent("Brian Smith");

        System.out.println("Number of students in course1: "
                + course1.getNumberOfStudents());
        String[] students1 = course1.getStudents();

        for (int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.print(students1[i] + ", ");
    }

}
