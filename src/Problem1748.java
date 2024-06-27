import java.util.Scanner;

public class Problem1748 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result=0;
        int len=10;
        int count=1;

        for(int i=1; i<=n; i++){
            if(i==len){
                len=len*10;
                count++;
            }
           result=result+count;
        }
        System.out.println(result);
    }
}
