import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Problem10828 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N=scanner.nextInt();
        String str;
        int top=0;
        int[] stack = new int[10000];

        for(int i=0; i<N; i++){
            str = scanner.next();
            if(str.equals("push")){
                    stack[top]=scanner.nextInt();
                top++;
            }
            else if(str.equals("top")){
                if(top==0){
                    System.out.println("-1");
                }else {
                    System.out.println(stack[top-1]);
                }
            }
            else if(str.equals("size")){
                System.out.println(top);
            }
            else if(str.equals("empty")){
                if(top==0){
                    System.out.println("1");
                }
                else{
                    System.out.println("0");
                }
            }
            else if(str.equals("pop")) {
                if (top == 0) {
                    System.out.println("-1");
                } else {
                    top-=1;
                    System.out.println(stack[top]);
                    stack[top]=0;

                }
            }
        }

    }
}
