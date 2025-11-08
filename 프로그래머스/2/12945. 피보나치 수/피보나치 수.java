import java.util.*;

class Solution {
    int[] mem = new int[100001];
    public int solution(int n) {
        Arrays.fill(mem,-1);
        for(int i=0; i<=n; i++){
            mem[i]=fi(i);
        }
        return mem[n];
    }
    public int fi(int num){
        if(mem[num]!=-1){
            return mem[num];
        }
        if(num==1 || num==0){
            return num;
        }
        return mem[num]=(fi(num-1)+fi(num-2))%1234567;
    }
}