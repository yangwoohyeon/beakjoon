class Solution {
    int answer = 0;
    boolean check=false;
    char[] CHAR = { 'A', 'E', 'I', 'O', 'U'};
    public int solution(String word) {
        dfs("",word);
        return answer;
    }
    public void dfs(String str, String word){
        if(!check && str.equals(word)){
            check=true;
            return;
        }
        for(int i=0; i<5; i++){
            if(!check && str.length()<5){
                answer++;
                dfs(str+CHAR[i],word);
            }
        }
    }
}