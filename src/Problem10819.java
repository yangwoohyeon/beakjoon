import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Problem10819 {
    static int result=Integer.MIN_VALUE; //정수의 최솟값
    static int N;
    static int[] arr,selected;
    static boolean[] visited;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        N=scanner.nextInt();
        arr=new int[N];
        visited = new boolean[N];
        selected = new int[N];

        for(int i=0; i<N; i++){
            arr[i]=scanner.nextInt();
        }

        dfs(0);
        System.out.println(result);
    }

    public static void dfs(int count){
        if(count==N){
            result = Math.max(result,getResult());
            return;
        }
        for(int i=0; i<N; i++){
            if(!visited[i]){
                visited[i]=true;
                selected[count]=arr[i];
                dfs(count+1);
                visited[i]=false;
            }
        }
    }
    public static int getResult(){
        int sum = 0;
        for(int i=0; i<N-1; i++){
            sum+=Math.abs(selected[i]-selected[i+1]);
        }
        return sum;
    }
}
