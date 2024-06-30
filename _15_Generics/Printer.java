package _15_Generics;

public class Printer<Whatever> {

    private Whatever toPrint;

    public Printer(Whatever toPrint) {
        this.toPrint = toPrint;
    }

    public void print(){
        System.out.println(toPrint);
    }
}
