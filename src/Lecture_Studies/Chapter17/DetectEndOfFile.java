package Lecture_Studies.Chapter17;

import java.io.*;

public class DetectEndOfFile {
    public static void main(String[] args) {
        try {
            try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("test.dat"))) {
                dataOutputStream.writeDouble(4.5);
                dataOutputStream.writeDouble(43.25);
                dataOutputStream.writeDouble(3.2);
            }

            try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream("test.dat"))) {
                while (true)
                    System.out.println(dataInputStream.readDouble());
            }
        } catch (EOFException eofException) {
            System.out.println("All data were read");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
