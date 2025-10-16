class Solution {
    boolean[] visit;
    int answer;
    public int solution(int n, int[][] computers) {
        visit = new boolean[n];
        answer=0;
        for(int i=0; i<n; i++){
            if(!visit[i]){
                dfs(i,computers);
                answer++;
            }
        }
        return answer;
    }
    public void dfs(int start, int[][] computers){
        visit[start]=true;
        for(int i=0; i<computers.length; i++){
            if(computers[start][i]==1 && !visit[i]){
                dfs(i,computers);
            }
        }
    }
}