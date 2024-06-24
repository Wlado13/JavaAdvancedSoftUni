package _10_FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class _8_CustomComparator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .toList();

        //Comparator: Ламбда израз, приема два аргумента и връща цяло число(-1, 0, 1)
        //sorted(-1) = няма да има размяна
        //sorted(0) = няма да има размяна
        //sorted(1) = ще размени елементите

        Comparator<Integer> comparator = (first, second) -> {
            if (first%2 != 0  && second % 2 == 0){
                return 1;
            }

            if (first % 2 == 0 && second % 2 !=0)
            {
                return -1;
            }

            //първото четно, второто нечетно
            //първото нечетно, второто нечетно

            //Default Comparator Implementation за числа: Подрежда зисла

            return first.compareTo(second);
        };

        numbers.stream()
                .sorted(comparator)
                .forEach(n -> System.out.print(n + " "));
    }
}
