package _10_FunctionalProgrammingExercise;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class Demo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Imperative/Structured way of code writing

        List<String> names = Arrays.asList("Ivan", "Gosho", "Tosho", "Ivana");
        for(String name : names){
            if (name.startsWith("I"))
            {
                System.out.println(name);
            }
        }

        //Functional way of code writing (using lambda expressions)

        names.stream()
                .filter(n -> n.startsWith("I"))//Predicate
                .map(n -> n.toUpperCase())//Function
                .forEach(System.out::println);//Consumer

        Supplier<Integer> aRondomNumber = () -> new Random().nextInt();
        System.out.println(aRondomNumber.get());

        BiFunction<String, String, String> concatenateBiFunction =
                (name1, name2) -> name1 + " " + name2;
        System.out.println(concatenateBiFunction.apply("Viktor","Aleksandrov"));



        //Predicate: аргумент -> израз/действие, който връща булева стойност
        //Consumer: аргумент -> извършва се действие без да се връща резултата
        //Function: аргумент -> ивършва действие и връша резултат
        //Supplier: () -> извършва действие и връща резултат
        //BiFunction: (аргумент1, аргумент 2) -> ивършва действие
        // с тези два аргумента и връша резултат

    }
}
