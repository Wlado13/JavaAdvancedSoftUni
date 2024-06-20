package _5_SetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _4_CountRealNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] input = (Arrays.stream(scanner.nextLine().split("\\s++"))
                .mapToDouble(Double::parseDouble)
                .toArray());

        Map<Double,Integer> numbers = new LinkedHashMap<>();

        for (double values : input)
        {
            if (!numbers.containsKey(values))
            {
                numbers.put(values,1);
            }else
            {
                numbers.put(values,numbers.get(values)+1);
            }
        }

        for (Map.Entry<Double, Integer> entry : numbers.entrySet())
        {
            System.out.printf("%.1f -> %d%n",entry.getKey(),entry.getValue());
        }

    }
}
