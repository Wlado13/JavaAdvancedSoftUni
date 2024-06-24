package _10_FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class _6_PredicateForNames {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+")).toList();

        Predicate<String> predicate = text -> text.length()<=n;

        names.stream()
                .filter(predicate)
                .forEach(System.out::println);
    }
}
