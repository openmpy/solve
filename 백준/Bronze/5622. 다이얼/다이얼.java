import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        int[] nums = new int[26];
        nums[0] = nums[1] = nums[2] = 2; // ABC
        nums[3] = nums[4] = nums[5] = 3; // DEF
        nums[6] = nums[7] = nums[8] = 4; // GHI
        nums[9] = nums[10] = nums[11] = 5; // JKL
        nums[12] = nums[13] = nums[14] = 6; // MNO
        nums[15] = nums[16] = nums[17] = nums[18] = 7; // PQRS
        nums[19] = nums[20] = nums[21] = 8; // TUV
        nums[22] = nums[23] = nums[24] = nums[25] = 9; // WXYZ

        int answer = text.length();
        for (int i = 0; i < text.length(); i++) {
            answer += nums[text.charAt(i) - 'A'];
        }
        System.out.println(answer);
    }
}