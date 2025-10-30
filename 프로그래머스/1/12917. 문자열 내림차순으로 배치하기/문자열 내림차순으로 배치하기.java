import java.util.*;
class Solution {
    public String solution(String s) {
        char[] str = new char[s.length()];
        for(int i=0; i<s.length(); i++){
            str[i]=s.charAt(i);
        }
        for(int i=0; i<s.length()-1; i++){
            int max = i;
            for(int j=i+1; j<s.length(); j++){
                if(str[j]>str[max]){
                    max=j;
                }
            }
            char tmp = str[max];
            str[max]=str[i];
            str[i]=tmp;
        }
        
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            ans.append(str[i]);
        }
        
        return ans.toString();
    }
}