import java.util.Scanner;

class Person1 {
    private String name;
    private int age;
    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        if (name == null || name.isEmpty() || name.length() > 40) {
            return "Name is not valid";
        } else if (age < 0 || age > 120) {
            return "Age is not valid";
        } else {
            return "Name: " + name + "--Age:" + age;
        }
    }
}
public class EXCEPTION004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String name = sc.nextLine();
            int age = sc.nextInt();
            sc.nextLine();
            Person1 p = new Person1(name, age);
            System.out.println(p);
        }
    }
}
