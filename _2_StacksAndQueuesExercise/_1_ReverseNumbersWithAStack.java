package _2_StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class _1_ReverseNumbersWithAStack {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

       /* int [] numbers = Arrays.stream(scanner.nextLine().split("\\s++"))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int number : numbers)
        {
            stack.push(number);
        }*/

        Arrays.stream(scanner.nextLine().split("\\s++"))
                .mapToInt(Integer::parseInt)
                .forEach(stack::push);


        while(!stack.isEmpty())
        {
            System.out.print(stack.pop()+" ");
        }
    }
}
