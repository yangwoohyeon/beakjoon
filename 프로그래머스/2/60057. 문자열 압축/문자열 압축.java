import java.util.*;

class Solution {
    private List<String> split(String source, int length){
        List<String> token = new ArrayList<>();
        for(int i=0; i<source.length(); i+=length){
            int start = i;
            int end = start+length;
            if(end>source.length()){
                end=source.length();
            }
            token.add(source.substring(start,end));
        }
        return token;
    }
    private int compress(String s, int length){
        StringBuilder str = new StringBuilder();
        String last="";
        int count = 0;
        for(String a : split(s,length)){
            if(a.equals(last)){
                count++;
            }
            else{
                if(count>1){
                    str.append(count);
                }
                str.append(last);
                last=a;
                count=1;
            }
        }
        if(count>1){
            str.append(count);
        }
        str.append(last);
        return str.length();
    }
    public int solution(String s) {
        int min = Integer.MAX_VALUE;
        for(int i=1; i<=s.length(); i++){
            int compressed = compress(s,i);
            if(compressed<min){
                min = compressed;
            }
        }
        return min;
    }
}