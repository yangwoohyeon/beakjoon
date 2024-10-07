import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Problem11728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int[] arr2 = new int[M];

        st = new StringTokenizer(br.readLine());
        for(int i =0; i<N; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++){
            arr2[i]=Integer.parseInt(st.nextToken());
        }

        int p1=0;
        int p2=0;

        while(p1<N &&p2<M){
            if(arr[p1]<=arr2[p2]){
                sb.append(arr[p1++]+" ");
            }
            else{
                sb.append(arr2[p2++]+" ");
            }
        }

        if(p1==arr.length){
            for(int j=p2; j<M; j++){
                sb.append(arr2[j]+" ");
            }
        }
        else if(p2==arr2.length){
            for(int j=p1; j<N; j++){
                sb.append(arr[j]+" ");
            }
        }

        System.out.println(sb);

    }
}
