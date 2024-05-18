import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Problem2156 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr = new int[n+1];
        int[] dp = new int[n+1];
        for(int i=1; i<=n; i++) {
            arr[i]=scanner.nextInt();
        }

        if(n==1) {
            System.out.println(arr[1]);
            return;
        }
        else if(n==2) {
            System.out.println(arr[1]+arr[2]);
            return;
        }
        dp[1]=arr[1];
        dp[2]=arr[1]+arr[2];
        dp[3]=Math.max(dp[2], Math.max(arr[1]+arr[3],arr[2]+arr[3]));

        if(n==3) {
            System.out.println(dp[3]);
            return;
        }
        for(int i=4; i<=n; i++){
            dp[i]=Math.max(dp[i-1],Math.max(dp[i-2]+arr[i],dp[i-3]+arr[i]+arr[i-1]));
        }


        System.out.println(dp[n]);

    }
}