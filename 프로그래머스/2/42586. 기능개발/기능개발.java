import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int count = 0;
        LinkedList<Integer> list = new LinkedList<>();
        
        while(count < progresses.length){
            for(int i=count; i<progresses.length; i++){
                progresses[i]=progresses[i]+speeds[i];
            }
            int finish = 0;
            for(int i=count; i<progresses.length; i++){
                if(progresses[i]<100){
                    break;
                }
                else{
                    finish++;
                }
            }
            if(finish!=0){
            list.add(finish);
            count+=finish;
            }
        }
        int[] answer = new int[list.size()];
        int i =0;
        for(int n : list){
            answer[i]=n;
            i++;
        }
        return answer;
    }
}