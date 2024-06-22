package _7_StreamsFilesAndDirectories;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String address = "/Users/wlado/Downloads/04. Java-Advanced-Files-and-Streams-Lab-Resources";

        Path path = Paths.get(address);

        File file = new File(address);

        File[] files = file.listFiles();

        for (File f : files)
        {
            System.out.println(f.getName() + " " + f.length());
        }

    }
}
