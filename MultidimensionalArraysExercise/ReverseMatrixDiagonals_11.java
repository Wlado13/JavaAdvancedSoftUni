package MultidimensionalArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseMatrixDiagonals_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] dimensions = readInputAsArray(scanner);

        int rows = dimensions[0];
        
        int cols = dimensions[1];
        int [][] matrix = new int[rows][cols ];

        fillTheMatrix(matrix,scanner);

        //print first part
        for (int c = cols-1; c >0; c--) {
            for (int row = rows-1, col = c;row>=0 && col<cols ; row--,col++) {
                System.out.print(matrix[row][col]+ " ");
            }
            System.out.println();
        }

        //print second part

        for (int r = rows-1; r>=0;r--)
        {
            for (int row = r, col = 0; row>=0 && col<cols;row--,col++)
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
