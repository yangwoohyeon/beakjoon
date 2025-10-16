class Solution {
    boolean[] visit;
    int answer=0;
    public int solution(String begin, String target, String[] words) {
        visit = new boolean[words.length];
        dfs(begin,target,words,0);
        return answer;
    }
    
    public void dfs(String cur, String dst, String[] words, int count){
        if(cur.equals(dst)){
            answer=count;
            return;
        }
        for(int i=0; i<words.length; i++){
            if(!visit[i] && isConvertable(cur,words[i])){
                visit[i]=true;
                dfs(words[i],dst,words,count+1);
                visit[i]=false;
            }
        }
    }
    
    public boolean isConvertable(String src, String dst){
        int diff = 0;
        for(int i=0; i<src.length(); i++){
            if(src.charAt(i)!=dst.charAt(i)){
                diff++;
            }
        }
        if(diff==1){
            return true;
        }
        return false;
    }
}