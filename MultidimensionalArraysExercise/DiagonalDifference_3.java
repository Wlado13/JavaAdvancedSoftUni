package MultidimensionalArraysExercise;

import java.util.Scanner;

public class DiagonalDifference_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int [][] matrix = new int[n][n];

        //1. fill the matrix
        fillTheMatrix(matrix,scanner);

        int col =0;
        int primaryDiagonalSum=0;
        int secondaryDiagonalSum=0;
         for (int row = 0; row<n; row++)
         {
            primaryDiagonalSum += matrix[row][col];
            col++;
         }

         for (int row = 0; row<n; row++)
         {
             col--;
             secondaryDiagonalSum += matrix[row][col];

         }

         int finalSum = Math.abs(secondaryDiagonalSum-primaryDiagonalSum);

        System.out.println(finalSum);

    }

    private static void fillTheMatrix(int [][] matrix, Scanner scanner)
    {
        int rows = matrix.length; // rows count
        for (int row =0; row<rows; row++)
        {
            for (int col =0; col<rows; col++)
            {
                matrix[row][col]=scanner.nextInt();
            }
        }
    }
}
