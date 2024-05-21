import java.util.Scanner;

public class Problem1149 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int [][] RGB = new int[n][3];
        for(int i=0; i<n; i++) {
            for(int j=0; j<3; j++) {
                RGB[i][j]=scanner.nextInt();
            }
        }

        int[][] dp = new int[n][3];

        dp[0][0]=RGB[0][0];
        dp[0][1]=RGB[0][1];
        dp[0][2]=RGB[0][2];

        for(int i=1; i<n; i++) {
            dp[i][0]=Math.min(dp[i-1][1],dp[i-1][2])+RGB[i][0];
            dp[i][1]=Math.min(dp[i-1][0],dp[i-1][2])+RGB[i][1];
            dp[i][2]=Math.min(dp[i-1][1],dp[i-1][0])+RGB[i][2];

        }
        int min=dp[n-1][0];
        for(int i=0; i<3; i++) {
            if(min>dp[n-1][i]) {
                min=dp[n-1][i];
            }
        }

        System.out.println(min);

    }
}