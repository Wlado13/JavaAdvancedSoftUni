package _8_StreamsFilesAndDirectoriesExercise;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class _5_LineNumbers {

    public static void main(String[] args) throws IOException {

        String path ="/Users/wlado/Downloads/04. Java-Advanced-Files-and-Streams-Exercises-Resources/inputLineNumbers.txt";


        List<String> lines = Files.readAllLines(Path.of(path));


        PrintWriter writer = new PrintWriter("/Users/wlado/IdeaProjects/JaveAdvanced2/src/StreamsFilesAndDirectoriesExercise/output.txt");

        int counter = 1;

        for (String line : lines)
        {
            writer.printf("%d. %s\n",counter,line);

            counter++;
        }

        writer.close();

    }
}
