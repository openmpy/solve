import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] answer = new String[N];

        for (int i = 0; i < N; i++) {
            answer[i] = sc.next();
        }

        Arrays.sort(answer, (o1, o2) -> {
            if (o1.length() == o2.length()) {
                return o1.compareTo(o2);
            } else {
                return o1.length() - o2.length();
            }
        });

        System.out.println(answer[0]);
        for (int i = 1; i < answer.length; i++) {
            if (answer[i - 1].equals(answer[i])) {
                continue;
            }
            System.out.println(answer[i]);
        }
    }
}