import java.util.Scanner;

public class string003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String input = scanner.nextLine();

            // Tạo StringBuffer từ chuỗi nhập vào
            StringBuffer stringBuffer = new StringBuffer(input);

            // In ra độ dài của chuỗi
            System.out.println(stringBuffer.length());
        }
    }
}