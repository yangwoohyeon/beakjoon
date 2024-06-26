import java.util.Scanner;

public class Problem1476 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int E;
        int S;
        int M;
        int year=1;
        int e=1;
        int s=1;
        int m=1;

        E=scanner.nextInt();
        S=scanner.nextInt();
        M=scanner.nextInt();

        while(true){
            if(E==e&&S==s&&M==m){
                System.out.println(year);
                return;
            }
            m++;
            e++;
            s++;
            year++;

            if(e==16){
                e=1;
            }
            if(s==29){
                s=1;
            }
            if(m==20){
                m=1;
            }

        }

    }
}
