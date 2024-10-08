package _18_IteratorsAndComparatorsExercise._6_StrategyPattern;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        TreeSet<Person> byAgePerson = new TreeSet<>(new PersonAgeComparator());
        TreeSet<Person> byNamePerson = new TreeSet<>(new PersonNameComparator());

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            String name = input.split("\\s+")[0];
            int age = Integer.parseInt(input.split("\\s+")[1]);
            Person person = new Person(name, age);

            byAgePerson.add(person);
            byNamePerson.add(person);
        }

        byNamePerson.forEach(System.out::println);
        byAgePerson.forEach(System.out::println);
    }
}
