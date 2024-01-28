import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[][] people = new String[n][2];

        for (int i = 0; i < n; i++) {
            people[i][0] = sc.next();
            people[i][1] = sc.next();
        }

        Arrays.sort(people, (o1, o2) -> {
            return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
        });

        Arrays.stream(people)
                .forEach(strings -> System.out.println(strings[0] + " " + strings[1]));
    }
}
