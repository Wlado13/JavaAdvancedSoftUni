package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsofSquareMatrix_6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][] arr = new int[size][size];

        for (int row = 0; row < size;row++) {
            arr[row]=Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }


        int [][] result = new int [2][size];

        int topLeftBottomRight = 0;
        int col = 0;
        int bottomLeftTopRight = size -1;
        for (int i = 0 ; i<size;i++)
        {
            result[0][col] = arr[topLeftBottomRight][col];
            result[1][col] = arr[bottomLeftTopRight][col];
            col++;
            topLeftBottomRight++;
            bottomLeftTopRight--;


        }
        printMultiDimensionalArray(result);
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
