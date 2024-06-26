package _11_DefiningClasses._2_CarConstructors;

import java.util.Objects;

public class CarConstructors {

    private String brand;
    private String model;
    private int horsePower;

    public CarConstructors(String brand){
        this(brand, "unknown", -1);
    }
    public CarConstructors(String brand, String model, int horsePower) {
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
        if (!(o instanceof CarConstructors carConstructors)) return false;
        return horsePower == carConstructors.horsePower && Objects.equals(brand, carConstructors.brand) && Objects.equals(model, carConstructors.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, horsePower);
    }
    
}
