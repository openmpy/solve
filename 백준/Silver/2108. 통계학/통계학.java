import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        Arrays.sort(nums);

        double v = Arrays.stream(nums)
                .average()
                .orElse(0);

        // 최빈값
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((o1, o2) -> {
            if (map.get(o1).equals(map.get(o2))) {
                return o1 - o2;
            }
            return map.get(o2).compareTo(map.get(o1));
        });

        int max = list.get(0);
        if (list.size() > 1 && map.get(list.get(0)).equals(map.get(list.get(1)))) {
            max = list.get(1);
        }

        System.out.println(Math.round(v));
        System.out.println(nums[n / 2]);
        System.out.println(max);
        System.out.println(nums[n - 1] - nums[0]);
    }
}