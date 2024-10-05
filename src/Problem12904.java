import java.util.Scanner;

public class Problem12904 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        String T = scanner.nextLine();
        while(S.length()<T.length()){
            if(T.charAt(T.length()-1)=='A'){
                T=T.substring(0,T.length()-1);
            }
            else{
                T=T.substring(0,T.length()-1);
                StringBuffer sb = new StringBuffer(T);
                sb.reverse();
                T=sb.toString();
            }
        }

        if(S.equals(T)){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }

}
