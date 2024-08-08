import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem14502 {
    static int N,M;
    static int arr[][];
    static int[] dx={-1,1,0,0};
    static int[] dy={0,0,-1,1};
    static int Max =Integer.MIN_VALUE;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N=scanner.nextInt();
        M=scanner.nextInt();
        arr=new int[N][M];

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                arr[i][j]=scanner.nextInt();
            }
        }

        dfs(0);
        System.out.println(Max);
    }

    public static void dfs(int wall){ //벽 세우기
        if(wall==3){
            bfs();
            return;
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(arr[i][j]==0){
                    arr[i][j]=1;
                    dfs(wall+1);
                    arr[i][j]=0;
                }
            }
        }
    }

    public static void bfs(){  //바이러스 퍼뜨리기
        Queue<int[]> queue = new LinkedList<>();
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(arr[i][j]==2){
                    queue.add(new int[]{i,j});
                }
            }
        }

        int[][] copyArr = new int[N][M];

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                copyArr[i][j]=arr[i][j];
            }
        }

        while(!queue.isEmpty()){
            int[] point=queue.poll();
            int pointX=point[0];
            int pointY=point[1];

            for(int i=0; i<4; i++){
                int nextX=pointX+dx[i];
                int nextY=pointY+dy[i];
                if(nextX>=0 && nextY>=0 && nextX<N && nextY<M){
                    if(copyArr[nextX][nextY]==0) {
                        queue.add(new int[]{nextX,nextY});
                        copyArr[nextX][nextY] = 2;
                    }
                }

            }
        }

        int count = 0;

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(copyArr[i][j]==0){
                    count++;
                }
            }
        }

        if(count>Max){
            Max=count;
        }

    }
}
