package _5_SetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class _1_ParkingLot {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashSet<String> parkingLot = new LinkedHashSet<>();

        while (!input.equals("END"))
        {
            String registration = input.substring(input.lastIndexOf(" ")).trim();
            if (input.contains("IN")){
                parkingLot.add(registration);
            }else {
                parkingLot.remove(registration);
            }
            input = scanner.nextLine();
        }

        if (parkingLot.isEmpty())
        {
            System.out.println("Parking Lot is Empty");
        }else {
            for (String n : parkingLot) {
                System.out.println(n);
            }
        }
    }
}
