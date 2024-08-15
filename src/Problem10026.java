import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Problem10026 {

    static char[][] arr;
    static int N;
    static boolean[][] visit;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new char[N][N];
        visit = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine().toCharArray();
        }

        int count1 = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(!visit[i][j]){
                    bfs(i, j, arr[i][j]);
                    count1++;
                }
                if(arr[i][j] == 'G'){
                    arr[i][j] = 'R';
                }
            }
        }

        // visit 배열 초기화
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                visit[i][j] = false; //방문하지 않은 것으로 초기화
            }
        }

        int count2 = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(!visit[i][j]){
                    bfs(i, j, arr[i][j]);
                    count2++;
                }
            }
        }

        System.out.println(count1 + " " + count2);
    }

    public static void bfs(int x, int y, char c){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visit[x][y] = true;

        while(!queue.isEmpty()){
            int[] point = queue.poll();

            int pointX = point[0];
            int pointY = point[1];

            for(int i = 0; i < 4; i++){
                int nextX = pointX + dx[i];
                int nextY = pointY + dy[i];
                if(nextX < 0 || nextY < 0 || nextX >= N || nextY >= N){
                    continue;
                }
                if(visit[nextX][nextY] || arr[nextX][nextY] != c){
                    continue;
                }

                queue.add(new int[]{nextX, nextY});
                visit[nextX][nextY] = true;
            }
        }
    }
}
