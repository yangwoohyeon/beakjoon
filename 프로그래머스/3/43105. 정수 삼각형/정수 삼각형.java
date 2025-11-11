import java.util.*;
class Solution {
    int[][] mem;
    public int solution(int[][] triangle) {
        mem = new int[triangle.length][triangle[triangle.length-1].length];
        for(int i=0; i < triangle.length; i++){
            Arrays.fill(mem[i],-1);
        }

        return dfs(triangle,0,0);
       
        
    }
    private int dfs(int[][] triangle, int x, int y){
        
        if(x>= triangle.length || y >= triangle[x].length){
            return 0;
        }
        if(mem[x][y]!=-1){
            return mem[x][y];
        }
 
        int down = dfs(triangle,x+1,y); //바로 아래로 이동
        int diag = dfs(triangle,x+1,y+1); //대각선 오른쪽 아래 이동
        
        mem[x][y] = triangle[x][y] + Math.max(down,diag);
        return mem[x][y];
        
    }
}