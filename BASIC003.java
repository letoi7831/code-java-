import java.util.Scanner;
public class BASIC003 {
     public static void isLeapYear(Scanner sc){
        int y = sc.nextInt();
        if((y %4==0 && y % 100 != 0) || (y %400 ==0) ){
            System.out.println(y + " : Leap-year");
        }else{
            System.out.println(y + " : Non Leap-year");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
           isLeapYear(sc); 
           t--;
        }         
    }
}
