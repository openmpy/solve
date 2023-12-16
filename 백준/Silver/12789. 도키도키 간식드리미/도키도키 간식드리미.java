import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int index = 1;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == index) {
                index++;
                continue;
            }

            if (!stack.isEmpty() && stack.peek() == index) {
                stack.pop();
                index++;
                i--;
            } else {
                stack.push(arr[i]);
            }
        }

        boolean isChecked = false;
        while (!stack.isEmpty()) {
            if (stack.peek() != index) {
                isChecked = true;
                break;
            }

            stack.pop();
            index++;
        }

        System.out.println(isChecked ? "Sad" : "Nice");
    }
}