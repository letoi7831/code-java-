class Student {
    private String name;
    private String address;
    private int credits;

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
        this.credits = 0; // Mặc định số tín chỉ ban đầu là 0
    }

    public void study() {
        credits++; // Mỗi lần học tăng thêm 1 tín chỉ
    }

    public int credits() {
        return credits; // Trả về số tín chỉ hiện tại
    }

    @Override
    public String toString() {
        return name + " - " + address;
    }
}

public class INHERITANCE008 {
    public static void main(String[] args) {
        // Tạo sinh viên Ollie
        Student student = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");

        // In thông tin sinh viên
        System.out.println(student);

        // In số tín chỉ trước khi học
        System.out.println("Study credits " + student.credits());

        // Sinh viên học 1 lần
        student.study();

        // In số tín chỉ sau khi học
        System.out.println("Study credits " + student.credits());
    }
}

