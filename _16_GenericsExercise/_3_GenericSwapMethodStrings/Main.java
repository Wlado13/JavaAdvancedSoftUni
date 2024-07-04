package _16_GenericsExercise._3_GenericSwapMethodStrings;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Swap<String> swap = new Swap<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            swap.add(input);
        }

        int index1 = scanner.nextInt();
        int index2 = scanner.nextInt();

        swap.swap(index1,index2);
        System.out.println(swap);
    }
}
