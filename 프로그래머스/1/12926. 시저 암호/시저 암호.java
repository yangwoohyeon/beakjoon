class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        StringBuilder str = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                char c = (char)(s.charAt(i)+n);
                if(c>'z'){
                    c = (char)(c-26);
                }
                str.append(c);
            }
            else if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                char c = (char)(s.charAt(i)+n);
                if(c>'Z'){
                    c = (char)(c-26);
                }
                str.append(c);
            }
            else{
                //공백
                str.append(s.charAt(i));
            }
        }
        answer = str.toString();
        return answer;
    }
}