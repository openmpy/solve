import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        int zeroCount = 0;
        int oneCount = 0;

        // 1010
        for (int i = 1; i < text.length(); i++) {
            if (text.charAt(i) != text.charAt(i - 1)) {
                if (text.charAt(i) == '0') {
                    oneCount++;
                } else {
                    zeroCount++;
                }
            }
        }
        System.out.println(Math.max(zeroCount, oneCount));
    }
}
