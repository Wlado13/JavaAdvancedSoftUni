package _16_GenericsExercise._2_GenericBoxOfIntegere;

import java.util.ArrayList;
import java.util.List;

public class Box<T>{

    private List<T> values;

    public Box(){
        this.values = new ArrayList<>();
    }

    public void add(T value){
        this.values.add(value);
    }

    @Override
    public String toString(){

        StringBuilder sb = new StringBuilder();
        for (T value : this.values) {
            String formattedValue =  String.format("%s: %s", value.getClass().getName(),value);
            sb.append(formattedValue).append(System.lineSeparator());
        }

        return sb.toString();
    }
}
