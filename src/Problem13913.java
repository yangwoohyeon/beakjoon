import java.util.*;

public class Problem13913 {

    static int[] arr = new int[100001];
    static int[] time = new int[100001];
    static boolean[] visit = new boolean[100001];
    static int[] move = {1,-1,2};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int now = scanner.nextInt();;
        int point = scanner.nextInt();
        Arrays.fill(arr,0);
        BFS(now);

        Stack<Integer> stack = new Stack<>();
        stack.push(point);
        int index = point;

        while(index!=now){
            stack.push(arr[index]);
            index=arr[index];
        }

        System.out.println(time[point]);
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
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
                    time[next]=time[point]+1;
                    visit[next]=true;
                    arr[next]=point;

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
                    time[next]=time[point]+1;
                    visit[next]=true;
                    arr[next]=point;
                }
            }
        }
    }
}
