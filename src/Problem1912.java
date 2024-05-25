import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Problem1912 {//백준 1912

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        long[] arr= new long[n];
        long[] dp=new long[n];
        for(int i=0; i<n; i++) {
            arr[i]=scanner.nextInt();
        }
        for(int i=0; i<n; i++) {
            if(i==0) {
                dp[0]=arr[i];
            }
            else {
                dp[i]=Math.max(dp[i-1]+arr[i],arr[i-1]+arr[i]);
                if(dp[i]<arr[i]) {
                    dp[i]=arr[i];
                }
            }
        }
        long big=dp[0];
        for(int i=0; i<n; i++) {
            if(dp[i]>=big) {
                big=dp[i];
            }
        }
        System.out.println(big);
    }
}