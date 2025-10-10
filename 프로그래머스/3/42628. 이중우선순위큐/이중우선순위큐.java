import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<operations.length; i++){
            int size = operations[i].length();
            
            if(operations[i].charAt(0)=='I'){
                minHeap.add(Integer.parseInt(operations[i].substring(2,size)));
                maxHeap.add(Integer.parseInt(operations[i].substring(2,size)));
            }
            if(operations[i].equals("D -1")){
                if(minHeap.isEmpty()){
                continue;
            }
                int min = minHeap.poll();
                maxHeap.remove(min);
            }
            else if(operations[i].equals("D 1")){
                if(minHeap.isEmpty()){
                continue;
            }
                int max = maxHeap.poll();
                minHeap.remove(max);
            }
        }
        if(minHeap.isEmpty()){
            answer[0]=0;
            answer[1]=0;
        }
        else{
            answer[0] = maxHeap.poll();
            answer[1] = minHeap.poll();
        }
        return answer;
    }
}