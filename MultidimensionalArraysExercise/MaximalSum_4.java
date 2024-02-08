package MultidimensionalArraysExercise;

import java.util.Arrays;
import java.util.Formattable;
import java.util.Scanner;

public class MaximalSum_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] dimensions = readInputAsArray(scanner);

        int [][] matrix = new int[dimensions[0]][dimensions[1]];

        fillTheMatrix(matrix,scanner);

        int maxSum = Integer.MIN_VALUE;

        int bestRow = 0;
        int bestCol = 0;

        for (int row = 0; row < dimensions[0]-2; row++) {
            for (int col = 0; col < dimensions[1]-2; col++) {
                int sum = matrix[row][col] + matrix[row][col+1] + matrix[row][col+2]
                        +matrix[row+1][col]+matrix[row+2][col]
                        +matrix[row+1][col+1]+matrix[row+2][col+2]
                        +matrix[row+2][col+1]+matrix[row+1][col+2];
                if (sum>maxSum)
                {
                    maxSum=sum;
                    bestRow=row;
                    bestCol=col;
                }
            }
        }
        System.out.println("Sum = " + maxSum);
        for (int row = bestRow; row<=bestRow+2;row++){
            for (int col = bestCol; col<=bestCol+2;col++)
            {
                System.out.print(matrix[row][col]+ " ");
            }
            System.out.println();
        }
    }

    public static int[] readInputAsArray(Scanner scanner)
    {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
    private static void fillTheMatrix(int [][] matrix, Scanner scanner)
    {
        for (int row =0; row< matrix.length; row++)
        {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
    }

}
