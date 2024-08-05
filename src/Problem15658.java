import java.util.Scanner;

public class Problem15658 {
    static int[] arr;
    static int[] x=new int[4];
    static int N;
    static int max=Integer.MIN_VALUE;
    static int min=Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N=scanner.nextInt();
        arr=new int[N];

        for(int i=0; i<N; i++){
            arr[i]=scanner.nextInt();
        }
        for(int i=0; i<4; i++){
            x[i]=scanner.nextInt();
        }

        dfs(1,arr[0]);
        System.out.println(max);
        System.out.println(min);

    }
    static void dfs(int index, int value){
        if(index==N){
            if(value>max){
                max=value;
            }
            if(value<min){
                min=value;
            }
            return;
        }
        for(int i=0; i<4; i++){
            if(x[i]>0){
                x[i]--;
                if(i==0){
                    dfs(index+1,value+arr[index]);
                }
                else if(i==1){
                    dfs(index+1,value-arr[index]);
                }
                else if(i==2){
                    dfs(index+1,value*arr[index]);
                }
                else if(i==3){
                    dfs(index+1,value/arr[index]);
                }
                x[i]++;
            }

        }
    }
}
