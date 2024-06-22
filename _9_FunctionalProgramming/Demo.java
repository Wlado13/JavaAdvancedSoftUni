package _9_FunctionalProgramming;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class Demo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));

        int result = 0;
        for (int i = 0; i<list.size(); i++){
            int elements = list.get(i);
            if (elements%2==0){
                result+=elements*2;
            }
        }

        System.out.println(result);

        int sum = list.stream()
                .filter(e -> e % 2 == 0)
                .mapToInt(e -> e * 2)
                .sum();
        System.out.println(sum);

        Function<List<Integer>, Integer> getSum=
                l -> l.stream()
                        .mapToInt(e -> e * 2)
                        .sum();

        //consumer
        //accept

        //supplier
        //get

        //predicate
        //test
        //boolean
    }
}
