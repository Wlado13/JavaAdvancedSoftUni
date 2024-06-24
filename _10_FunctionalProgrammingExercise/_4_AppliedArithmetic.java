package _10_FunctionalProgrammingExercise;

import java.lang.reflect.Constructor;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _4_AppliedArithmetic {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .toList();


        Function<List<Integer>, List<Integer>> add = l -> l.stream().map(n -> n + 1).toList();
        Function<List<Integer>, List<Integer>> multiply = l -> l.stream().map(n -> n * 2).toList();
        Function<List<Integer>, List<Integer>> subtract = l -> l.stream().map(n -> n - 1).toList();


        String command = scanner.nextLine();

        while (!command.equals("end")) {

            switch (command) {
                case "add" -> numbers = add.apply(numbers);
                case "multiply" -> numbers = multiply.apply(numbers);
                case "subtract" -> numbers = subtract.apply(numbers);
                case "print" -> print(numbers);
            }


            command = scanner.nextLine();
        }
    }

    private static void print(List<Integer> numbers) {
        Consumer<Integer> print = i -> System.out.print(i + " ");
        numbers.forEach(print);
        System.out.println();
    }
}

