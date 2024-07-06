import java.util.Scanner;

public class Problem6603 {
    static int[] selected,arr;
    static boolean[] visited;
    static int N;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            N=scanner.nextInt();
            if(N==0){
                break;
            }
            arr=new int[N];
            visited = new boolean[N];
            selected = new int[N];

            for(int i=0; i<N; i++){
                arr[i]=scanner.nextInt();
            }

            dfs(0,0);
            System.out.println();

        }

    }
    public static void dfs(int count,int start){ //start를 사용해서 출력 안할 숫자를 뒤부터 당겨서 올수 있다.
        if(count==6){
            for(int i=0; i<6; i++){
                System.out.print(selected[i]+" ");
            }
            System.out.println();
            return;
        }

        for(int i=start; i<N; i++){
            if(!visited[i]){
                visited[i]=true;
                selected[count]=arr[i];
                dfs(count+1,i+1);
                visited[i]=false;
            }
        }
    }
}
