import java.util.*;

class Solution {
    public int[] solution(long n) {
        StringBuilder str = new StringBuilder();
        while(true){
            long number = n%10;
            str.append(number);
            n=n/10;
            if(n==0){
                break;
            }
        }
        String s = str.toString();
        int[] answer = new int[s.length()];
        int idx=0;
        for(int i=0; i<s.length(); i++){
            answer[i]=s.charAt(i)-'0';
        }
        return answer;
    }
}