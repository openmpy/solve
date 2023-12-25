import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(nums);

        int round = (int) Math.round(n * 0.15);
        int people = n - round * 2;

        int sum = 0;
        for (int i = round; i < n - round; i++) {
            sum += nums[i];
        }

        System.out.println(Math.round(sum * 1.0 / people));
    }
}
