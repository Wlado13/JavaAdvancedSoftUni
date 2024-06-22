package _9_FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class _3_CountUppercaseWordsSecondVariant {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Predicate<String> startsWithUppercase =
                s -> Character.isUpperCase(s.charAt(0));

        StringBuilder out = new StringBuilder();

        AtomicInteger count = new AtomicInteger();

         Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(startsWithUppercase)
                .forEach(e -> {
                    count.getAndIncrement();
                    out.append(e).append(System.lineSeparator());
                });

        System.out.println(count);
        System.out.println(out);

    }
}
