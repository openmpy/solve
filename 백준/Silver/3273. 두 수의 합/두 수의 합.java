import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean[] counting = new boolean[2000000];
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            int index = sc.nextInt();
            counting[index] = true;
            nums[i] = index;
        }

        int sum = sc.nextInt();
        int answer = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] > sum) {
                continue;
            }

            if (counting[nums[i]] && counting[sum - nums[i]]) {
                answer++;
            }
        }
        System.out.println(answer / 2);
    }
}
