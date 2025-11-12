import java.util.*;
class Solution {
    Queue<int[]> queue = new LinkedList<>();
    public int[][] solution(int n) {
        hanoi(n,1,2,3);
        int size = queue.size();
        int[][] answer= new int[size][2];
        for(int i=0; i<size; i++){
            answer[i]=queue.poll();
        }
        return answer;
    }
    public void hanoi(int n, int h1, int h2, int h3){
        if(n==1){
            queue.add(new int[] {h1,h3});
            return;
        }
        hanoi(n-1,h1,h3,h2);
        queue.add(new int[] {h1,h3});
        hanoi(n-1,h2,h1,h3);
    }
}