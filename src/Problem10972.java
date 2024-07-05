import java.util.Scanner;

public class Problem10972 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N= scanner.nextInt();
        int[] arr = new int[N];
        int count = N-1;
        int j=0;
        for(int i=0; i<N; i++){
            arr[i]=scanner.nextInt();
        }

        for(int i=N-1; i>0; i--){
            if(arr[i]>arr[i-1]){
                count--;
            }
            else{
                break;
            }
        }

        if(count==0){
            System.out.println("-1");
        }
        else{
           for(int i=count; i<N; i++){
               if(arr[count-1]>arr[i]){
                   j=i;
               }
           }
           int tmp=arr[j];
           arr[j]=arr[count-1];
           arr[count-1]=tmp;

           j=N-1;
           while(count<j){
               tmp=arr[count];
               arr[count]=arr[j];
               arr[j]=tmp;
               count+=1;
               j-=1;
           }

            for(int i=0; i<N; i++){
                System.out.print(arr[i]+" ");
            }
        }


    }
}
