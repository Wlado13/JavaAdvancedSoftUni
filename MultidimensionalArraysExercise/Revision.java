package MultidimensionalArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class Revision {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows = 3;
        int cols = 4;

        //Какво е матрица ?
        int [][] matrix = new int [rows][cols];

        //Как се чете матрица?
        //вариант 1 -> вложен for

        for (int row =0; row<rows; row++)
        {
            for (int col =0; col<cols; col++)
            {
                matrix[row][col]=scanner.nextInt();
            }
        }

        //вариант 2 -> StreamAPI

        for (int row =0; row<row; row++)
        {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        //вариант 3 -> for loop

        for (int row =0; row<rows; row++)
        {
            String[] input = scanner.nextLine().split(" ");
            for (int col = 0 ; col<cols; col++)
            {
                matrix[row][col]=Integer.parseInt(input[col]);
            }
        }


        //Как се отпечатва матрица

        //вариант 1 foreache

        for (int [] row: matrix)
        {
            for (int number : row)
            {
                System.out.println(number + " ");
            }
            System.out.println();
        }

        //вариант 2 for loop
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.println(matrix[row][col] + " " );
            }
            System.out.println();
        }
        //Движения в матриците
        //Валидиране на матрица

    }
}
