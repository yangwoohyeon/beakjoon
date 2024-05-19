import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Problem11057 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();

        long[][] dp = new long[n+1][10];

        for(int i=0; i<10; i++) {
            dp[1][i]=1;
        }

        for(int i=2; i<=n; i++) {
            for(int j=0; j<=9; j++) {
                for(int k=j; k<=9; k++) {
                    dp[i][j]=(dp[i][j]+dp[i-1][k])%10007;
                }
            }
        }
        long sum=0;
        for(int i=0; i<10; i++) {
            sum=(sum+dp[n][i])%10007;
        }

        System.out.println(sum);
    }
}