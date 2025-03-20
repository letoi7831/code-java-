import java.util.Scanner;

class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString(){
        return "Author[name=" + name + ", email=" + email + ", gender=" + gender + "]";
    }
}

class Book {
    private String name;
    private Author author;
    private double price;
    private int qty = 0;

    public Book(String name, Author author, double price, int qty){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    @Override
    public String toString(){
        return "Book[name=" + name + ", " + author.toString() + ", price=" + price + ", qty=" + qty + "]";
    }
}

public class oop012 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        scan.nextLine();
        while(test-- >0){
            String type1 = scan.nextLine();
            if(type1.equals("Book")){
                String bookName = scan.nextLine();
                double price = scan.nextFloat();
                int qty = scan.nextInt();
                scan.nextLine();

                String type2 = scan.nextLine(); //Nhập "Author"
                String authorName = scan.nextLine();
                String email = scan.nextLine();
                char gender = scan.nextLine().charAt(0);

                Author author = new Author(authorName, email, gender);
                Book book = new Book(bookName, author, price, qty);
                String endInput = scan.nextLine();
                System.out.println(book);
            }
        }
        scan.close();
    }
}


