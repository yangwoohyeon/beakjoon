import java.util.*;

class Solution {
    int answer;
    public int solution(int k, int[][] dungeons) {
       boolean[] visit = new boolean[dungeons.length];
        answer = Integer.MIN_VALUE;
        dfs(k,dungeons,visit,0);
        return answer;
        
    }
    public void dfs(int k, int[][] dungeons, boolean[] visit, int count){
        for(int i=0; i<dungeons.length; i++){
            if(visit[i]==false && k>=dungeons[i][0]){
                visit[i]=true;
                count++;
                if(count>answer){
                    answer = count;
                }
                dfs(k-dungeons[i][1],dungeons,visit,count);
                visit[i]=false;
                count--;
            }
            
        }
        
    }
 
} 