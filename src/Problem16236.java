import java.util.*;

public class Problem16236 {
    static int[][] arr;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int N;
    static int size = 2;
    static int count = 0;
    static int totalDistance = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        arr = new int[N][N];
        int startX = 0, startY = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = scanner.nextInt();
                if (arr[i][j] == 9) {
                    startX = i;
                    startY = j;
                    arr[i][j] = 0; // 아기 상어 위치 초기화
                }
            }
        }

        while (true) {
            int distance = BFS(startX, startY);
            if (distance == -1) break; // 더 이상 먹을 수 있는 물고기가 없으면 종료
            totalDistance += distance;
        }

        System.out.println(totalDistance);
    }

    public static int BFS(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visit = new boolean[N][N];
        queue.add(new int[]{x, y, 0});
        visit[x][y] = true;

        int minDist = Integer.MAX_VALUE;
        int targetX = -1, targetY = -1;

        while (!queue.isEmpty()) {
            int[] point = queue.poll();
            int pointX = point[0];
            int pointY = point[1];
            int dist = point[2];

            for (int i = 0; i < 4; i++) {
                int nextX = pointX + dx[i];
                int nextY = pointY + dy[i];

                //방문하지 않을 조건 추가
                if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= N || visit[nextX][nextY]) continue;
                if (arr[nextX][nextY] > size) continue;

                visit[nextX][nextY] = true;

                if (arr[nextX][nextY] > 0 && arr[nextX][nextY] < size) {
                    if (dist + 1 < minDist) {
                        minDist = dist + 1;
                        targetX = nextX;
                        targetY = nextY;
                    } else if (dist + 1 == minDist) {
                        if (nextX < targetX || (nextX == targetX && nextY < targetY)) {
                            targetX = nextX;
                            targetY = nextY;
                        }
                    }
                }
                queue.add(new int[]{nextX, nextY, dist + 1});
            }
        }

        if (targetX != -1 && targetY != -1) {
            arr[targetX][targetY] = 0; // 물고기를 먹음
            count++;
            if (count == size) {
                size++;
                count = 0;
            }
            return minDist;
        }
        return -1; // 먹을 수 있는 물고기가 없음
    }
}
