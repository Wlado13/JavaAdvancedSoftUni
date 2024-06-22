package _8_StreamsFilesAndDirectoriesExercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class _1_SumLines {

    public static void main(String[] args) throws IOException {

        String address = "/Users/wlado/Downloads/04. Java-Advanced-Files-and-Streams-Exercises-Resources/input.txt";

        List<String> lines = Files.readAllLines(Path.of(address));

        for (String line : lines){
            int sum = 0;
            for (char symbol : line.toCharArray())
            {
                sum+=symbol;
            }
            System.out.println(sum);
        }
    }
}
