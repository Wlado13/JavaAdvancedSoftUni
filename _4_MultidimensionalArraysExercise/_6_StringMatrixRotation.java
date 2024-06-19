package _4_MultidimensionalArraysExercise;

import java.util.*;

public class _6_StringMatrixRotation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String rotationAngle = scanner.nextLine().replace("Rotate(","").replace(")","");
        int rotationTimes = Integer.parseInt(rotationAngle)/90;


        List<String> words = new ArrayList<>();
        String word= scanner.nextLine();
        while(!word.equals("END"))
        {
            words.add(word);
            word=scanner.nextLine();
        }

        int rows = words.size();
        int cols = Collections.max(words, Comparator.comparing(String::length)).length();

        char[][] matrix = new char[rows][cols];


        fillMatrix(matrix,words);

        for (int rotation = 1; rotation<=rotationTimes;rotation++)
        {
            matrix = rotateMatrix90(matrix);
        }

        printMatrix(matrix);

    }

    private static void printMatrix(char[][] matrix) {
        for (int row = 0 ; row<matrix.length;row++)
        {
            for (int col = 0; col<matrix[row].length;col++)
            {
                System.out.print(matrix[row][col]+"");
            }
            System.out.println();
        }
    }

    private static char[][] rotateMatrix90(char[][] matrix) {

        int newRows = matrix[0].length;
        int newCols = matrix.length;

        char[][] newMatrix = new char[newRows][newCols];

        for (int col = 0; col<matrix[0].length;col++)
        {
            int counter = 0;
            for (int row = matrix.length-1; row>=0;row--)
            {
                char symbol = matrix[row][col];
                newMatrix[col][counter] = symbol;
                counter++;
            }
        }

        return newMatrix;
    }

    private static void fillMatrix(char[][] matrix, List<String> words) {
        for (int row = 0; row<matrix.length;row++)
        {
            String word = words.get(row);

            for (int col = 0; col<matrix[row].length; col++)
            {
                if (col<=word.length()-1)
                {
                    matrix[row][col] = word.charAt(col);
                }else {
                    matrix[row][col] = ' ';
                }
            }
        }
    }
}
