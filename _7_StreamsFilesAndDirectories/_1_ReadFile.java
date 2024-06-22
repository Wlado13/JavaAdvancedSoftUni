package _7_StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.IOException;

public class _1_ReadFile {
    public static void main(String[] args) throws IOException {

        String path = "/Users/wlado/Downloads/04. Java-Advanced-Files-and-Streams-Lab-Resources/input.txt";

        FileInputStream inputStream = new FileInputStream(path);

        int asciiCode = inputStream.read();

        while (asciiCode !=-1){
            System.out.print(Integer.toBinaryString(asciiCode)+ " ");
            asciiCode=inputStream.read();
        }

    }
}
