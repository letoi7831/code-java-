
import java.util.Scanner;

public class BASIC007{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long L = sc.nextLong();
            long R = sc.nextLong();
            long sum = (L + R) * (R - L +1) / 2;
            System.out.println(sum);
        }
    }
}