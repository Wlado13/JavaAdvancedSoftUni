package _10_FunctionalProgrammingExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class _9_ListOfPredicates {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> divisors = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .toList();

        List<Predicate<Integer>> predicates = new ArrayList<>();

        for (Integer divisor : divisors)
        {
            Predicate<Integer> predicate = num -> num % divisor == 0;
            predicates.add(predicate);
        }

        for (int i = 1; i<=n;i++)
        {
            boolean isDivisiblePredicates = true;
            for (Predicate<Integer> predicate : predicates)
            {
                if (!predicate.test(i)){
                    isDivisiblePredicates=false;
                }
            }
            if (isDivisiblePredicates){
                System.out.print(i+" ");
            }
        }
    }
}
