package _12_DefiningClassesExercise._5_CarSalesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Engine> engines = new ArrayList<>();
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < n; i++)
        {
            String engineInfo = scanner.nextLine();
            String[] engineData = engineInfo.split("\\s+");

            String model = engineData[0];
            String power = engineData[1];
            String displacement = "n/a";
            String efficiency = "n/a";
            if (engineData.length == 4){
                 displacement = engineData[2];
                 efficiency = engineData[3];
            }else if (engineData.length == 3){
                if (Character.isDigit(engineData[2].charAt(0))){
                    displacement = engineData[2];
                }else {
                    efficiency = engineData[2];

                }
            }

            Engine engine = new Engine(model, power, displacement, efficiency);
            engines.add(engine);
        }

        int m  = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < m; i++)
        {
            String carInfo = scanner.nextLine();
            String[] carData = carInfo.split("\\s+");

            String carModel = carData[0];
            String engineModel = carData[1];
            String carWeight = "n/a";
            String carColor = "n/a";

            if (carData.length == 4){
                 carWeight = carData[2];
                 carColor = carData[3];
            }else if (carData.length == 3){
                if (Character.isDigit(carData[2].charAt(0))){
                    carWeight = carData[2];
                }else {
                    carColor = carData[2];

                }
            }

            Engine engine = getEngineByModel(engines,engineModel);
            Car car = new Car(carModel, engine, carWeight, carColor);
            cars.add(car);
        }

        for (Car car : cars) {
            System.out.println(car.toString());
        }

    }

    private static Engine getEngineByModel(List<Engine> engines, String engineModel) {
        for (Engine engine : engines) {
            if (engine.getModel().equals(engineModel)){
                return engine;
            }
        }

        return null;
    }
}
