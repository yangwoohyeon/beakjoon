import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        HashSet<Character> set = new HashSet<>();
        int[] c1 = new int[26];
        int[] c2 = new int[26];
        for(char c : before.toCharArray()){
            c1[c-'a']++;
            set.add(c);
        }
        for(char c : after.toCharArray()){
            c2[c-'a']++;
            if(!set.contains(c)){
                return 0;
            }
            set.add(c);
        }
        for(int i=0; i<26; i++){
            if(c1[i]!=c2[i]){
                return 0;
            }
        }
        return 1;
    }
}