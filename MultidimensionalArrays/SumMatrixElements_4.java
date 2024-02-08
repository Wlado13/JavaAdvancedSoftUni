package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] params = readInputAsArray(scanner);

        int rows = params[0];
        int cols = params[1];

        int [][]matrix = new int[rows][cols];

        for (int i = 0; i<params[0];i++)
        {
            matrix[i]= readInputAsArray(scanner);
        }

        int sum = 0;

        for (int row = 0; row< matrix.length; row++)
        {
            for (int col = 0; col<matrix[row].length;col++)
            {
                sum+= matrix[row][col];
            }
        }
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);

    }
    public static int[] readInputAsArray(Scanner scanner)
    {
        return Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
