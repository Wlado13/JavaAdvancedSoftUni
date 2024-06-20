package _5_SetsAndMapsAdvanced;

import java.util.*;
import java.util.stream.Collectors;

public class _5_AverageStudentGrades {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentRecord = new TreeMap<>();


        for (int i=0; i< n ; i++)
        {
            String [] input = scanner.nextLine().split("\\s++");

            String student = input[0];
            Double grade = Double.parseDouble(input[1]);

            studentRecord.putIfAbsent(student, new ArrayList<>());
            List<Double>grades=studentRecord.get(student);
            grades.add(grade);

        }

        for (var entry : studentRecord.entrySet())
        {
            String name = entry.getKey();

           String grades = entry.getValue().stream()
                            .map(g -> String.format("%.2f",g))
                                    .collect(Collectors.joining(" "));
            double avg = entry.getValue().stream()
                            .mapToDouble(g -> g)
                                    .average()
                                     .getAsDouble();
            System.out.println(String.format("%s -> %s (avg: %.2f)",name,grades,avg));
        }
    }

}
