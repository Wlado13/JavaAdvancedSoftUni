package _16_GenericsExercise;

public class Main {
    public static void main(String[] args) {


        Display<String> stringDisplay = new Display<>();
        stringDisplay.display("Apple", "Orange", "Banana");
        Display<Double> doubleDisplay = new Display<>();
        doubleDisplay.display(5.50, 3.50 , 4.50);
        Display<Integer> integerDisplay = new Display<>();
        integerDisplay.display(4,5,6);
    }
}
