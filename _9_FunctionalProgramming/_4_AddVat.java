package _9_FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class _4_AddVat {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        UnaryOperator<Double> addVat = v -> v * 1.2;

        System.out.println("Prices with VAT:");

        Arrays.stream(scanner.nextLine().split(", "))
                .map(Double::parseDouble)
                .map(addVat)
                  .forEach(v -> System.out.printf("%.2f%n",v));




    }
}
