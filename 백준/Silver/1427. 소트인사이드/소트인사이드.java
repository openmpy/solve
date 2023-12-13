import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String number = sc.next();

        List<Integer> list = new ArrayList<>();
        for (char c : number.toCharArray()) {
            list.add(c - '0');
        }

        list.sort(Comparator.reverseOrder());
        list.forEach(System.out::print);
    }
}