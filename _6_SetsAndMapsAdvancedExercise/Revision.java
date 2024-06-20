package _6_SetsAndMapsAdvancedExercise;

import java.util.*;

public class Revision {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //ВАЖНО: Сет -> Пази само уникални елементи
        //ВАЖНО: Сет -> Не може да достъпваме елементи по индекс

        // new HashSet<>() -> не пази конкретна подредба на елементите
        Set<Integer> numbers = new HashSet<>();


        numbers.add(4);
        numbers.add(5);
        numbers.add(1);

        // new TreeSet<>() -> запазва елементите в нарастащ ред
        Set<Integer> numbers2 = new TreeSet<>();

        numbers2.add(4);
        numbers2.add(5);
        numbers2.add(1);

        // new LinkedHashSet<>() -> запазва елементите в реда на тяхното добавяне
        Set<Integer> numbers3 = new LinkedHashSet<>();

        numbers3.add(4);
        numbers3.add(5);
        numbers3.add(1);


    }
}
