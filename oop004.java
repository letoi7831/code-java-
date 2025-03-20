import java.util.Scanner;

class Point{
    private int x;
    private int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void move ( int dx, int dy){
        this.x += dx;
        this.y += dy;
    }
    public double distance(Point p){
        return Math.sqrt(Math.pow(this.x - p.getX(), 2) + Math.pow(this.y - p.getY(), 2));
    }
}
public class oop004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            Point A = new Point(x1, y1);
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            Point B = new Point(x2, y2);
            A.move(1,1);
            double distance = A.distance(B);
            System.out.printf("%.2f\n", distance);

        }
    }
}
