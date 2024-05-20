import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Problem1309 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        long [][] dp=new long[n+1][3];
        dp[1][0]=1;
        dp[1][1]=1;
        dp[1][2]=1;

        for(int i=2; i<=n; i++) {
            dp[i][0]=(dp[i-1][1]+dp[i-1][2]+dp[i-1][0])%9901;
            dp[i][1]=(dp[i-1][0]+dp[i-1][2])%9901;
            dp[i][2]=(dp[i-1][0]+dp[i-1][1])%9901;
        }

        long sum=0;
        for(int i=0; i<3; i++) {
            sum=(sum+dp[n][i])%9901;
        }
        System.out.println(sum);
    }
}