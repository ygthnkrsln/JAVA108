package Lecture_Studies.Chapter12;

public class ChainedExceptionDemo {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void method1() throws Exception {
        try {
            method2();
        } catch (Exception exception) {
            throw new Exception("New info from method1", exception);
        }
    }

    public static void method2() throws Exception {
        throw new Exception("New info from method2");
    }
}
