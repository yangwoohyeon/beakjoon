import java.util.*;
class Solution {
    int[][] mem;
    int N,M;
    public int solution(int m, int n, int[][] puddles) {
         N = n;
        M = m;
        mem = new int[N][M];
        for (int[] p : puddles) {
            int x = p[0] - 1;
            int y = p[1] - 1;
            mem[y][x] = -1; // 웅덩이
        }
        return dfs(0, 0);
        
    }
    public int dfs(int x, int y){
        // 범위 밖
        if (x >= N || y >= M) return 0;
        // 웅덩이
        if (mem[x][y] == -1) return 0;
        // 도착
        if (x == N - 1 && y == M - 1) return 1;
        if (mem[x][y] > 0) return mem[x][y];
        long down = dfs(x+1,y);
        long right = dfs(x,y+1);
        
        mem[x][y] = (int)((down + right)%1000000007);
        return mem[x][y];
    }
}