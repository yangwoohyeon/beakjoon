import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Problem11723_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String calculation;
        int num;
        boolean[] S= new boolean[21];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            calculation = st.nextToken();
            switch (calculation) {
                case "add":
                    num = Integer.parseInt(st.nextToken());
                    S[num]=true;
                    break;
                case "check":
                    num = Integer.parseInt(st.nextToken());
                    sb.append(S[num] ? "1\n" : "0\n");
                    break;
                case "remove":
                    num = Integer.parseInt(st.nextToken());
                    S[num]=false;
                    break;
                case "toggle":
                    num = Integer.parseInt(st.nextToken());
                    if (S[num]) {
                        S[num]=false;
                    }else{
                        S[num]=true;
                    }
                    break;
                case "all":
                    Arrays.fill(S,true);
                    break;
                case "empty":
                    Arrays.fill(S,false);
                    break;
            }
        }
        System.out.print(sb.toString());
    }
}
