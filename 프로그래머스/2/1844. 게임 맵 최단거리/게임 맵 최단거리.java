import java.util.*;
class Solution {
    boolean[][] visit;

    public int solution(int[][] maps) {
        visit = new boolean[maps.length][maps[0].length];
        return bfs(maps);
    }
    public int bfs(int[][] maps){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0,0});
        int count = 1;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0; i<size; i++){
                int[] pos= queue.poll();
                int x=pos[0];
                int y=pos[1];
                if(x==maps.length-1 && y==maps[0].length-1){
                    return count;
                }
                //위
                if(x-1>=0 && !visit[x-1][y] && maps[x-1][y]==1){
                    queue.add(new int[]{x-1,y});
                    visit[x-1][y]=true;
                }
                //아래
                if(x+1<maps.length && !visit[x+1][y] && maps[x+1][y]==1){
                    queue.add(new int[]{x+1,y});
                    visit[x+1][y]=true;
                }
                //오른쪽
                if(y+1<maps[0].length && !visit[x][y+1] && maps[x][y+1]==1){
                    queue.add(new int[]{x,y+1});
                    visit[x][y+1]=true;
                }
                //왼쪽
                if(y-1>=0 && !visit[x][y-1] && maps[x][y-1]==1){
                    queue.add(new int[]{x,y-1});
                    visit[x][y-1]=true;
                }
            }
            count++;
        }
        return -1;
    }
}