package Lab_Studies.Lab01;

import java.util.Scanner;

public class IsStringPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String stringInput = input.nextLine();

        System.out.println("Is " + stringInput + " a palindrome without non-alphanumeric characters ? " + isPalindrome(stringInput));
    }

    public static boolean isPalindrome(String stringInput) {
        String filteredString = filter(stringInput);
        String reverseString = reverse(stringInput);

        return reverseString.equals(filteredString);
    }

    public static String filter(String stringInput) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < stringInput.length(); i++) {
            if (Character.isLetterOrDigit(stringInput.charAt(i))) {
                stringBuilder.append(stringInput.charAt(i));
            }
        }

        return stringBuilder.toString();
    }

    public static String reverse(String stringInput) {
        StringBuilder stringBuilder = new StringBuilder(stringInput);
        stringBuilder.reverse();

        return stringBuilder.toString();
    }
}
