import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int[][] blocks = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < m; j++) {
                blocks[i][j] = Integer.parseInt(st.nextToken());
                min = Math.min(min, blocks[i][j]);
                max = Math.max(max, blocks[i][j]);
            }
        }

        int time = Integer.MAX_VALUE;
        int floor = 0;

        for (int i = min; i <= max; i++) {
            int second = 0;
            int block = b;

            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (blocks[j][k] < i) {
                        second += i - blocks[j][k];
                        block -= i - blocks[j][k];
                    } else if (blocks[j][k] > i) {
                        second += (blocks[j][k] - i) * 2;
                        block += (blocks[j][k] - i);
                    }
                }
            }
            if (block < 0) {
                break;
            }

            if (time >= second) {
                time = second;
                floor = i;
            }
        }
        System.out.println(time + " " + floor);
    }
}
