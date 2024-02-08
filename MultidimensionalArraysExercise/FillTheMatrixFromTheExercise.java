package MultidimensionalArraysExercise;

import java.util.Scanner;

public class FillTheMatrixFromTheExercise {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] params = scanner.nextLine().split(", ");
        int dim = Integer.parseInt(params[0]);
        String pattern = params[1];

        int[][] matrix = new int[dim][dim];

        if (pattern.equals("A"))
        {
            patternA(matrix);
        }else
        {
            patternB(matrix);
        }

        printMultiDimensionalArray(matrix);


    }

    private static void patternB(int[][] matrix) {
        int dimm = matrix.length;
        int num = 1;

        for (int col = 0; col<dimm;col++)
        {
            if (col%2==0)
            {
                for (int row = 0; row<dimm;row++)
                {
                    matrix[row][col]=num++;
                }
            }else
            {
                for (int row = dimm-1; row>=0;row--)
                {
                    matrix[row][col]=num++;
                }
            }
        }

    }

    public static void patternA(int [][] array)
    {
        int dimm = array.length;
        int num = 1;
        for (int col = 0 ; col<dimm; col++)
        {
            for(int row = 0; row<dimm;row++)
            {
                array[row][col] = num++;
            }
        }
    }
    public static void printMultiDimensionalArray(int [][] array)
    {
        for (int row =0; row<array.length; row++)
        {
            StringBuilder sb = new StringBuilder();
            for (int col=0; col<array[row].length;col++)
            {
                sb.append(array[row][col])
                        .append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}
