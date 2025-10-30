class Solution {
    public String[] solution(String[] strings, int n) {
        for(int i=0; i<strings.length-1; i++){
            int min = i;
            for(int j=i+1; j<strings.length; j++){
                if(strings[min].charAt(n)>strings[j].charAt(n)){
                    min=j;
                }
                else if(strings[min].charAt(n)==strings[j].charAt(n) && strings[min].compareTo(strings[j])>0){
                    min=j;
                }
            }
            String tmp = strings[min];
            strings[min] = strings[i];
            strings[i]=tmp;
        }
        return strings;
    }
}