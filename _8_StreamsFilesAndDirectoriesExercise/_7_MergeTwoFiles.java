package _8_StreamsFilesAndDirectoriesExercise;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class _7_MergeTwoFiles {

    public static void main(String[] args) throws IOException {

        String fileOne = Files.readString(Path.of("/Users/wlado/Downloads/04. Java-Advanced-Files-and-Streams-Exercises-Resources/inputOne.txt"));
        String fileTwo = Files.readString(Path.of("/Users/wlado/Downloads/04. Java-Advanced-Files-and-Streams-Exercises-Resources/inputTwo.txt"));

        PrintWriter writer = new PrintWriter("/Users/wlado/IdeaProjects/JaveAdvanced2/src/StreamsFilesAndDirectoriesExercise/output.txt");
        writer.println(fileOne);
        writer.println(fileTwo);
        writer.close();

    }
}
