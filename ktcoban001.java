
import java.util.Scanner;

public class ktcoban001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        
        while (test-- > 0) {
            long n = scanner.nextLong();
            long k = n;
            long[] a = new long[20];
            long sum = 0;
            int m = 0;
            while (n != 0) {
                long last = n % 10;
                a[m++] = last;
                n /= 10;
            }
            
            for (int i = 0; i < m; i++) {
                sum += Math.pow(a[i], m);
            }
            
            if (k == sum)
                System.out.print("1");
            else
                System.out.print("0");
            
            System.out.println();
        }
    }
}