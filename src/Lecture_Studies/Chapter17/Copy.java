package Lecture_Studies.Chapter17;

import java.io.*;

public class Copy {
    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.out.println("Usage: java Copy sourcefile targetfile");
            System.exit(1);
        }

        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(2);
        }

        File targetFile = new File(args[1]);
        if (!targetFile.exists()) {
            System.out.println("Target file " + args[1] + " does not exist");
            System.exit(3);
        }

        try (
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(sourceFile));
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(targetFile))
        ) {
            int r, numberOfBytesCopied = 0;
            while ((r = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write((byte) r);
                numberOfBytesCopied++;
            }

            System.out.println(numberOfBytesCopied + " bytes copied");
        }
    }
}
