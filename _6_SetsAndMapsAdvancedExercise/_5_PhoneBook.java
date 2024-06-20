package _6_SetsAndMapsAdvancedExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _5_PhoneBook {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String entry = scanner.nextLine();

        Map<String,String > phoneBook = new LinkedHashMap<>();

        while (!entry.equals("search"))
        {
            String[] input = entry.split("-");
            String name = input[0];
            String number = input[1];

            if (!phoneBook.containsKey(name))
            {
                phoneBook.put(name,number);
            }else
            {
                phoneBook.put(name,number);
            }
            entry = scanner.nextLine();
        }

        entry = scanner.nextLine();

        while (!entry.equals("stop"))
        {
            if (phoneBook.containsKey(entry))
            {
                System.out.println(entry + " -> "+phoneBook.get(entry) );
            }else
            {
                System.out.printf("Contact %s does not exist.%n",entry);
            }
            entry=scanner.nextLine();
        }
    }
}
