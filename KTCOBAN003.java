import java.util.Scanner;

public class KTCOBAN003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long L = sc.nextLong();
            long R = sc.nextLong();

            int a = (int) Math.sqrt(L);
            if (a * a < L) a++; // Nếu a^2 < L thì tăng a lên để đảm bảo a^2 >= L
            int b = (int) Math.sqrt(R);
            int count = (b >= a) ? (b - a + 1) : 0; // Tính số lượng số chính phương
            System.out.println(count);
        }
    }
}