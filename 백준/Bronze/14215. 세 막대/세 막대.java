import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] sides = new int[3];

        sides[0] = sc.nextInt();
        sides[1] = sc.nextInt();
        sides[2] = sc.nextInt();

        Arrays.sort(sides);

        if (sides[0] + sides[1] <= sides[2]) {
            sides[2] = sides[0] + sides[1] - 1;
        }

        System.out.println(Arrays.stream(sides).sum());
    }
}