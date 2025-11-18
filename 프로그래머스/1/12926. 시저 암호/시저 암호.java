import java.util.*;
class Solution {
    public String solution(String s, int n) {
        StringBuilder str = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c==' '){
                str.append(' ');
                continue;
            }
            if(c>='A' && c<='Z'){
                if((char)c+n>'Z'){
                    str.append((char)(c+n-'Z'+'A'-1));
                }
                else{
                    str.append((char)(c+n));
                }
            }
            else{
                if((char)c+n>'z'){
                    str.append((char)(c+n-'z'+'a'-1));
                }
                else{
                    str.append((char)(c+n));
                }
            }
        }
        return str.toString();
    }
}