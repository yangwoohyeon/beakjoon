import java.util.*;

public class Problem7562 {

    static int[][] arr;
    static int N;
    static boolean[][] visit;
    static int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
    static int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Case = scanner.nextInt();

        for(int i=0; i<Case; i++){
            N=scanner.nextInt();
            int nowX=scanner.nextInt();
            int nowY=scanner.nextInt();
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            visit=new boolean[N][N];
            arr=new int[N][N];
            BFS(nowX,nowY);
            System.out.println(arr[x][y]);
        }
    }

    public static void BFS(int nowX, int nowY){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{nowX,nowY});
        visit[nowX][nowY]=true;

        while(!queue.isEmpty()){
            int[] point=queue.poll();
            int pointX=point[0];
            int pointY=point[1];

            for(int i=0; i<8; i++){
                int nextX=pointX+dx[i];
                int nextY=pointY+dy[i];

                if(nextX<0 || nextY<0 || nextX>=N || nextY>=N){
                    continue;
                }
                if(visit[nextX][nextY]){
                    continue;
                }

                queue.add(new int[]{nextX,nextY});
                arr[nextX][nextY]=arr[pointX][pointY]+1;
                visit[nextX][nextY]=true;

            }

        }




        }

    }

