class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder str = new StringBuilder();
        int n=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==' '){
                n=0;
                str.append(s.charAt(i));
                continue;
            }
            if(n%2==0){
                str.append(Character.toUpperCase(s.charAt(i)));
                n++;
            }
            else{
                str.append(Character.toLowerCase(s.charAt(i)));
                n++;
            }
        }
        answer= str.toString();
        return answer;
    }
}