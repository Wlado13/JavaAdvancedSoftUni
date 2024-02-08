package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2x2Submatrix_5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int []dim = readInputAsArray(scanner);

        int [][] matrix = new int[dim[0]][dim[1]];

        for (int row = 0; row<dim[0]; row++)
        {
            matrix[row] = readInputAsArray(scanner);
        }

        int sum = Integer.MIN_VALUE;
        int[][] res = new int [2][2];

        for (int row = 0; row< matrix.length-1; row++)
        {
            for (int col = 0; col<matrix[row].length-1;col++)
            {
                int currentAum = matrix[row][col]+
                        matrix[row][col+1]
                        +matrix[row+1][col]
                        +matrix[row+1][col+1];
                if (currentAum>sum)
                {
                    sum = currentAum;
                    res[0][0]=matrix[row][col];
                    res[0][1]=matrix[row][col+1];
                    res[1][0]=matrix[row+1][col];
                    res[1][1]=matrix[row+1][col+1];
                }

            }
        }

        printMultiDimensionalArray(res);
        System.out.println(sum);
    }

    public static int[] readInputAsArray(Scanner scanner)
    {
        return Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    public static void printMultiDimensionalArray(int [][] array) {
        for (int row = 0; row < array.length; row++) {
            StringBuilder sb = new StringBuilder();
            for (int col = 0; col < array[row].length; col++) {
                sb.append(array[row][col])
                        .append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}
