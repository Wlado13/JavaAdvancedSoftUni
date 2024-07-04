package _16_GenericsExercise._6_GenericCountMethodDoubles;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Comparable<T>> {

    private List<T> values;

    public Box(){
        this.values = new ArrayList<>();
    }

    public void add(T value){
        this.values.add(value);
    }

    public int countGreaterValues(T valueToCompare){

        int count = 0;
        for (T value : this.values) {
            if (value.compareTo(valueToCompare) > 0){
                count++;
            }
        }

        return count;
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
