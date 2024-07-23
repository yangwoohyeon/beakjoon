import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Problem2667 {
    static int N, count;
    static int[][] arr;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        ArrayList<Integer> Home = new ArrayList<>();
        int danji = 0;

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < N; j++) {
                arr[i][j] = str.charAt(j) - '0';
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j] == 1) {
                    count = 0;
                    dfs(i, j);
                    Home.add(count);
                    danji++;
                }
            }
        }

        Collections.sort(Home);

        System.out.println(danji);
        for (int i : Home) {
            System.out.println(i);
        }
    }

    public static void dfs(int x, int y) {
        arr[x][y] = 0;
        count += 1;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < N && ny >= 0 && ny < N && arr[nx][ny] == 1) {
                dfs(nx, ny);
            }
        }
    }
}
