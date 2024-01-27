import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int num = sc.nextInt();

            boolean isFlag = false;
            for (int j = 2; j <= 64; j++) {
                List<Integer> list = convertBase(num, j);
                if (isCheck(list)) {
                    isFlag = true;
                    break;
                }
            }
            System.out.println(isFlag ? "1" : "0");
        }
    }

    public static List<Integer> convertBase(int x, int base) {
        List<Integer> reverseDigit = new ArrayList<>();

        while (x > 0) {
            reverseDigit.add(x % base);
            x /= base;
        }
        return reverseDigit;
    }

    public static boolean isCheck(List<Integer> digit) {
        for (int i = 0; i < digit.size() / 2; i++) {
            if (digit.get(i) != digit.get(digit.size() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}