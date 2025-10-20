class Solution {
    public String solution(String s, int n) {
        String answer = "";
        StringBuilder str = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c==' '){
                str.append(' ');
            }
            else{
                if(c>='a' && c<='z'){ //소문자
                    if(c+n>'z'){
                        c=(char)('a'+(c+n-'z')-1);
                        str.append(c);
                    }
                    else{
                        c=(char)(c+n);
                        str.append(c);
                    }
                }
                else{
                    if(c+n>'Z'){
                        c=(char)('A'+(c+n-'Z')-1);
                        str.append(c);
                    }
                    else{
                        c=(char)(c+n);
                        str.append(c);
                    }
                }
            }
        }
        return str.toString();
    }
}