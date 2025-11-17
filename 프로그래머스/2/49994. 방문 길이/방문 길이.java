class Solution {
    public int solution(String dirs) {
        int count=0;
        boolean[][][] arr = new boolean[11][11][4]; //0:위 1:아래 2:좌 3:우
        int x = 5;
        int y = 5;
        for(int i=0; i<dirs.length(); i++){
            char c = dirs.charAt(i);
            if(c=='L' && y>=1){
                if(arr[x][y][2]){
                    y--;
                    continue;
                }
                arr[x][y][2]=true;
                arr[x][y-1][3]=true;
                y--;
                count++;
            }
            
            if(c=='R' && y<10){
                if(arr[x][y][3]){
                    y++;
                    continue;
                }
                arr[x][y][3]=true;
                arr[x][y+1][2]=true;
                y++;
                count++;
            }
            
            if(c=='U' && x>=1){
                if(arr[x][y][0]){
                    x--;
                    continue;
                }
                arr[x][y][0]=true;
                arr[x-1][y][1]=true;
                x--;
                count++;
            }
            if(c=='D' && x<10){
                if(arr[x][y][1]){
                    x++;
                    continue;
                }
                arr[x][y][1]=true;
                arr[x+1][y][0]=true;
                x++;
                count++;
            }
            
        }
        return count;
    }
}