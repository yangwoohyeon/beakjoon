import java.util.*;
public class Main {
    public static Node head = new Node('A',null,null);
    static class Node{
        char data;
        Node left;
        Node right;

        public Node(char data, Node left, Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    public static void insertNode(Node tmp, char root, char left, char right){
        if(tmp.data == root){
            if(left!='.'){
                tmp.left=new Node(left,null,null);
            }
            if(right!='.'){
                tmp.right=new Node(right,null,null);
            }
        }
        else{
            if(tmp.left!=null){
                insertNode(tmp.left,root,left,right);
            }
            if(tmp.right!=null){
                insertNode(tmp.right,root,left,right);
            }
        }

    }
    public static void pre(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.data);
        pre(node.left);
        pre(node.right);
    }
    public static void in(Node node){
        if(node==null){
            return;
        }
        in(node.left);
        System.out.print(node.data);
        in(node.right);
    }
    public static void post(Node node){
        if(node==null){
            return;
        }
        post(node.left);
        post(node.right);
        System.out.print(node.data);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        scanner.nextLine();
        for(int i=0; i<n; i++){
            String str = scanner.nextLine();
            insertNode(head,str.charAt(0),str.charAt(2),str.charAt(4));
        }
        pre(head);
        System.out.println();
        in(head);
        System.out.println();
        post(head);
    }

}