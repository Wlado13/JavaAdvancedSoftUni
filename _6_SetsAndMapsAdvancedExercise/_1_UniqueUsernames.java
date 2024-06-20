package _6_SetsAndMapsAdvancedExercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class _1_UniqueUsernames {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<String> username = new LinkedHashSet<>();

        for (int i = 0; i<n; i++)
        {
            String input = scanner.nextLine();

            username.add(input);
        }

       // username.forEach(input -> System.out.println(username));

        for (String a : username)
        {
            System.out.println(a);
        }

    }
}
