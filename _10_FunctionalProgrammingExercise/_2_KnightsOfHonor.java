package _10_FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class _2_KnightsOfHonor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+"))
                .toList();

        Consumer<String> consumer = n -> System.out.println("Sir " + n);

        names.forEach(consumer);


    }
}
