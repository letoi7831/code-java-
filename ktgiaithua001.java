import java.util.Scanner;

public class ktgiaithua001 {
    static final int MAX = 100000;
    
    static int multiply(int x, int res[], int res_size) {
        int carry = 0;
        
        for (int i = 0; i < res_size; i++) {
            int prod = res[i] * x + carry;
            res[i] = prod % 10;
            carry = prod / 10;
        }
        
        while (carry > 0) {
            if (res_size >= MAX) {
                System.out.println("Result exceeds maximum storage capacity.");
                return res_size;
            }
            res[res_size] = carry % 10;
            carry /= 10;
            res_size++;
        }
        return res_size;
    }
    
    static void power(int x, int n) {
        if (n == 0) {
            System.out.println("1");
            return;
        }
        if (x == 0) {
            System.out.println("0");
            return;
        }
        
        int res[] = new int[MAX];
        int res_size = 0;
        int temp = x;
        
        while (temp != 0) {
            res[res_size++] = temp % 10;
            temp /= 10;
        }
        
        for (int i = 2; i <= n; i++) {
            res_size = multiply(x, res, res_size);
        }
        
        for (int i = res_size - 1; i >= 0; i--) {
            System.out.print(res[i]);
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int base = sc.nextInt();
            int exponent = sc.nextInt();
            if (base < 0 || exponent < 0) {
                System.out.println("Base and exponent must be non-negative.");
                continue;
            }
            power(base, exponent);
        }
        
        sc.close();
    }
}
