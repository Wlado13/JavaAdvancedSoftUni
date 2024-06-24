package _10_FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _5_ReverseAndExclude {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());//Списък с елементи, които мога да премахвам/добавям и т.н.

        int n = Integer.parseInt(scanner.nextLine());

        Collections.reverse(numbers);

        Predicate<Integer> predicate = number -> number % n == 0;

        Consumer<Integer> print = number -> System.out.print(number+" ");

        numbers.removeIf(predicate);
        numbers.forEach(print);
    }
}
