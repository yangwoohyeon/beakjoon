import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem10816 {
    static int N;
    static int M;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        M=Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        for(int i=0; i<M; i++){
            int num = Integer.parseInt(st.nextToken());
            bw.write(findLast(num)-findStart(num)+" ");
        }
        bw.flush();

    }
    public static int findStart(int num){
        int Head = arr.length;
        int Tail=0;
        while(Head>Tail){
            int Mid = (Head+Tail)/2;
            if(num<=arr[Mid]){
                Head=Mid;
            }
            else{
                Tail=Mid+1;
            }
        }
        return Tail;
    }

    public static int findLast(int num){
        int Head = arr.length;
        int Tail = 0;
        while(Head>Tail){
            int Mid = (Head+Tail)/2;
            if(num<arr[Mid]){
                Head=Mid;
            }
            else{
                Tail=Mid+1;
            }
        }
        return Tail;
    }

}
