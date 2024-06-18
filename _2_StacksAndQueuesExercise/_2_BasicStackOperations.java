package _2_StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _2_BasicStackOperations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split("\\s++"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int n = input[0];
        int s = input[1];
        int x = input[2];

        int[] stackInput = Arrays.stream(scanner.nextLine().split("\\s++"))
                .mapToInt(Integer::parseInt)
                .toArray();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i<n;i++)
        {
            stack.push(stackInput[i]);
        }

        for (int i = 0; i<s; i++)
        {
            stack.pop();
        }


        if (stack.contains(x))
        {
            System.out.println("true");
        } else if (stack.isEmpty())
        {
            System.out.println(0);
        } else
        {
            System.out.println(Collections.min(stack));
        }
    }
}
