import java.util.Scanner;


public class Probelm14889 {
    static int N;
    static int[][] S;
    static boolean[] visit;
    static int Min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N=scanner.nextInt();
        S=new int[N][N];
        visit = new boolean[N];
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                S[i][j]=scanner.nextInt();
            }
        }

        dfs(0,0);
        System.out.println(Min);

    }

    static void dfs(int idx, int count){
        if(count==N/2){
            diff();
            return;
        }
        for(int i=idx; i<N; i++){
            if(visit[i]!=true){
                visit[i]=true;
                dfs(i+1,count+1);
                visit[i]=false;
            }
        }
    }

    static void diff(){
        int score_start=0;
        int score_link=0;

        for(int i=0; i<N-1; i++){
            for(int j=i+1; j<N; j++){
                if(visit[i]==true && visit[j]==true){
                    score_start+=S[i][j];
                    score_start+=S[j][i];
                }

                else if(visit[i]==false && visit[j]==false){
                    score_link+=S[i][j];
                    score_link+=S[j][i];
                }
            }
        }

        int value=Math.abs(score_link-score_start);

        Min=Math.min(value,Min);
    }
}
