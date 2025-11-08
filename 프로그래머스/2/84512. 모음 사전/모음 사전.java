class Solution {
    char[] CHAR = {'A', 'E', 'I', 'O', 'U'};
    int count = 0;
    int answer=0;
    public int solution(String word) {
        dfs("",word);
        return answer;
        
    }
    public void dfs(String s, String word){
        if(s.equals(word)){
            answer=count;
            return;
        }
        for(char c : CHAR){
            if((s+c).length() <= 5){
                count++;
                dfs(s+c,word);
            }
        }
    }
}