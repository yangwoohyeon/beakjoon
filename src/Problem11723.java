import java.util.HashSet;
import java.util.Scanner;

public class Problem11723 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String calculation;
        int num;
        HashSet<Integer> S = new HashSet<Integer>();

        for(int i=0; i<N; i++){
            calculation=scanner.next();
            if(calculation.equals("add")){
                num=scanner.nextInt();
                S.add(num);
            }
            else if(calculation.equals("check")){
                num=scanner.nextInt();
                if(S.contains(num)){
                    System.out.println("1");
                }
                else{
                    System.out.println("0");
                }
            }
            else if(calculation.equals("remove")){
                num=scanner.nextInt();
                S.remove(num);
            }
            else if(calculation.equals("toggle")){
                num=scanner.nextInt();
                if(S.contains(num)){
                    S.remove(num);
                }
                else{
                    S.add(num);
                }
            }
            else if(calculation.equals("all")){
                for(int j=1; j<=20; j++){
                    S.add(j);
                }
            }
            else if(calculation.equals("empty")){
                S.clear();
            }
        }
    }
}
