import java.util.Scanner;

public class Problem15990 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        long [][] arr = new long[100001][3];
        arr[1][0]=1;
        arr[2][1]=1;
        arr[3][0]=1;
        arr[3][1]=1;
        arr[3][2]=1;

        for(int i=4; i<=100000; i++) {
            arr[i][0]=(arr[i-1][1]+arr[i-1][2])%1000000009;//1+3
            arr[i][1]=(arr[i-2][0]+arr[i-2][2])%1000000009;//2+2
            arr[i][2]=(arr[i-3][0]+arr[i-3][1])%1000000009;//3+1
        }

        for(int i=0; i<n; i++) {
            int x=scanner.nextInt();
            System.out.println((arr[x][0]+arr[x][1]+arr[x][2])%1000000009);
        }
    }
}