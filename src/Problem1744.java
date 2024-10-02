import java.util.Arrays;
import java.util.Scanner;

public class Problem1744 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 환경 변수를 사용하여 사용자 설정 로드
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // 배열 입력 받기
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // 배열 오름차순 정렬
        Arrays.sort(arr);
        int sum = 0;

        int minusIdx = 0;

        //음수 ~ 0 까지 처리
        while (minusIdx < n && arr[minusIdx] < 1) {
            if (minusIdx + 1 < n && arr[minusIdx + 1] < 1) {
                sum += (arr[minusIdx] * arr[minusIdx + 1]);
                minusIdx += 2;
            } else {
                sum += arr[minusIdx];
                minusIdx++;
            }
        }
        int plusIdx = n-1;
        while(plusIdx>=minusIdx && arr[plusIdx]>0){
            if(plusIdx-1>=minusIdx && arr[plusIdx-1]>1){
                sum+=(arr[plusIdx]*arr[plusIdx-1]);
                plusIdx-=2;
            }
            else{
                sum+=arr[plusIdx];
                plusIdx--;
            }
        }

        System.out.println(sum);
    }
}
