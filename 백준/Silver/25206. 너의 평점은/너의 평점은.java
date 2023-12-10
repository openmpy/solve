import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Double> map = new HashMap<>();
        // A+,A0,B+,B0,C+,C0,D+,D0,F,P
        map.put("A+", 4.5);
        map.put("A0", 4.0);
        map.put("B+", 3.5);
        map.put("B0", 3.0);
        map.put("C+", 2.5);
        map.put("C0", 2.0);
        map.put("D+", 1.5);
        map.put("D0", 1.0);
        map.put("F", 0.0);

        double total = 0.0;
        double total2 = 0.0;

        for (int i = 0; i < 20; i++) {
            String subject = sc.next();
            double grade = sc.nextDouble();
            String score = sc.next();

            if (score.equals("P")) {
                continue;
            }

            total += grade * map.get(score);
            total2 += grade;
        }
        System.out.println(total / total2);
    }
}