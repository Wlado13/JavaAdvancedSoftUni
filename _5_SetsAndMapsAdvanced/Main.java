package _5_SetsAndMapsAdvanced;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("A",13);
        hashMap.put("B",73);
        hashMap.put("C",69);
        hashMap.put("D",42);
        //1

        for (String k : hashMap.keySet())
        {
            System.out.println("Key" + k + "Value"+hashMap.get(k));
        }

        //2
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()){
            System.out.println("Key" + entry.getKey() + "Value"+entry.getValue());
        }

        //3 Only for values
        for (int v :hashMap.values())
        {
            System.out.println("Values"+v);
        }
    }
}
