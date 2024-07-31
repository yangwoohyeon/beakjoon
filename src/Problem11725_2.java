import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Problem11725_2 {
    static List<Integer>[] tree;
    static int[] parent;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        tree = new ArrayList[N + 1];
        parent = new int[N + 1];
        visited = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i = 0; i < N - 1; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            scanner.nextLine();

            tree[a].add(b);
            tree[b].add(a);
        }

        dfs(1);

        for (int i = 2; i <= N; i++) {
            System.out.println(parent[i]);
        }
    }

    public static void dfs(int node) {
        visited[node] = true;

        for (int child : tree[node]) {
            if (!visited[child]) {
                parent[child] = node;
                dfs(child);
            }
        }
    }
}
