import java.util.Arrays;
import java.util.Scanner;

public class Problem11399 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N=scanner.nextInt();

        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i]=scanner.nextInt();
        }

        Arrays.sort(arr);

        int time=0;
        for(int i=0; i<N; i++){
            for(int j=0; j<i; j++){
                time+=arr[j];
            }
            time+=arr[i];
        }
        System.out.println(time);
    }
}
