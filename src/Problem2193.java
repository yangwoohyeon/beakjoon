import java.util.Scanner;

public class Problem2193 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        long[][] arr = new long[91][2];
        arr[1][1]=1;
        arr[2][0]=1;
        for(int i=3; i<=90; i++) {
            for(int j=0; j<=1; j++) {
                if(j==0) {
                    arr[i][0]=arr[i-1][1]+arr[i-1][0];
                }
                else if(j==1) {
                    arr[i][1]=arr[i-1][0];
                }
            }
        }

        long result =0;
        for(int i=0; i<=1; i++) {
            result=result+arr[n][i];
        }
        System.out.println(result);
    }
}
