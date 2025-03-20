
import java.util.Scanner;

public class coban101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int [] arr = new int[10];
            long a = sc.nextLong();
            long b = sc.nextLong();
            if(a > b){
                long c = a;
                a = b;
                b =c;
            }
            if( a == 0){
                arr[0]++;
            }
            for(long i = a ; i <= b ; i++){
                long t1 = i ;
                while (t1 > 0){
                    int temp = (int) (t1 % 10);
                    arr[temp]++;
                    t1 /= 10;
                }
            }
            for ( int i = 0 ; i < 10 ; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
