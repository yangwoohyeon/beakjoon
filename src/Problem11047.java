import java.util.Scanner;

public class Problem11047 {
    static int N;
    static int K;
    static int[] arr;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count=0;
        N=scanner.nextInt();
        K=scanner.nextInt();
        arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i]=scanner.nextInt();
        }
        for(int i=N-1; i>=0; i--){
            if(arr[i]<=K){
                count+=K/arr[i];
                K=K%arr[i];
            }
        }
        System.out.println(count);
    }
    }

