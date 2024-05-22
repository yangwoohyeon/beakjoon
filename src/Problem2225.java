import java.util.Scanner;

public class Problem2225 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();

        long[][] dp=new long[k+1][n+1];
        for(int i=1; i<k+1; i++) {
            dp[i][0]=1;
        }

        for(int i=0; i<n+1; i++) {
            dp[1][i]=1;
        }

        for(int i=2; i<k+1; i++) {
            for(int j=1; j<n+1; j++) {
                for(int a=0; a<=j; a++) {
                    dp[i][j]=(dp[i][j]+dp[i-1][a])%1000000000;
                }
            }
        }
        System.out.println(dp[k][n]);
    }
}