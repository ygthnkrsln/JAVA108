package Assignments;

public class ScientificCalculator extends BasicCalculator {

    // Returns the sum of the elements in a given array
    @Override
    public int summation(int[] arr) {
        int summedResult = 0;

        for (int i = 0; i < arr.length; i++) {
            summedResult += arr[i];
        }
        return summedResult;
    }

    // Returns the result of number_1^number_2
    // Be careful!!! Don't use Math.pow() methods
    @Override
    public int pow(int number1, int number2) {
        int powResult = 1;

        while (number2 != 0) {
            powResult *= number1;
            number2--;
        }

        return powResult;
    }

    // Returns the element in the fibonacci series according to the given index.
    // Fibonacci series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
    // For example:
    //  If the index is entered as 6, the function returns the value 8.
    //  If the index is entered as 9, the function returns 34.
    //  If index is entered as 1, the function returns 0.
    @Override
    public int fibonacci(int index) {
        if (index == 1) return 0;
        if (index == 2) return 1;

        return fibonacci(index - 1) + fibonacci(index - 2);
    }

    // Calculates and returns the factorial value based on the given number.
    // For example:
    //  if the number is 5, the result is 5! = 5*4*3*2*1 = 120
    @Override
    public int factorial(int number) {
        if (number == 0) return 1;

        return number * factorial(number - 1);
    }

    // Find the minimum element of the given array
    @Override
    public int min(int[] arr) {
        int min = arr[0];
        int minIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                minIndex = i;
            }
        }
        return min;
    }

    // Find the maximum element of the given array
    @Override
    public int max(int[] arr) {
        int max = arr[0];
        int maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
        }

        return max;
    }

}
