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

        Arrays.sort(arr, (o1, o2) -> {
            if(o1[1] == o2[1]) { //종료시간이 같을 경우 시작 시간이 빠른 순
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1];
        });

        int count=0;
        int end=0;

        for(int i=0; i<N; i++){
            if(end<=arr[i][0]){
                end=arr[i][1];
                count++;
            }
        }

        System.out.println(count);

        // 정렬된 배열 출력 (선택 사항)
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }

}
