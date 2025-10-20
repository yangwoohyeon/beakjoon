import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder str = new StringBuilder();
        int idx=0;
        for(int i=0; i<s.length(); i++){
            char c= s.charAt(i);
            if(c==' '){
                str.append(c);
                idx=0;
                continue;
            }
            if(idx%2==0){
                if(c>='a' && c<='z'){
                    c=(char)('A'+c-'a');
                }
                str.append(c);
            }
            else{
                if(c>='A' && c<='Z'){
                    c=(char)('a'+c-'A');
                }
                str.append(c);
            }
            idx++;
        }
        return str.toString();
    }
}