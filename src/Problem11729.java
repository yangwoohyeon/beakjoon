import java.util.Scanner;
import java.util.Stack;

public class Problem11729 {
    static int N;
    public static  StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();


        sb.append((int)Math.pow(2,N)-1).append('\n');
        move(N,1,2,3);
        System.out.println(sb);
    }

    public static void move(int n,int h1,int h2, int h3) {
            if(n==1){
            sb.append(h1+" "+h3+"\n");
            return;
        }
        move(n-1,h1,h3,h2); //A --> B
        sb.append(h1+" "+h3+"\n"); // A --> C
        move(n-1,h2,h1,h3); // B --> C
    }

}
