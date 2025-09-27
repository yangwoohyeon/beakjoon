import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = Integer.MIN_VALUE;
        Arrays.sort(citations);
        for(int h = citations.length; h>=1; h--){
            int count = 0;
            for(int n : citations){
                if(h <= n){
                    count++;
                }
            }
            if(h>=count && answer<count){
                answer = count;
            }
        }
        return answer;
    }
    
}