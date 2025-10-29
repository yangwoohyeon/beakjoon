import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i=0; i<commands.length; i++){
            int size = commands[i][1]-commands[i][0]+1;
            int[] arr = new int[size];
            int start=commands[i][0]-1;
            for(int j=0; j<size; j++){
                arr[j]=array[start];
                start++;
            }
            Arrays.sort(arr);
            queue.add(arr[commands[i][2]-1]);
        }
        int n = queue.size();
        int[] answer = new int[n];
        for(int i=0; i<n; i++){
            answer[i]=queue.poll();
        }
        return answer;
    }
}