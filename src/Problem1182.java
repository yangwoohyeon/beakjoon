import java.util.Scanner;

public class Problem1182 {
    static int  N;
    static int S;
    static boolean[] visit;
    static int[] num;
    static int count=0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N=scanner.nextInt();
        S=scanner.nextInt();
        visit=new boolean[N];
        num=new int[N];

        for(int i=0; i<N; i++){
            num[i]=scanner.nextInt();
        }

        dfs(0,0);

        if(S==0){
            count--;
        }
        System.out.println(count);
    }
    private static void dfs(int start, int sum){
        if(start==N) {
            if (sum == S) {
                count++;
            }
            return;
        }

        dfs(start+1,sum+num[start]);
        dfs(start+1,sum);
    }
}
