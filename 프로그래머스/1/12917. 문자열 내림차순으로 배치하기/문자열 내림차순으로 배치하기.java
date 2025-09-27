import java.util.*;

class Solution {
    public String sort(char[] c){
        for(int i=0; i<c.length-1; i++){
            for(int j=c.length-1; j>i; j--){
                if(c[j]>c[j-1]){
                    char tmp = c[j];
                    c[j]=c[j-1];
                    c[j-1]=tmp;
                }
            }
        }
        StringBuilder str = new StringBuilder();
        for(char a : c){
            str.append(a);
        }
        return str.toString();
    }
    public String solution(String s) {
        StringBuilder str = new StringBuilder();
        char[] c = s.toCharArray();
        
        return sort(c);
    }
}