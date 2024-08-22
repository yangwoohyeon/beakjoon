import java.util.Arrays;
import java.util.Scanner;

public class Problem1931 {
    static int[][] arr;
    static int N;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N=scanner.nextInt();

        arr=new int[N][2];

        for(int i=0; i<N; i++){
            for(int j=0; j<2; j++){
                arr[i][j]=scanner.nextInt();
            }
        }

        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));


    }

    static void dfs(int index, int count){

    }
}
