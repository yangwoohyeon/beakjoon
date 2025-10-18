import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        int answer = 0;
        int cam = Integer.MIN_VALUE;
        Arrays.sort(routes,(a,b) -> a[1]-b[1]);
        for(int[] route : routes){
            if(cam<route[0]){
                cam=route[1];
                answer++;
            }
        }
        return answer;
    }
}