import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Problem1339 {
    static Integer[] a=new Integer[26];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < 26; i++) {
            a[i] = 0; // 초기화
        }
        for(int i=0; i<N; i++){
            String st;
            st=scanner.nextLine();
            int v=1;
            for(int j=st.length()-1; j>=0; j--){ //자릿수 설정
                a[st.charAt(j)-'A']+=v;
                v=v*10;

            }
        }
        Arrays.sort(a, Collections.reverseOrder());
        int num=9;
        int max=0;
        for(int i=0; i<26; i++){
            if(a[i]==0){
                break;
            }
            max+=a[i]*num;
            num--;
        }
        System.out.println(max);
    }
}
