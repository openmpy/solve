import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        int[] origin = new int[T];
        int[] sorted = new int[T];
        Map<Integer, Integer> ranking = new HashMap<>();

        for (int i = 0; i < T; i++) {
            origin[i] = sorted[i] = sc.nextInt();
        }
        Arrays.sort(sorted);

        int rank = 0;
        for (int i : sorted) {
            if (!ranking.containsKey(i)) {
                ranking.put(i, rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i : origin) {
            sb.append(ranking.get(i)).append(' ');
        }
        System.out.println(sb);
    }

    /*
        2 4 -10 4 -9
        2 3   0 3  1
    */
}