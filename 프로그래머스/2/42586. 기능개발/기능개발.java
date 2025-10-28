import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
       
        Queue<Integer> queue = new LinkedList<>();
        int pos=0;
        while(true){
            if(pos>=progresses.length){
                break;
            }
            for(int i=pos; i<progresses.length; i++){
                progresses[i]+=speeds[i];
            }
            int count=0;
            for(int i=pos; i<progresses.length; i++){
                if(progresses[i]<100){
                    break;
                }
                if(progresses[i]>=100){
                    count++;
                    pos++;
                }
            }
            if(count>0){
                queue.add(count);
            }
        }
        int n = queue.size();
        int[] answer = new int[n]; 
        for(int i=0; i<n; i++){
            answer[i]=queue.poll();
        }
        return answer;
    }
}