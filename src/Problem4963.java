import java.util.Scanner;

public class Problem4963 {
    static int Land=0;
    static int[][] Map;
    static int W,H;
    static int[] dx={-1,0,1};
    static int[] dy={-1,0,1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            W=scanner.nextInt();
            H=scanner.nextInt();

            if(W==0 && H==0){
                break;
            }

            Map=new int[H][W];
            for(int i=0; i<H; i++){
                for(int j=0; j<W; j++){
                    Map[i][j]=scanner.nextInt();
                }
            }

            for(int i=0; i<H; i++){
                for(int j=0; j<W; j++){
                    if(Map[i][j]==1) {
                        dfs(i, j);
                        Land++;
                    }
                }
            }

            System.out.println(Land);
            Land=0;


        }
    }
    public static void dfs(int x, int y){
        Map[x][y]=0;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                int nx=x+dx[i];
                int ny=y+dy[j];

                if(nx>=0 && nx<H && ny>=0 && ny<W && Map[nx][ny]==1){
                    dfs(nx,ny);
                }
            }
        }
    }
}
