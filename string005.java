import java.util.Scanner;

public class string005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Đọc số lượng test cases
        int t = Integer.parseInt(sc.nextLine());

        while (t-- > 0) {
            String input = sc.nextLine().trim(); // Loại bỏ khoảng trắng đầu/cuối

            if (input.isEmpty()) {
                System.out.println(""); // Nếu chuỗi trống, in ra ""
                continue;
            }

            String[] words = input.split("\\s+"); // Tách câu thành mảng từ
            String longestWord = "";

            // Duyệt qua từng từ trong mảng bằng vòng lặp for với chỉ số
            for (int i = 0; i < words.length; i++) {
                if (words[i].length() >= longestWord.length()) {
                    longestWord = words[i];
                }
            }

            System.out.println(longestWord);
        }

        sc.close();
    }
}