import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Map<String, Integer> map = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String text = sc.next();

            map.put(text, i + 1);
            map2.put(i + 1, text);
        }

        for (int i = 0; i < m; i++) {
            String text = sc.next();
            int num = text.charAt(0) - '0';

            if (num > 0 && num < 10) {
                System.out.println(map2.get(Integer.valueOf(text)));
            } else {
                System.out.println(map.get(text));
            }
        }
    }
}