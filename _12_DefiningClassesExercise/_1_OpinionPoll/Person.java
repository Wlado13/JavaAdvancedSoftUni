package _12_DefiningClassesExercise._1_OpinionPoll;

public class Person {

    private String name;

    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }


    public String toString(){
        return String.format("%s - %d",this.name,this.age);
    }
}
