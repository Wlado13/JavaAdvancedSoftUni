package _7_StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class _2_WriteToFile {

    public static void main(String[] args) throws IOException {

        String path = "/Users/wlado/Downloads/04. Java-Advanced-Files-and-Streams-Lab-Resources/input.txt";

        FileInputStream inputStream = new FileInputStream(path);
        FileOutputStream outputStream = new FileOutputStream("output.txt");

        Scanner scanner = new Scanner(inputStream);

        int asciiCode = inputStream.read();

        while (scanner.hasNext()) {
            String next = scanner.nextLine();
            next =  next.replaceAll("[,.!?]","");
                for (int i = 0; i<next.length();i++){
                    outputStream.write(next.charAt(i));
                }
                outputStream.write('\n');
        }
    }
}
