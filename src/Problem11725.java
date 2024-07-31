import java.util.Scanner;

public class Problem11725 {
    static Node head = new Node(1,null,null,null);
    static boolean check;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        for(int i=0; i<N-1; i++){
            int parent = scanner.nextInt();
            int son = scanner.nextInt();
            check=false;
            insertNode(head,parent,son);
            if(check==false){
                insertNode(head,son,parent);
            }
        }

        for(int i=2; i<=N; i++){
            searchNode(head,i);
        }

    }

    public static class Node{
        private int data;
        private Node left;
        private Node right;
        private Node parent;

        Node(int data, Node left, Node right,Node parent){
            this.data = data;
            this.left=left;
            this.right = right;
            this.parent = parent;
        }

    }
    public static void insertNode(Node tmp, int root, int data) {
        if (tmp == null) {
            return;
        }
        if (tmp.data == root) {
            if (tmp.left == null) {
                tmp.left = new Node(data, null, null, tmp);
                check=true;
            } else if (tmp.right == null) {
                tmp.right = new Node(data, null, null, tmp);
                check=true;
            }
        } else {
            insertNode(tmp.left, root, data);
            insertNode(tmp.right, root, data);
        }
    }

    public static void searchNode(Node tmp, int data){
        if(tmp ==null){
            return;
        }

        if(tmp.data == data){
            System.out.println(tmp.parent.data);
            return;
        }
        else{
            searchNode(tmp.left,data);
            searchNode(tmp.right,data);
        }
    }
}