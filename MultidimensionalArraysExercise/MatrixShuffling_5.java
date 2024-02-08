package MultidimensionalArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String dimensionsInput = scanner.nextLine(); //"3 4".split(" ") -> ["3", "4"]
        int rows = Integer.parseInt(dimensionsInput.split("\\s+")[0]);
        int cols = Integer.parseInt(dimensionsInput.split("\\s+")[1]);

        String [][] matrix = new String[rows][cols];

        fillTheMatrix(matrix,scanner);

        String command = scanner.nextLine();

        while (!"END".equals(command))
        {


            if (validateCommand(command,rows,cols))
            {
                String[] commandParts = command.split("\\s+");

                int rowFirstElement = Integer.parseInt(commandParts[1]);
                int colFirstElement = Integer.parseInt(commandParts[2]);

                int rowSecondElement = Integer.parseInt(commandParts[3]);
                int colSecondElement = Integer.parseInt(commandParts[4]);

                String firstElement = matrix[rowFirstElement][colFirstElement];
                String secondElement = matrix[rowSecondElement][colSecondElement];

                matrix[rowFirstElement][colFirstElement] = secondElement;
                matrix[rowSecondElement][colSecondElement] = firstElement;

                printMatrix(matrix);

            }
            else
            {
                System.out.println("Invalid input!");
            }

            command = scanner.nextLine();
        }
    }

    private static boolean validateCommand(String command, int rows, int cols) {

        String[] commandParts = command.split("\\s+");


        if (commandParts.length!=5)
        {
        return false;
        }

        if (!commandParts[0].equals("swap"))
        {
            return false;
        }

        int rowFirstElement = Integer.parseInt(commandParts[1]);
        int colFirstElement = Integer.parseInt(commandParts[2]);

        int rowSecondElement = Integer.parseInt(commandParts[3]);
        int colSecondElement = Integer.parseInt(commandParts[4]);

        if (rowFirstElement < 0 || rowFirstElement >= rows || rowSecondElement < 0 || rowSecondElement >= rows
                || colFirstElement < 0 || colFirstElement >= cols || colSecondElement < 0 || colSecondElement >= cols) {
            return false;
        }

        //командата е валидна по всички параметри
        return true;

    }

    private static void fillTheMatrix(String [][] matrix, Scanner scanner)
    {
        for (int row = 0; row < matrix.length ; row++) {
            //scanner.nextLine() -> "1 2 3"
            //scanner.nextLine().split(" ") -> ["1", "2", "3"]
            matrix[row] = scanner.nextLine().split("\\s+");
        }
    }

    private static void printMatrix(String [][] matrix)
    {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println(); //свали курсора на следващия ред
        }
    }
}
