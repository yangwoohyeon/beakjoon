import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem1697 {

    static int[] arr = new int[100001];
    static boolean[] visit = new boolean[100001];
    static int[] move = {1,-1,2};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int now = scanner.nextInt();;
        int point = scanner.nextInt();
        Arrays.fill(arr,0);
        BFS(now);

        System.out.println(arr[point]);
    }

    public static void BFS(int now){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(now);
        visit[now]=true;

        while(!queue.isEmpty()){
            int point = queue.poll();
            for(int i=0; i<3; i++){
                if(i==2){
                    int next = point*2;
                    if(next<0 || next>100000){
                        continue;
                    }
                    if(visit[next]){
                        continue;
                    }
                    queue.add(next);
                    arr[next]=arr[point]+1;
                    visit[next]=true;

                }
                else {
                    int next = point + move[i];
                    if(next<0 || next>100000){
                        continue;
                    }
                    if(visit[next]){
                        continue;
                    }
                    queue.add(next);
                    arr[next]=arr[point]+1;
                    visit[next]=true;
                }
            }
        }
    }
}
