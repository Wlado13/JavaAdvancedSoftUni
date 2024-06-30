package _15_Generics._4_ListUtilities;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(67);
        numbers.add(3);
        numbers.add(5);

        System.out.println(ListUtils.getMin(numbers));
    }
}
