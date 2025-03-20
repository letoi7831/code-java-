
import java.util.Scanner;

public class COBAN022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int m = sc.nextInt();
            int sum = 0;
            int dem =0;
            while ( m >= x){
                m = m-x;
                sum ++ ;
                dem ++;
                if(dem == y){
                    sum++;
                    dem = 1;
                }
            }
            System.out.println(sum);
        } 
    }
}