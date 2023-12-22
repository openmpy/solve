import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String number = sc.next();

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < number.length(); i++) {
            int num = number.charAt(i) - '0';

            if (num == 6) {
                map.put(9, map.getOrDefault(9, 0) + 1);
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        int max = 0;
        for (Integer integer : map.keySet()) {
            if (integer == 9) {
                continue;
            }

            max = Math.max(max, map.get(integer));
        }

        if (map.containsKey(9)) {
            max = Math.max(max, (map.get(9) / 2) + (map.get(9) % 2));
        }
        System.out.println(max);
    }
}
