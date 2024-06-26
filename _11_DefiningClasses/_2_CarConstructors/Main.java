package _11_DefiningClasses._2_CarConstructors;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String[] data = scanner.nextLine().split("\\s+");
            String brand = data[0];

            CarConstructors carConstructors;
            if (data.length == 1)
            {
                carConstructors = new CarConstructors(brand);
            }else {
                String model = data[1];
                int horsePower = Integer.parseInt(data[2]);

                 carConstructors = new CarConstructors(brand, model, horsePower);
            }

            System.out.println(carConstructors.getInfo());
        }
    }
}
