package _5_SetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _3_VoinaNumberGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LinkedHashSet<Integer> firstPLayer = readSet(scanner);

        LinkedHashSet<Integer> secondPlayer = readSet(scanner);

        int rounds = 50;

        while(rounds-- > 0&&!firstPLayer.isEmpty() && !secondPlayer.isEmpty())
        {
           int firstNumber = getFirstNumber(firstPLayer);
           firstPLayer.remove(firstNumber);
           int secondNumber = getFirstNumber(secondPlayer);
           secondPlayer.remove(secondNumber);


           if (firstNumber>secondNumber){
               firstPLayer.add(firstNumber);
               firstPLayer.add(secondNumber);
           } else if (secondNumber>firstNumber) {
               secondPlayer.add(firstNumber);
               secondPlayer.add(secondNumber);
           }
        }

        if (firstPLayer.size()==secondPlayer.size())
        {
            System.out.println("Draw!");
        } else if (firstPLayer.size()<secondPlayer.size()) {
            System.out.println("Second player win!");
        }else
        {
            System.out.println("First player win!");
        }
    }

    private static int getFirstNumber(LinkedHashSet<Integer> firstPLayer) {
        for (Integer n : firstPLayer)
        {
            return n;
        }
        return 0;
    }

    private static LinkedHashSet<Integer> readSet(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s++"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }
}
