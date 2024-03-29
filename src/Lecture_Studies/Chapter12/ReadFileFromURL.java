package Lecture_Studies.Chapter12;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ReadFileFromURL {
    public static void main(String[] args) {
        System.out.print("Enter a URL: ");
        String URLString = new Scanner(System.in).next();

        try {
            URL url = new URL(URLString);

            int count = 0;

            Scanner input = new Scanner(url.openStream());

            while (input.hasNext()) {
                String line = input.nextLine();
                count += line.length();
            }

            System.out.println("The file size is " + count + " characters");
        } catch (MalformedURLException malformedURLException) {
            System.out.println("Invalid URL");
        } catch (IOException ioException) {
            System.out.println("I/O Errors: no such file");
        }
    }
}
