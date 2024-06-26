package _11_DefiningClasses._1_CarInfo;

import java.util.Objects;

public class Car {

    private String brand;
    private String model;
    private int horsePower;

    public Car(String brand, String model, int horsePower) {
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
    }

    public String getInfo(){
        return String.format("The car is: %s %s - %d HP.",brand,model,horsePower);
    }

    @Override
    public String toString(){
        return getInfo();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return horsePower == car.horsePower && Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, horsePower);
    }
}
