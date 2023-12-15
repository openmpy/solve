import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);

        int min = gcd(nums[1] - nums[0], nums[2] - nums[1]);
        for (int i = 2; i < nums.length - 1; i++) {
            min = gcd(min, nums[i + 1] - nums[i]);
        }

        int count = 0;
        for (int i = nums[0]; i <= nums[n - 1]; i += min) {
            count++;
        }

        System.out.println(count - nums.length);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
}