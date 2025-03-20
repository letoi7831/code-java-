
import java.util.Scanner;

public class ktdayso001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int []arr = new int[n] ;
            for (int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt();
            }
            if (n < 2) {
                System.out.println("YES");
            }
            else{
                int check = 0;
            int d = arr[1] - arr[0];
            for ( int j = 1 ;j < n ; j++){
                if (arr[j] != arr[0] + j *d){
                    check = 1;
                    break;
                }
            }
            if( check == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            }
            
        }
    }
}