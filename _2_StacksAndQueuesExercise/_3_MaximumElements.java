package _2_StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class _3_MaximumElements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i<n;i++)
        {
            String[] input = scanner.nextLine().split("\\s++");

            int number = Integer.parseInt(input[0]);

            switch (number)
            {
                case 1:
                    int x = Integer.parseInt(input[1]);
                    stack.push(x);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    System.out.println(Collections.max(stack));
                    break;
            }
        }
    }
}
