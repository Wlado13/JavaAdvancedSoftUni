package _15_Generics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Printer<Integer> printer = new Printer(13);
        Printer<Double> printer2 = new Printer(3.14);
        printer.print();


    }
}
