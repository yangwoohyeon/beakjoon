import java.util.*;

class Solution {
    public String[] solution(int[][] line) {
        List<long[]> list = new ArrayList<>();
        long highX = Long.MIN_VALUE;
        long lowX = Long.MAX_VALUE;
        long highY = Long.MIN_VALUE;
        long lowY = Long.MAX_VALUE;
        
        for(int i=0; i<line.length-1; i++){
            for(int j=i+1; j<line.length; j++){
                Long x = getX(line[i], line[j]);
                Long y = getY(line[i], line[j]);
                if(x != null && y != null){
                    list.add(new long[]{x, y});
                    if(x > highX) highX = x;
                    if(x < lowX) lowX = x;
                    if(y > highY) highY = y;
                    if(y < lowY) lowY = y;
                }
            }
        }
        
        int width = (int)(highX - lowX + 1);
        int height = (int)(highY - lowY + 1);
        char[][] map = new char[height][width];
        
        for(int i=0; i<height; i++) {
            Arrays.fill(map[i], '.');
        }
        for(long[] coord : list){
            int x = (int)(coord[0] - lowX);
            int y = (int)(highY - coord[1]);
            map[y][x] = '*';
        }
        String[] answer = new String[height];
        for(int i=0; i<height; i++){
            answer[i] = new String(map[i]);
        }
        return answer;
    }
    
    public static Long getX(int[] a, int[] b){
        long a1 = a[0], b1 = a[1], c1 = a[2], a2 = b[0], b2 = b[1], c2 = b[2];
        long mod = a1 * b2 - b1 * a2;
        if(mod == 0) return null;
        long nx = b1 * c2 - c1 * b2;
        if(nx % mod != 0) return null;
        return nx / mod;
    }

    public static Long getY(int[] a, int[] b){
        long a1 = a[0], b1 = a[1], c1 = a[2], a2 = b[0], b2 = b[1], c2 = b[2];
        long mod = a1 * b2 - b1 * a2;
        if(mod == 0) return null;
        long ny = c1 * a2 - a1 * c2;
        if(ny % mod != 0) return null;
        return ny / mod;
    }
}
