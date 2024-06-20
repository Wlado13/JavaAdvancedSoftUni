package _6_SetsAndMapsAdvancedExercise;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class _2_SetsOfElements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(Arrays.stream(scanner.nextLine().split("\\s++"))
                .mapToInt(Integer::parseInt).toArray()).toArray();


        Set<Integer> N = new LinkedHashSet<>();

        Set<Integer> M = new LinkedHashSet<>();

        for (int i = 0; i<input[0]; i++)
        {
            int a = Integer.parseInt(scanner.nextLine());
            N.add(a);
        }

        for (int i = 0; i<input[1]; i++)
        {
            int a = Integer.parseInt(scanner.nextLine());
            M.add(a);
        }

        for (int a : N)
        {
            for (int b : M)
            {
                if (a==b)
                {
                    System.out.print(a + " ");
                }
            }
        }
    }
}
