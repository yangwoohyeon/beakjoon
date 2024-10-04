import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Problem10610 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.nextLine();
        int[] arr = new int[N.length()];
        int sum = 0;
        for(int i=0; i<N.length(); i++){
            arr[i]=N.charAt(i)-48;
            sum+=arr[i];
        }
        Arrays.sort(arr);
        if(arr[0]==0 && sum%3==0){ // 30의 배수가 되는 경우
          for(int i=arr.length-1; i>=0; i--){
              System.out.print(arr[i]);
          }
        }
        else{
            System.out.println("-1");
        }

    }
}