class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n);
        int[] arr = new int[str.length()];
        int p = str.length()-1;
        for(int i=0; i<arr.length; i++){
            arr[i]=(int)str.charAt(p)-'0';
            p--;
        }
        return arr;
    }
}