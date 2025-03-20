class person {
    private String name;
    private String address;
    public person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String toString() {
        return name + " - " + address;
    }
}
class student extends person {
    private int credit;
    public student(String name, String address) {
        super(name, address);
        this.credit = 0;
    }
    public void study() {
        credit++;
    }
    public int getCredits() {
        return credit;
    }
}
public class INHERITANCE003 {
    public static void main(String[] args) {
        student student = new student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(student);
        System.out.println("Study credits " + student.getCredits());
        student.study();
        System.out.println("Study credits " + student.getCredits());
    }
}
