package _8_StreamsFilesAndDirectoriesExercise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class _3_AllCapitals {

    public static void main(String[] args) throws IOException {

        String content = Files.readString(Path.of("/Users/wlado/Downloads/04. Java-Advanced-Files-and-Streams-Exercises-Resources/input.txt"));

        content = content.toUpperCase();

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/Users/wlado/IdeaProjects/JaveAdvanced2/src/StreamsFilesAndDirectoriesExercise/output.txt"));
        bufferedWriter.write(content);
        bufferedWriter.close();

    }
}
