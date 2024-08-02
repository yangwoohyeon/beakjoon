import java.util.Arrays;
import java.util.Scanner;

public class Problem14225 {
    static int[] arr;
    static int N;
    static boolean[] visit;
    static boolean[] sum=new boolean[2000001];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N=scanner.nextInt();
        arr=new int[N];
        visit=new boolean[N];

        for(int i=0; i<N; i++){
            arr[i]=scanner.nextInt();
        }
        Arrays.fill(visit,false);
        Arrays.fill(sum,false);

        dfs(0,0);

        int count = 1;
        while(true){
            if(count>2000001){
                break;
            }
            if(!sum[count]){
                System.out.println(count);
                break;
            }
            else{
                count++;
            }
        }


    }
    static void dfs(int start, int value){
        if(start>=N){
            return;
        }
        for(int i=start; i<N; i++){
            if(!visit[i]) {
                visit[i]=true;
                value=value+arr[i];
                if(value<=2000000) {
                    sum[value] = true;
                }
                dfs(i+1,value);
                value-=arr[i];
                visit[i]=false;
            }
        }
    }
}
