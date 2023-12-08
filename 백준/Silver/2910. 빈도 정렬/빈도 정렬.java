import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int M = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        List<Integer> origin = new ArrayList<>();
        Map<Integer, Integer> counting = new HashMap<>();

        for (int i = 0; i < T; i++) {
            int num = sc.nextInt();

            list.add(num);
            origin.add(num);
            counting.put(num, counting.getOrDefault(num, 0) + 1);
        }

        list.sort((o1, o2) -> {
            if (!Objects.equals(counting.get(o1), counting.get(o2))) {
                return counting.get(o2) - counting.get(o1);
            }

            return origin.indexOf(o1) - origin.indexOf(o2);
        });

        StringBuilder sb = new StringBuilder();
        for (Integer integer : list) {
            sb.append(integer).append(' ');
        }
        System.out.println(sb);
    }
}