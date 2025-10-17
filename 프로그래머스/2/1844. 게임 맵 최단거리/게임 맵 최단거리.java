import java.util.*;
class Solution {
    boolean[][] visit;
    int answer=Integer.MAX_VALUE;
    boolean check=false;
    public int solution(int[][] maps) {
        
        visit = new boolean[maps.length][maps[0].length];
        //dfs(maps,0,0,1);

        
        bfs(maps);
        
        
        if(!check){
            return -1;
        }
        return answer;
    }
    public void bfs(int[][] maps){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0,0,1});
        visit[0][0]=true;
        while(!queue.isEmpty()){
            int[] pos = queue.poll();
            int x = pos[0];
            int y = pos[1];
            int count = pos[2];
            if(x==maps.length-1 && y==maps[0].length-1){
                check=true;
                answer=count;
                break;
            }
            //아래로 한칸
        if(x+1 <maps.length && maps[x+1][y]==1 && !visit[x+1][y]){
            visit[x+1][y]=true;
            queue.offer(new int[]{x+1,y,count+1});
        }
        //오른쪽으로 이동
        if(y+1 <maps[0].length && maps[x][y+1]==1 &&!visit[x][y+1]){
            visit[x][y+1]=true;
            queue.offer(new int[]{x,y+1,count+1});
        }
        //왼쪽으로 이동
        if(y-1>=0 && maps[x][y-1]==1&&!visit[x][y-1]){
            visit[x][y-1]=true;
            queue.offer(new int[]{x,y-1,count+1});
        }
        //위로 이동
        if(x-1 >=0 && maps[x-1][y]==1&&!visit[x-1][y]){
            visit[x-1][y]=true;
            queue.offer(new int[]{x-1,y,count+1});
        }
        }
    }
    public void dfs(int[][] maps, int x, int y, int count){
        visit[x][y]=true;
        if(x==maps.length-1 && y==maps[0].length-1){
            check=true;
            if(count<answer){
                answer=count;
            }
            visit[x][y]=false;
            return;
        }
    
        //아래로 한칸
        if(x+1 <maps.length && maps[x+1][y]==1 && !visit[x+1][y]){
            dfs(maps,x+1,y,count+1);
        }
        //오른쪽으로 이동
        if(y+1 <maps[0].length && maps[x][y+1]==1 &&!visit[x][y+1]){
            dfs(maps,x,y+1,count+1);
        }
        //왼쪽으로 이동
        if(y-1>=0 && maps[x][y-1]==1&&!visit[x][y-1]){
            dfs(maps,x,y-1,count+1);
        }
        //위로 이동
        if(x-1 >=0 && maps[x-1][y]==1&&!visit[x-1][y]){
            dfs(maps,x-1,y,count+1);
        }
        visit[x][y]=false;
        
    }
}