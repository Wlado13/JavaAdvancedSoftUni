package _18_IteratorsAndComparatorsExercise._3_StackIterator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        CustomStack stack = new CustomStack();

        while (!command.equals("END")){

            if (command.equals("Pop"))
            {
                stack.pop();
            }else {
                int[] numbers = Arrays.stream(command.replace("Push ", "")
                        .split(", "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

                for (int number : numbers) {
                    stack.push(number);
                }
            }
            command = scanner.nextLine();
        }

        for (Integer i : stack) {
            System.out.println(i);
        }
        for (Integer i : stack) {
            System.out.println(i);
        }
    }
}
