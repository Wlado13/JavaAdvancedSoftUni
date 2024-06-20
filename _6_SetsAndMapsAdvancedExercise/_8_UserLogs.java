package _6_SetsAndMapsAdvancedExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class _8_UserLogs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Integer>> tracking = new TreeMap<>();

        String input = scanner.nextLine();

        while (!input.equals("end")){

            String IP = input.split(" ")[0].split("=")[1];
            String username = input.split(" ")[2].split("=")[1];

            //Проверявам имам ли запис за този потребител
            if (tracking.containsKey(username)) {
                // а. Ако има:
                //     -> вземам мапа за този потребител (IP и брой пъти изпратено съобщение за този IP адрес)
                Map<String, Integer> IPAndCount = tracking.get(username);
                if (IPAndCount.containsKey(IP)){
                //     -> ако потребителя е пращал съобшение от този IP адрес, увеличавам бройкарта с 1
                    int count = IPAndCount.get(IP)+1;
                    IPAndCount.put(IP,count);
                }else {
                    //     -> ако не е -> нов запис, че е пратил 1 съобщение от този IP адрес
                    IPAndCount.put(IP,1);
                }
            }else {
                // б. Ако няма:
                //     -> правя нов запис с празен мап за неговите IP адреси
                tracking.put(username, new LinkedHashMap<>());
                tracking.get(username).put(IP,1);
                //     -> добавям към празният мап на този потребител, че е изпратил съобщение 1 от този IP адрес (IP -> 1)
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Map<String, Integer>> entry  :  tracking.entrySet())
        {
            String username = entry.getKey();
            Map<String, Integer> IPAndCounts = entry.getValue();

            String output = IPAndCounts.entrySet().stream()
                            .map(IPentry -> String.format("%s => %d",IPentry.getKey(),IPentry.getValue()))
                    .collect(Collectors.joining(", "));
            System.out.println(username + ":" );
            System.out.println(output + "." );
        }
    }
}
