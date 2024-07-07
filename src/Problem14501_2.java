import java.util.Scanner;

public class Problem14501_2 {
    static int N;
    static int[] T,selected;
    static int[] P;
    static int result;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N=scanner.nextInt();
        T=new int[N];
        P=new int[N];
        result=0;
        for(int i=0; i<N; i++){
            T[i]=scanner.nextInt();
            P[i]=scanner.nextInt();
        }
        dfs(0,0);
        System.out.println(result);
    }

    static void dfs(int idx, int pay){
        if(idx>=N){
            result = Math.max(pay,result);
            return;
        }
        if(idx+T[idx]<=N){
            dfs(idx+T[idx],pay+P[idx]);
        }else{
            dfs(idx+T[idx],pay);
        }

        dfs(idx+1,pay);
    }
}
