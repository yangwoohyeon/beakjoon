import java.util.*;

class Solution {
    char[] CHARS={'A','E','I','O','U'};
    int count = 0;
    int ans = 0;
    int answer = 0;
    public int solution(String word) {
        dfs("",word);
        return ans;
        
    }
    public void dfs(String s, String word){
        if(word.equals(s)){
            answer = 1;
            ans=count;
        }
        if(answer == 0 && s.length() != 5){
            for(char c : CHARS){
                count++;
                dfs(s+c,word);
            }
        }
        if(answer == 1){
            return;
        }
    } 
}