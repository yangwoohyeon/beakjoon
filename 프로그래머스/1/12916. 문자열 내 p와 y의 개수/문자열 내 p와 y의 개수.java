class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int p =0;
        int y =0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='p' || c=='P'){
                p++;
            }
            if(c=='Y' || c=='y'){
                y++;
            }
        }
        if(p==y){
            return true;
        }
        else return false;
    }
}