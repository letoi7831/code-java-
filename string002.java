import java.util.Scanner;

public class string002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số lượng test case
        int t = sc.nextInt();

        while (t-- > 0) {
            // Nhập chuỗi liền với chỉ số, tách riêng phần chuỗi và chỉ số
            String input = sc.next();
            int index = Character.getNumericValue(input.charAt(input.length() - 1)); // Lấy số cuối cùng làm index
            String s = input.substring(0, input.length() - 1); // Phần còn lại là chuỗi

            // Tạo StringBuffer và lấy ký tự tại vị trí index
            StringBuffer stringBuffer = new StringBuffer(s);
            System.out.println("The character at position " + index + " is " + stringBuffer.charAt(index));
        }

        sc.close();
    }
}