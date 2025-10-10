import java.util.*;

class Solution {
    int[] preorder;
    int[] postorder;
    int position=0;
    class Node{
        private final int value;
        private final int x;
        private final int y;
        Node left;
        Node right;
        private Node(int value,int x, int y){
            this.value = value;
            this.x = x;
            this.y = y;
        }
    }
    public int[][] solution(int[][] nodeinfo) {

        //Y좌표를 기준으로 내림차순
        Node[] nodes = new Node[nodeinfo.length];
        for(int i=0; i<nodes.length; i++){
            nodes[i] = new Node(i+1, nodeinfo[i][0], nodeinfo[i][1]);
        }
        Arrays.sort(nodes,(a,b)->b.y-a.y);
        Node head = nodes[0];
        for(int i=1; i<nodeinfo.length; i++){
            insertNode(head,nodes[i]);
        }
        preorder = new int[nodeinfo.length];
        postorder = new int[nodeinfo.length];
        int[][] answer = new int[2][nodeinfo.length];
        pre(head);
        position=0;
        post(head);
        answer[0]=preorder;
        answer[1]=postorder;
        return answer;
    }
    public void insertNode(Node head, Node tmp){
        if(head.left == null && head.x>tmp.x){
            head.left = tmp;
            return;
        }
        else if(head.right == null && head.x<tmp.x){
            head.right = tmp;
            return;
        }
        if(head.x>tmp.x){
            insertNode(head.left,tmp);
        }
        else if(head.x<tmp.x){
            insertNode(head.right,tmp);
        }
    }
    
    public void pre(Node head){
        if(head == null){
            return;
        }
        preorder[position++]=head.value;
        pre(head.left);
        pre(head.right);
    }
    public void post(Node head){
        if(head == null){
            return;
        }
        post(head.left);
        post(head.right);
        postorder[position++]=head.value;
    }
}