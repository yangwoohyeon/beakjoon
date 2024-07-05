import java.util.Scanner;

public class Problem10974 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i]=i+1;
        }

        while(true) {
            int j=0;
            int count = N-1;
            for (int i = 0; i < N; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            for(int i = N - 1; i > 0; i--) {
                if (arr[i] < arr[i - 1]) {
                    count--;
                }
                else{
                    break;
                }
            }
            if(count==0){
                break;
            }
            for (int i = count; i < N; i++) {
                if (arr[count - 1] < arr[i]) {
                    j = i;
                }
            }

            int tmp = arr[j];
            arr[j] = arr[count - 1];
            arr[count - 1] = tmp;

            int x = N - 1;
            while (count < x) {
                tmp = arr[count];
                arr[count] = arr[x];
                arr[x] = tmp;
                count += 1;
                x -= 1;
            }
        }
    }
}
