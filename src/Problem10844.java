import java.util.Scanner;

public class Problem10844 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        long[][] arr = new long[n+1][10];
        for(int i=0; i<=9; i++) {
            arr[1][i]=1;
        }

        for(int i=2; i<=n; i++) { //j는 맨 앞 자리의 숫자, i는 전체 자릿수
            arr[i][0] = arr[i-1][1];
            for(int j=1; j<=9; j++) {
                if(j==9) {
                    arr[i][9]=arr[i-1][8]%1000000000;
                }
                else {
                    arr[i][j]=(arr[i-1][j-1]%1000000000+arr[i-1][j+1]%1000000000)%1000000000;
                }
            }
        }
        long x=0;
        for(int i=1; i<=9; i++) {
            x=(x+arr[n][i])%1000000000;
        }
        System.out.println(x);
    }
}