import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        Set<String> map = new HashSet<>();
        for(int i=0; i<phone_book.length; i++){
            map.add(phone_book[i]);
        }
        for(String str : phone_book){
            for(int i=1; i<str.length(); i++){
                if(map.contains(str.substring(0,i))){
                    return false;
                }
            }
        }
        return true;
    }
}