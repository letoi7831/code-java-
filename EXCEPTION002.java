import java.util.Scanner;

public class EXCEPTION002 {
    public static void CheckFileExtension(String filename){
        if(filename == null || filename.isEmpty()){
            System.out.println("Not java file exception.Mark is -1");
        }
        else {
            if(filename.endsWith(".java")){
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String filename = sc.nextLine();
            CheckFileExtension(filename);
        }
    }
}
