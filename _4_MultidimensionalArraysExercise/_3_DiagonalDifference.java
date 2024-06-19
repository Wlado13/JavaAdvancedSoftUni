package _4_MultidimensionalArraysExercise;

import java.util.Scanner;

public class _3_DiagonalDifference {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        int[][]matrix = new int[input][input];

        for (int row = 0; row<matrix.length; row++)
        {
            String [] a = scanner.nextLine().split(" ");
            for (int col =0; col<matrix.length;col++)
            {
                matrix[row][col] = Integer.parseInt(a[col]);
            }
        }

        int primaryDiagonalSum=getPrimaryDiagonal(matrix);
        int secondaryDiagonalSum=getSecondaryDiagonal(matrix);


        System.out.println(Math.abs(primaryDiagonalSum-secondaryDiagonalSum));


    }

    private static int getSecondaryDiagonal(int[][] matrix) {

        int sum = 0;

        int counter = 0;
        for (int row = matrix.length-1; row>=0;row--)
        {

            sum += matrix[row][counter];
            counter++;
        }


        return sum;
    }

    private static int getPrimaryDiagonal(int[][] matrix) {

        int sum = 0;

        for (int row = 0; row<matrix.length;row++)
        {
            for (int col = 0; col<matrix.length;col++)
            {
                if (row==col)
                {
                    sum+=matrix[row][col];
                }
            }
        }

        return sum;
    }


}
