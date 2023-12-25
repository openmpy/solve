import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int n = sc.nextInt();

        long min = 1;
        long max = 0;
        long half = 0;

        int[] nums = new int[k];

        for (int i = 0; i < k; i++) {
            nums[i] = sc.nextInt();
            max = Math.max(max, nums[i]);
        }

        while (min <= max) {
            half = (min + max) / 2;
            long count = 0;

            for (int num : nums) {
                count += num / half;
            }

            if (count < n) {
                max = half - 1;
            } else {
                min = half + 1;
            }
        }
        System.out.println((min + max) / 2);
    }
}
