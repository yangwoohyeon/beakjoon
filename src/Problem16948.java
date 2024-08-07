import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem16948 {
    static int N;
    static int[][] arr;
    static int[] destination=new int[2];
    static int[] start = new int[2];
    static boolean[][] visit;
    static int[] dx={-2,-2,0,0,2,2};
    static int[] dy={-1,1,-2,2,-1,1};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N=scanner.nextInt();
        arr = new int[N][N];
        visit = new boolean[N][N];

        for(int i=0; i<2; i++){
            start[i]=scanner.nextInt();
        }
        for(int i=0; i<2; i++){
            destination[i]=scanner.nextInt();
        }
        visit[start[0]][start[1]]=true;
        BFS(start[0],start[1]);
        if(arr[destination[0]][destination[1]]==0){
            System.out.println("-1");
            return;
        }
        else {
            System.out.println(arr[destination[0]][destination[1]]);
        }
    }

    public static void BFS(int x,int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});

        while(!queue.isEmpty()){
            int[] point = queue.poll();
            int pointx = point[0];
            int pointy = point[1];
            for(int i=0;i<6; i++){
                int nextX=pointx+dx[i];
                int nextY=pointy+dy[i];
                if (nextX < 0 || nextY < 0 || nextX >= N || nextY >=N) {
                    continue;
                }
                if (visit[nextX][nextY]) {
                    continue;
                }
                queue.add(new int[]{nextX, nextY});
                arr[nextX][nextY] = arr[pointx][pointy] + 1;
                visit[nextX][nextY] = true;
            }
        }
    }
}
