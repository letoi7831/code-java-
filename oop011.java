class students{
    private String name;
    private int age;
    private int numberofstudents = 0;
    public students(String name, int age, int numberofstudents) {
        this.name = name;
        this.age = age;
    }
    public void display() {
        if(age >= 18) {
            System.out.println(name + "\n" + age);
        }
    }
}
public class oop011 {
    public static void main(String[] args) {

    }
}
