package _18_IteratorsAndComparatorsExercise;

public class Revision {
    public static void main(String[] args) {

        /// 1. Varargs

        printName("Pesho");
        printName("Pesho", "Peho");

        String[] names = new String[3];
        names[0] = "Vlado";
        names[1] = "Pis";
        names[2] = "Peho";

        printName(names);

        printName("Vlado", "Pis", "Peho");

    }

    // Varargs винаги са последен аргумент
    // Varargs винаги са един аргумент в параметрите на метода
    private static void printName(String... name) {
        for (String n : name) {
            System.out.println(name);

        }
    }
}
