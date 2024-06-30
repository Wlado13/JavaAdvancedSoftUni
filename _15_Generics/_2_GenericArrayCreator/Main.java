package _15_Generics._2_GenericArrayCreator;
public class Main {

    public static void main(String[] args) {

        Integer[] integers = ArrayCreator.create(3, 13);
        for (Integer n : integers){
            System.out.println(n);
        }

        Integer[] integers2 = ArrayCreator.create(Integer.class, 3, 69);
        for (Integer n : integers2){
            System.out.println(n);
        }
    }
}
