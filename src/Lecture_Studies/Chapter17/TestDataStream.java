package Lecture_Studies.Chapter17;

import java.io.*;

public class TestDataStream {
    public static void main(String[] args) throws IOException {
        try (
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("temp.dat"))
        ) {
            dataOutputStream.writeUTF("John");
            dataOutputStream.writeDouble(85.5);
            dataOutputStream.writeUTF("Jim");
            dataOutputStream.writeDouble(185.5);
            dataOutputStream.writeUTF("George");
            dataOutputStream.writeDouble(105.25);
        }

        try (
                DataInputStream dataInputStream = new DataInputStream(new FileInputStream("temp.dat"))
        ) {
            System.out.println(dataInputStream.readUTF() + " " + dataInputStream.readDouble());
            System.out.println(dataInputStream.readUTF() + " " + dataInputStream.readDouble());
            System.out.println(dataInputStream.readUTF() + " " + dataInputStream.readDouble());
        }
    }
}
