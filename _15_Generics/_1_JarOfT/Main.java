package _15_Generics._1_JarOfT;

public class Main {

    public static void main(String[] args) {

        Jar<Integer> jar = new Jar<>();
        jar.add(13);
        int remove = jar.remove();
        System.out.println(remove);

    }
}
