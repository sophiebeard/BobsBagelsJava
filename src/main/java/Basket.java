import java.util.ArrayList;

public class Basket {
    int basketCapacity;
    ArrayList <Bagel> basketItems = new ArrayList<>(this.basketCapacity);
    public Basket(int capacity) {
        this.basketCapacity = capacity;

    }

    void add (Bagel item)  {
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

    Boolean isFull (Basket basket) {
        if (basket.basketItems.size() >= basket.basketCapacity) {
            return true;
        }
        else {
            return false;
        }
    }
}