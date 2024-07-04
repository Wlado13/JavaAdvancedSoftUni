package _16_GenericsExercise._1_GenericBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Box<String> box = new Box<>();

        for (int i = 0; i < n; i++) {

            String line = scanner.nextLine();
            box.add(line);
        }

        System.out.println(box.toString());
    }
}
