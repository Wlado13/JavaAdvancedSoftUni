package _1_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _2_SimpleCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine();

        String [] tokens = n.split("\\s+");

        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i = tokens.length-1; i>=0;i-- )
        {
            String token = tokens[i];
            stack.push(token);
        }

        while(stack.size()>1)
        {
            int firstNumber = Integer.parseInt(stack.pop());
            String op = stack.pop();
            int secondNumber = Integer.parseInt(stack.pop());

            switch (op)
            {
                case"+":
                    stack.push(String.valueOf(firstNumber+secondNumber));
                    break;
                case"-":
                    stack.push(String.valueOf(firstNumber-secondNumber));
                    break;
            }
        }

        System.out.println(stack.peek());
    }
}
