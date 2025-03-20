class product {
    private String name;
    private String location = "shelf" ;
    private int weight = 1 ;
    public product(String name) {
        this.name = name;
    }
    public product(String name, String location) {
        this.name = name;
        this.location = location;
    }
    public product (String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    public String toString(){
        return name + " (" + weight + "kg) can be found from the " + location;
    }
}
public class oop010 {
    public static void main(String[] args) {
        product p1 = new product("Tape measure");
        product p2 = new product("Plaster" , "home improvement section");
        product p3 = new product("Tyre" , 5);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
