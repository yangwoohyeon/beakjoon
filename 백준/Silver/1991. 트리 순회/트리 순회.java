    import java.util.Scanner;

    public class Main {
        static Node head = new Node('A',null,null);
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
                tmp.left = (left == '.' ? null : new Node(left,null,null));
                tmp.right = (right =='.'? null : new Node(right,null,null));
            }
            else {
                if (tmp.left != null) {
                    insertNode(tmp.left, root, left, right);
                }
                if (tmp.right != null) {
                    insertNode(tmp.right, root, left, right);
                }
            }
        }

        public static void pre(Node head){
            if(head == null){
                return;
            }
            System.out.print(head.data);
            pre(head.left);
            pre(head.right);
        }
        public static void in(Node head){
            if(head == null){
                return;
            }
            in(head.left);
            System.out.print(head.data);
            in(head.right);
        }
        public static void post(Node head){
            if(head == null){
                return;
            }
            post(head.left);
            post(head.right);
            System.out.print(head.data);
        }
        public static void main(String[] args) {
            int n;
            Scanner sc = new Scanner(System.in);
            n=sc.nextInt();
            sc.nextLine();
            for(int i=0; i<n; i++){
                String s = sc.nextLine();
                insertNode(head,s.charAt(0),s.charAt(2),s.charAt(4));
            }
            pre(head);
            System.out.println();
            in(head);
            System.out.println();
            post(head);
        }

    }