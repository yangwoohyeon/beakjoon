class Solution {
    public int solution(int[] arr) {
        return lcm(arr);
    }
    
    public int lcm(int[] arr){
        int result = arr[0];
        for(int i=1; i<arr.length; i++){
            result = lcm(result, arr[i]);
        }
        return result;
    }
    public static int gcd(int a, int b) {
    if (b == 0) return a;
    return gcd(b, a % b);
}
    public int lcm(int a, int b){
        return (a*b)/gcd(a,b);
    }
}