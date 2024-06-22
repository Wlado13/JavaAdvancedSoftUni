package _8_StreamsFilesAndDirectoriesExercise;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.Map;

public class _6_WordCount {

    public static void main(String[] args) throws IOException {

        String[] words = Files.readString(Path.of("/Users/wlado/Downloads/04. Java-Advanced-Files-and-Streams-Exercises-Resources/words.txt"))
                .split("\\s+");

        String text = Files.readString(Path.of("/Users/wlado/Downloads/04. Java-Advanced-Files-and-Streams-Exercises-Resources/text.txt"));

        PrintWriter writer = new PrintWriter("/Users/wlado/IdeaProjects/JaveAdvanced2/src/StreamsFilesAndDirectoriesExercise/result.txt");

        Map<String, Integer> wordCount = new LinkedHashMap<>();

        for (String word : words)
        {
            wordCount.put(word,0);
        }

        for (String word : text.split("\\s+"))
        {

                if (wordCount.containsKey(word))
                {
                    int count = wordCount.get(word)+1;
                    wordCount.put(word,count);
                }
        }

        for (Map.Entry<String, Integer> entry : wordCount.entrySet())
        {
            writer.println(entry.getKey() + " - " + entry.getValue());
        }

        writer.close();
    }
}
