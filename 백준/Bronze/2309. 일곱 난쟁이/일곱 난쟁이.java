import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] people = new int[9];
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            people[i] = sc.nextInt();
            sum += people[i];
        }

        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - (people[i] + people[j]) == 100) {
                    people[i] = 0;
                    people[j] = 0;

                    Arrays.stream(people)
                            .sorted()
                            .skip(2)
                            .forEach(System.out::println);
                    return;
                }
            }
        }
    }
}
