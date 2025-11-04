class Solution {
    boolean[] visit;
    int count=0;
    public int solution(int n, int[][] computers) {
        visit = new boolean[n];
        for(int i=0; i<n; i++){
            if(!visit[i]){
                visit[i]=true;
                dfs(computers,i);
                count++;
            }
        }
        return count;
    }
    public void dfs(int[][] computers, int node){
        for(int i=0; i<computers.length; i++){
            if(computers[node][i]==1 && node!=i && !visit[i]){
                visit[i]=true;
                dfs(computers,i);
            }
        }
        return;
    }
}