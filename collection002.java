
import java.util.HashMap;

public class collection002 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        // Thêm sản phẩm coffee với giá 5 và số lượng 1
        warehouse.addProduct("coffee", 5, 1);

        // In số lượng tồn kho
        System.out.println("stock:");
        System.out.println("coffee:  " + warehouse.stock("coffee"));
        System.out.println("sugar: " + warehouse.stock("sugar"));

        // Lấy sản phẩm ra khỏi kho và in kết quả
        System.out.println("taking coffee " + warehouse.take("coffee"));
        System.out.println("taking coffee " + warehouse.take("coffee"));
        System.out.println("taking sugar " + warehouse.take("sugar"));

        // In số lượng tồn kho sau khi lấy sản phẩm
        System.out.println("stock:");
        System.out.println("coffee:  " + warehouse.stock("coffee"));
        System.out.println("sugar: " + warehouse.stock("sugar"));
    }
}
