package Assignments;

public abstract class BasicCalculator {

    // Returns the summation of number_1 and number_2 => number_1 + number_2
    public int summation(int number1, int number2) {
        int summedResult = number1 + number2;
        return summedResult;
    }

    // Returns the result of subtracting the number 2 from the number 1 => number_1 - number_2
    public int subtraction(int number1, int number2) {
        int subtractedResult = number1 - number2;
        return subtractedResult;
    }

    // Returns the multiplication of number_1 and number_2 => number_1 * number_2
    public int multiplication(int number1, int number2) {
        int multipliedResult = number1 * number2;
        return multipliedResult;
    }

    // Returns number_1 divided by number_2 => number_1/number_2
    public double division(int number1, int number2) {
        int dividedResult = number1 / number2;

        return dividedResult;
    }

    // abstract method
    public abstract int summation(int[] arr);

    // abstract method
    public abstract int pow(int number1, int number2);

    // abstract method
    public abstract int fibonacci(int index);

    // abstract method
    public abstract int factorial(int number);

    // abstract method
    public abstract int min(int[] arr);

    // abstract method
    public abstract int max(int[] arr);


}