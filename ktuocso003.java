import java.util.Scanner;
public class ktuocso003 {
    public static long tonguoc (long n) {
        if (n == 1) return 0;
        long sum = 1;
        for (int i = 2 ; i *i <= n ; i++){
            if (n % i == 0){
                if (i*i != n){
                    sum = sum + i + n/i;
                }
                else{
                    sum = sum + i;
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            long n = sc.nextLong();
            if (tonguoc(n) == n){
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
        }
    }
}
