import java.util.ArrayList;

public class Basket {

    ArrayList <Bagel> basketItems = new ArrayList<>();

    void add (Bagel item) {
        basketItems.add(item);
    }

    void remove (Bagel item) {
        basketItems.remove(item);
    }

    Boolean checkRemovedBagel (Bagel item) {
        for(int i = 0; i < basketItems.size(); i++) {
            if(basketItems.get(i) == item) {
                return true;
            }
        } return false;
    }
}