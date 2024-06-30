package _15_Generics._3_GenericScale;

public class Main {

    public static void main(String[] args) {

        Scale<Integer> integerScale = new Scale<>(13, 42);
        System.out.println(integerScale.getHeavier());
        Scale<String> stringScale = new Scale<>("aaa", "bbb");
        System.out.println(stringScale.getHeavier());

    }
}
