import java.io.*;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Problem10815   {
    static int N;
    static int M;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for(int i= 0; i<M; i++){
            int num = Integer.parseInt(st.nextToken());
            bw.write(BinarySearch(num)+" ");
        }

        bw.flush();

    }

    public static int BinarySearch(int num){ //이진탐색을 위한 함수
       int Tail = 0;
       int Head = N-1;


       while(Tail<=Head){
           int Mid = (Tail+Head)/2;
           int MiddleValue=arr[Mid];
           if(MiddleValue<num){
               Tail=Mid+1;
           }
           else if(MiddleValue>num){
               Head=Mid-1;
           }
           else{
               return 1;
           }
       }

       return 0;
    }
}
