    import java.util.Scanner;

    public class Main {
        static final int MOD = 10007;
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            long[][] dp = new long[1001][10];

            int N = scanner.nextInt();

            for(int i=0; i<N; i++){
                for(int j=0; j<=9; j++){
                    if(j==0 || i==0){
                        dp[i][j]=1;
                    }
                    else{
                        dp[i][j]=(dp[i][j-1]+dp[i-1][j])%MOD;
                    }
                }
            }
            int sum=0;
            for(int i=0; i<10; i++){
                sum+=dp[N-1][i];
            }
            System.out.println(sum%MOD);
        }
    }