import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Warehouse {
    private HashMap<String, Integer> price ;
    private HashMap<String, Integer> stock ;
    public Warehouse(){
        this.price = new HashMap<>();
        this.stock = new HashMap<>();
    }
    public void addProduct(String product, int price, int stock){
        this.price.put(product, price);
        this.stock.put(product, stock);
    }
    public int price (String product){
        if(price.containsKey(product)){
            return price.get(product);
        }
        else return -99;
    }
    public int stock(String product){
        if(stock.containsKey(product)){
            return stock.get(product);
        }
        else {
            return 0;
        }
    }
    public boolean take(String product){
        if(stock.containsKey(product) && stock.get(product) > 0){
            stock.put(product, stock.get(product) - 1);
            return true;
        }
        return false;
    }
    public Set<String> Product(){
        return stock.keySet();
    }
}
public class collection001{
    public static void main(String [] args){
        Warehouse p = new Warehouse();
        p.addProduct("milk", 3, 10);
        p.addProduct("coffee", 5, 7);
        System.out.println("prices:\nmilk: " + p.price("milk"));
        System.out.println("coffee: " + p.price("coffee"));
        System.out.println("sugar: "+ p.price("sugar"));
    }
}
