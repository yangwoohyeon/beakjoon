import java.util.*;

public class Problem1260 {
    static int N;
    static int M;
    static int V;
    static boolean[] visit;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N=scanner.nextInt();
        M=scanner.nextInt();
        V=scanner.nextInt();

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        visit = new boolean[N+1];

        for(int i=0; i<=N; i++){
            graph.add(new ArrayList<>()); //각 노드 별 리스트를 만들어준다.
        }

        for(int i=0; i<M; i++){
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            putEdge(graph,x,y);
        }

        for(int i=0; i<=N; i++){ //ArrayList 정렬
            Collections.sort(graph.get(i));
        }


        dfs(graph,V);
        System.out.println();
        Arrays.fill(visit,false);
        bfs(graph,V);


    }

    public static void putEdge(ArrayList<ArrayList<Integer>> graph, int x, int y){
        graph.get(x).add(y);
        graph.get(y).add(x);
    }

    public static void dfs(ArrayList<ArrayList<Integer>> graph, int x){
        visit[x]=true;

        System.out.print(x + " ");

        for(int y :  graph.get(x)){
            if(!visit[y]){
                dfs(graph,y);
            }
        }
    }
    public static void bfs(ArrayList<ArrayList<Integer>> graph, int x){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(x);
        visit[x]=true;

       while(!queue.isEmpty()){
           int y = queue.poll();
           System.out.print(y + " ");

           for(int j : graph.get(y)){
               if(!visit[j]){
                   queue.offer(j);
                   visit[j]=true;
               }
           }
       }

    }
}
