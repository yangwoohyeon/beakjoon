import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Problem2178 {

    static int N, M;
    static int[][] arr;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static boolean[][] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        visit = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String s = br.readLine().trim();
            for (int j = 0; j < M; j++) {
                arr[i][j] = s.charAt(j) - '0';
            }
        }
        visit[0][0] = true;
        BFS(0, 0);
        System.out.println(arr[N - 1][M - 1]);
    }

    public static void BFS(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});

        while (!queue.isEmpty()) {
            int[] point = queue.poll();
            int pointx = point[0];
            int pointy = point[1];

            for (int i = 0; i < 4; i++) {
                int nextX = pointx + dx[i];
                int nextY = pointy + dy[i];

                if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) {
                    continue;
                }
                if (visit[nextX][nextY] || arr[nextX][nextY] == 0) {
                    continue;
                }

                queue.add(new int[]{nextX, nextY});
                arr[nextX][nextY] = arr[pointx][pointy] + 1;
                visit[nextX][nextY] = true;
            }
        }
    }
}
