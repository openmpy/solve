import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next().toUpperCase();

        int[] arr = new int[26];
        for (int i = 0; i < text.length(); i++) {
            arr[text.charAt(i) - 'A']++;
        }

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        int count = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max == arr[i]) {
                count++;
                index = i;
            }
        }
        System.out.println(count > 1 ? "?" : (char) ('A' + index));
    }
}
