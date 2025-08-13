import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		long[] dp = new long[1000001];
		
		dp[1]=1;
		dp[2]=2;
		dp[3]=4;
		for(int i=4; i<1000001; i++) {
			dp[i]=(dp[i-1]+dp[i-2]+dp[i-3])%1000000009;
		}
		
		
		
		for(int i=0; i<n; i++) {
			int x=scanner.nextInt();
			System.out.println(dp[x]%1000000009);
			
		}
	}
}