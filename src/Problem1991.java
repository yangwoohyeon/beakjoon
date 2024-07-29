import java.util.Scanner;

public class Problem1991 {
    static Node head = new Node('A',null,null);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        for(int i=0; i<N; i++){
                String st = scanner.nextLine();
                insertNode(head,st.charAt(0),st.charAt(2),st.charAt(4));
        }

        preOrder(head);
        System.out.println();
        inOrder(head);
        System.out.println();
        postOrder(head);

    }

    static class Node{
       private char data;
       private Node left;
       private Node right;
        Node(char data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
            public Node(char data, Node left, Node right){
               this.data=data;
                this.left=left;
                this.right=right;
            }

    }
    public static void preOrder(Node node){
        if(node==null){
            return;
        }
        else{
            System.out.print(node.data);
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    public static void inOrder(Node node){
        if(node==null){
            return;
        }
        else{
            inOrder(node.left);
            System.out.print(node.data);
            inOrder(node.right);
        }
    }

    public static void postOrder(Node node){
        if(node==null){
            return;
        }
        else{
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data);
        }
    }
    public static void insertNode(Node tmp, char root, char left, char right){
        if(tmp==null){
            return;
        }
        if(tmp.data==root){
            if(left!='.'){
                tmp.left=new Node(left);
            }
            if(right !='.'){
                tmp.right = new Node(right);
            }
        }
        else{
            insertNode(tmp.left,root,left,right);
            insertNode(tmp.right,root,left,right);
        }
    }

}
