import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Problem10845 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] queue = new int[10000];
        int head = 0;
        int tail = 0;

        for(int i=0; i<N; i++){
            String str = scanner.next();
            if(str.equals("push")){
                queue[tail]=scanner.nextInt();
                tail++;
            }
            else if(str.equals("pop")){
                if(tail-head==0){
                    System.out.println("-1");
                }
                else {
                    System.out.println(queue[head]);
                    head++;
                }
            }
            else if(str.equals("size")){
                if(tail-head==0){
                    System.out.println("0");
                }
                else {
                    System.out.println(tail - head);
                }
            }
            else if(str.equals("empty")){
                if(tail-head==0){
                    System.out.println("1");
                }
                else{
                    System.out.println("0");
                }
            }
            else if(str.equals("front")){
                if (tail - head == 0) {
                    System.out.println("-1");
                }else {
                    System.out.println(queue[head]);
                }
            }
            else if(str.equals("back")){
                if(tail-head==0){
                    System.out.println("-1");
                }
                else{
                    System.out.println(queue[tail-1]);
                }
            }

        }
    }
}
