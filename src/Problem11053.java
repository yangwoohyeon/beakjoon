import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Problem11053 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int bigc=0;
        int[] arr=new int[n];
        int[] dp=new int[n];

        for(int i=0; i<n; i++) {
            arr[i]=scanner.nextInt();
        }
        for(int i=0; i<n; i++) {
            dp[i]=1;

            for(int j=0; j<i; j++) {
                if(arr[i]>arr[j]&&dp[i]<=dp[j]) {
                    dp[i]=dp[j]+1;
                }
            }
        }
        int big=0;
        for(int i=0; i<n; i++) {
            if(dp[i]>big) {
                big=dp[i];
            }
        }
        System.out.println(big);
    }
}
