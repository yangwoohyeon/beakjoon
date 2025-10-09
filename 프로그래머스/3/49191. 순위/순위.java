class Solution {
    public int solution(int n, int[][] results) {
        int answer = 0;
        int[][] graph = new int[n+1][n+1];
        for(int[] edge : results){
            int A = edge[0];
            int B = edge[1];
            graph[A][B]=1;
            graph[B][A]=-1;
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                for(int k=1; k<=n; k++){
                    if(graph[i][k]==1 && graph[k][j]==1){
                        graph[i][j]=1;
                        graph[j][i]=-1;
                    }
                    if(graph[i][k]==-1 && graph[k][j]==-1){
                        graph[i][j]=-1;
                        graph[j][i]=1;
                    }
                }
            }
        }
        
        for(int i=1; i<=n; i++){
            int count=0;
            for(int j=1; j<=n; j++){
                if(graph[i][j]!=0){
                    count++;
                }
            }
            if(count==n-1){
                answer++;
            }
        }
        return answer;
    }
}