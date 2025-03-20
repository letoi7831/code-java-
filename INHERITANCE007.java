import java.util.*;

abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double calculateArea();

    public void displayInfo() {
        System.out.printf("Shape:%s|Area:%.2f%n", name, calculateArea());
    }
}

class Rectangle extends Shape {
    private final double width;
    private final double length;

    public Rectangle(double width, double length) {
        super("Rectangle");
        this.width = width;
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return width * length;
    }
}

class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class INHERITANCE007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());

        // Tạo mảng để lưu các hình học
        Shape[] shapes = new Shape[testCases];

        for (int i = 0; i < testCases; i++) {
            String[] input = sc.nextLine().split(" ");
            String shapeType = input[0];

            switch (shapeType) {
                case "Rectangle": {
                    double width = Double.parseDouble(input[1]);
                    double length = Double.parseDouble(input[2]);
                    shapes[i] = new Rectangle(width, length);
                    break;
                }
                case "Circle": {
                    double radius = Double.parseDouble(input[1]);
                    shapes[i] = new Circle(radius);
                    break;
                }
            }
        }
        // Duyệt mảng để hiển thị kết quả
        for (int i = 0; i < testCases; i++) {
            if (shapes[i] != null) {
                shapes[i].displayInfo();
            }
        }
    }
}
