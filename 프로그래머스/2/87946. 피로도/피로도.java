class Solution {
    int ans = Integer.MIN_VALUE;
    boolean[] visit;
    public int solution(int k, int[][] dungeons) {
        visit = new boolean[dungeons.length];
        dfs(k,0,dungeons);
        return ans;
    }
    private void dfs(int k, int count, int[][] dungeons){
        if(k<0){
            if(count>ans){
            ans=count;
        }
            return;
        }
        for(int i=0; i<dungeons.length; i++){
            if(!visit[i] && k>=dungeons[i][0]){
                visit[i]=true;
                dfs(k-dungeons[i][1], count+1, dungeons);
                visit[i]=false;
            }
        }
        if(count>ans){
            ans=count;
        }
    }
}