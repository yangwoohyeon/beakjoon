import java.util.Scanner;

public class Problem14888 {
    static int[] x = new int[4];
    static int N;
    static int[] arr;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();  // N을 먼저 입력받음
        arr = new int[N];  // N을 이용해 배열 크기를 초기화
        for(int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        for(int i = 0; i < 4; i++) {
            x[i] = scanner.nextInt();
        }
        // 첫 번째 값으로 시작
        dfs(1, arr[0]);
        System.out.println(max);
        System.out.println(min);
    }

    public static void dfs(int index, int value) {
        // 모든 숫자를 다 사용한 경우
        if(index == N) {
            if(value > max) {
                max = value;
            }
            if(value < min) {
                min = value;
            }
            return;
        }
        // 4개의 연산자를 사용해 다음 값을 계산
        for(int i = 0; i < 4; i++) {
            if(x[i] > 0) {
                x[i]--;
                if(i == 0) {  // +
                    dfs(index + 1, value + arr[index]);
                } else if(i == 1) {  // -
                    dfs(index + 1, value - arr[index]);
                } else if(i == 2) {  // *
                    dfs(index + 1, value * arr[index]);
                } else if(i == 3) {  // /
                    dfs(index + 1, value / arr[index]);
                }
                x[i]++;
            }
        }
    }
}
