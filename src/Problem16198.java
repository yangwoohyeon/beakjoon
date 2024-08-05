import java.util.ArrayList;
import java.util.Scanner;

public class Problem16198 {
    static int[] arr;
    static int N;
    static int sum=0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        arr=new int[N];
        for(int i=0; i<N; i++){
            arr[i]=scanner.nextInt();
        }
    }
}
