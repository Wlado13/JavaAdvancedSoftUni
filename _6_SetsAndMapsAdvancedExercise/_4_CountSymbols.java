package _6_SetsAndMapsAdvancedExercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _4_CountSymbols {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();

        Map<Character, Integer> symbols = new TreeMap<>();

        for (int i =0; i<a.length();i++)
        {
            char n = a.charAt(i);
            if (!symbols.containsKey(n))
            {
                symbols.put(a.charAt(i),1);
            }else
            {
                symbols.put(a.charAt(i),symbols.get(a.charAt(i))+1);
            }
        }

        // entrySet() -> Съвкупност от данни
        // entry -> един запис
        for (var entry: symbols.entrySet())
        {
            System.out.println(entry.getKey()+": " + entry.getValue()+" time/s");
        }
    }
}
