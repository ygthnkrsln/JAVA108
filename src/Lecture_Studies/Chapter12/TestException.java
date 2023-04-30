package Lecture_Studies.Chapter12;

public class TestException {
    public static void main(String[] args) {
        try {
            System.out.println(sum(new int[]{1, 2, 3, 4, 5}));
        } catch (Exception exception) {
            exception.printStackTrace();

            System.out.println("\n" + exception.getMessage());
            System.out.println("\n" + exception.toString());
            System.out.println("\nTrace Info Obtained from getStackTree");
            StackTraceElement[] traceElements = exception.getStackTrace();

            for (int i = 0; i < traceElements.length; i++) {
                System.out.print("method " + traceElements[i].getMethodName());
                System.out.print("(" + traceElements[i].getClassName() + ":");
                System.out.println(traceElements[i].getLineNumber() + ")");
            }
        }
    }

    private static int sum(int[] list) {
        int result = 0;
        for (int i = 0; i <= list.length; i++)
            result += list[i];
        return result;
    }
}
