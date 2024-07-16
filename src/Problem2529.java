import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Problem2529 {
    static int N;
    static String[] S; //부등호
    static boolean[] visit; //0부터 9까지의 숫자 사용 여부
    static ArrayList<String> number = new ArrayList<>(); //가능한 모든 경우의 숫자열을 담아두는 ArrayList

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        S = br.readLine().split(" ");
        visit = new boolean[10];

        for (int i = 0; i < 10; i++) {
            visit[i] = true;
            dfs(i, 0, i + "");
            visit[i] = false;
        }
        Collections.sort(number);
        System.out.println(number.get(number.size() - 1));
        System.out.println(number.get(0));
    }

    static void dfs(int start, int count, String num) {
        if (count == N) {
            number.add(num); //숫자가 완성된 경우 ArrayList에 추가
            return;
        }

        for (int i = 0; i < 10; i++) {
            if (!visit[i]) { // 사용되지 않은 숫자만 사용
                if (S[count].equals("<")) {// <뒤에는 start보다 큰 숫자만 올수 있다.
                    if (start < i) {
                        visit[i] = true; // 삽입할 숫자를 방문 표시
                        dfs(i, count + 1, num + i);
                        visit[i] = false;
                    }
                } else {
                    if (start > i) { //>뒤에는 i가 start보다 작을 경우만 삽입할 수 있다.
                        visit[i] = true;
                        dfs(i, count + 1, num + i);
                        visit[i] = false;
                    }
                }
            }
        }
    }
}
