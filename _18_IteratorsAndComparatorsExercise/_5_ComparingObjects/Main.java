package _18_IteratorsAndComparatorsExercise._5_ComparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("END")){

            String name = input.split("\\s+")[0];
            int age = Integer.parseInt(input.split("\\s+")[1]);
            String town = input.split("\\s+")[2];

            Person person = new Person(name, town, age);
            people.add(person);

            input = scanner.nextLine();
        }

        int n = Integer.parseInt(scanner.nextLine())-1;

        Person specialPerson = people.get(n);

        int counter = 0;

        for (Person person : people) {
            if (person.compareTo(specialPerson) == 0){
                counter++;
            }
        }

        if (counter == 1){
            System.out.println("No matches");
        }else {
            System.out.printf("%d %d %d", counter, people.size() - counter, people.size());
        }
    }
}
