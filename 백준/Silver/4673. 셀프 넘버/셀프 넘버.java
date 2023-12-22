public class Main {
    public static void main(String[] args) {
        boolean[] count = new boolean[10000 + 10];
        for (int i = 1; i <= 9972; i++) {
            count[selfNumber(i)] = true;
        }

        for (int i = 1; i < 10000; i++) {
            if (!count[i]) {
                System.out.println(i);
            }
        }
    }

    public static int selfNumber(int n) {
        int sum = n;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
