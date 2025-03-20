import java.util.Scanner;

public class basic006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Bỏ qua dòng trống sau khi nhập số test case

        while (t-- > 0) {
            String s = sc.nextLine();
            int dem = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    dem++;
                }
            }
            System.out.println(dem);
        }
        sc.close();
    }
}
