import java.util.*;

class Solution {
    int[][] mem;
    public int solution(int[][] triangle) {
        mem = new int[triangle.length][triangle.length];
        for(int i=0; i<mem.length; i++){
            Arrays.fill(mem[i],-1);
        }
        mem[0][0]=triangle[0][0];
        for(int i=0; i<triangle.length-1; i++){
            down(triangle,i);
        }
        int answer = Integer.MIN_VALUE;
        for(int i=0; i<triangle[triangle.length-1].length; i++){
            if(answer<mem[triangle.length-1][i]){
                answer = mem[triangle.length-1][i];
            }
        }
        return answer;
    }
    private void down(int[][] triangle, int hight){ //hight:현재 높이
        int width = triangle[hight].length; //현재 높이의 넓이
        for(int i=0; i<width; i++){
            mem[hight+1][i]=Math.max(mem[hight][i]+triangle[hight+1][i],mem[hight+1][i]); //대각선 왼쪽
            mem[hight+1][i+1]=Math.max(mem[hight][i]+triangle[hight+1][i+1],mem[hight+1][i+1]);//대각선 오른쪽
        }
    }
}