import java.util.ArrayList;

public class Basket {

    ArrayList <Bagel> basketItems = new ArrayList<>();

    void add (Bagel item) {
        basketItems.add(item);
    }

    void remove (Bagel item) {
        basketItems.remove(item);
    }
}
