package _5_SetsAndMapsAdvanced;

import java.util.Scanner;
import java.util.TreeSet;

public class _2_SoftUniParty {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        TreeSet<String> vipList = new TreeSet<>();

        TreeSet<String> regularList = new TreeSet<>();

        while(!input.equals("PARTY"))
        {
            if (Character.isDigit(input.charAt(0)))
            {
                vipList.add(input);
            }else
            {
                regularList.add(input);
            }

            input= scanner.nextLine();
        }

        input= scanner.nextLine();

        while(!input.equals("END"))
        {
            if (vipList.contains(input)){
                vipList.remove(input);
            }else if (regularList.contains(input))
            {
                regularList.remove(input);
            }

            input= scanner.nextLine();
        }

        System.out.println(vipList.size()+regularList.size());
        for (String a : vipList)
        {
            System.out.println(a);
        }

        for (String a : regularList)
        {
            System.out.println(a);
        }

    }
}
