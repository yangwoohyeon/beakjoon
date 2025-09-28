import java.util.*;
class Solution {
    public int solution(int n, int k, int[] enemy) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int answer =0;
        for(int e : enemy){
            n-=e;
            maxHeap.add(e);
            if(n<0){
                if(k==0){
                    return answer++;
                }
                else{
                    n+=maxHeap.poll();
                    k--;
                }
            }
            answer++;
        }
        return answer;
    }
}