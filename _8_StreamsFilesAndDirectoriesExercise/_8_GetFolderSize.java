package _8_StreamsFilesAndDirectoriesExercise;

import java.io.File;

public class _8_GetFolderSize {

    public static void main(String[] args) {

         String folderPath = "/Users/wlado/Downloads/04. Java-Advanced-Files-and-Streams-Exercises-Resources/Exercises Resources";

         File folder = new File(folderPath);

         int size = 0;

         for (File f : folder.listFiles())
         {
             size+=f.length();
         }

        System.out.println("Folder size: " + size);
    }
}
