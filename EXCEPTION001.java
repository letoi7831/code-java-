import java.util.Scanner;

class Amount {
    private String currency;
    private int amount;

    public Amount(String currency, int amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public void add(Amount amount) {
        if (this.currency.equals(amount.currency)) {
            System.out.println(this.amount + amount.amount);
        } else {
            System.out.println("Currency doesn't match");
        }
    }
}

public class EXCEPTION001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String currency1 = scanner.next();
            int amount1 = scanner.nextInt();
            String currency2 = scanner.next();
            int amount2 = scanner.nextInt();

            Amount a1 = new Amount(currency1, amount1);
            Amount a2 = new Amount(currency2, amount2);

            a1.add(a2);
        }
        scanner.close();
    }
}
