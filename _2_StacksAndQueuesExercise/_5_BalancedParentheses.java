package _2_StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _5_BalancedParentheses {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String expression = scanner.nextLine();

        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (char parentheses : expression.toCharArray() ){
            if (parentheses == '{' || parentheses == '[' || parentheses == '(')
            {
                stack.push(parentheses);
            }else
            {
                if (stack.isEmpty() || !areMatchingParentheses(stack.pop(), parentheses)){
                    System.out.println("NO");
                    return;
                }

            }
        }
        System.out.println("YES");
    }

    private static boolean areMatchingParentheses(char openParentheses, char closeParentheses) {

        if (openParentheses == '{'){
            return closeParentheses=='}';
        } else if (openParentheses == '[') {
            return closeParentheses == ']';
        }else {
            return closeParentheses == ')';
        }


    }
}
