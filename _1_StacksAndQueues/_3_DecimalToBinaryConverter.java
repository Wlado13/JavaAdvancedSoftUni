package _1_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _3_DecimalToBinaryConverter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> binaryNumber = new ArrayDeque<>();

        while (number!=0){
            int remainder = number % 2;
            binaryNumber.push(remainder);
            number /= 2;
        }

        while (!binaryNumber.isEmpty())
        {
            System.out.println(binaryNumber.pop());
        }
    }
}
