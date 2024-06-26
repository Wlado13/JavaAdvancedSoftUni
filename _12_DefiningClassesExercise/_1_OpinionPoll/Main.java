package _12_DefiningClassesExercise._1_OpinionPoll;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();


        for (int i = 0; i < n; i++) {

            String personInfo = scanner.nextLine();
            String[] personData = personInfo.split("\\s+");

            String name = personData[0];
            int age = Integer.parseInt(personData[1]);

            Person person = new Person(name, age);
            people.add(person);
        }


        people = people.stream().filter(p -> p.getAge()>30).collect(Collectors.toList());
        people.sort(Comparator.comparing(Person::getName));

        for (Person person : people) {
            System.out.println(person.toString());
        }


    }
}
