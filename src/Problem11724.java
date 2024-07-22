import java.util.ArrayList;
import java.util.Scanner;

public class Problem11724 {
    static int N;
    static int M;
    static boolean[] visit;
    static int count;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N=scanner.nextInt();
        M=scanner.nextInt();
        count=0;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        visit=new boolean[N+1];

        for(int i=0; i<=N; i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0; i<M; i++){
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            putEdge(graph,x,y);
        }

       for(int i=1; i<=N; i++){
            if(!visit[i]) {
                DFS(graph, i);
                count++;
            }
        }
        System.out.println(count);
    }

    public static void putEdge(ArrayList<ArrayList<Integer>> graph, int x, int y){
        graph.get(x).add(y);
        graph.get(y).add(x);
    }
    public static void DFS(ArrayList<ArrayList<Integer>> graph, int start){
        visit[start]= true;

        for(int y : graph.get(start)){
            if(!visit[y]){
                DFS(graph,y);
            }
        }
    }
}
