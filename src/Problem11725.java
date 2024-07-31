import java.util.Scanner;

public class Problem11725 {
    static Node head = new Node(1,null,null);
    static boolean check;
    static boolean[] visit;
    static int[] parent;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        visit=new boolean[N+1];
        parent = new int[N+1];

        for(int i=0; i<N-1; i++){
            int parent = scanner.nextInt();
            int son = scanner.nextInt();
            check=false;
            insertNode(head,parent,son);
            if(check==false){
                insertNode(head,son,parent);
            }
        }
        dfs(head);

        for(int i=2; i<=N; i++){
            System.out.println(parent[i]);
        }

    }

    public static class Node{
        private int data;
        private Node left;
        private Node right;

        Node(int data, Node left, Node right){
            this.data = data;
            this.left=left;
            this.right = right;
        }

    }
    public static void insertNode(Node tmp, int root, int data) {
        if (tmp == null) {
            return;
        }
        if (tmp.data == root) {
            if (tmp.left == null) {
                tmp.left = new Node(data, null, null);
                check=true;
            } else if (tmp.right == null) {
                tmp.right = new Node(data, null, null);
                check=true;
            }
        } else {
            insertNode(tmp.left, root, data);
            insertNode(tmp.right, root, data);
        }
    }

    public static void dfs(Node node){
        visit[node.data]=true;

        if(node.left!=null && !visit[node.left.data]){
            parent[node.left.data]=node.data;
            dfs(node.left);
        }
        if(node.right!=null && !visit[node.right.data]){
            parent[node.right.data]=node.data;
            dfs(node.right);
        }

    }
}