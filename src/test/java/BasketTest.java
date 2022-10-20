import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BasketTest {

    @Test // 1
    @DisplayName("Verify that a bagel has been added to the basket")
    void addBagel() {
        // Arrange
       Basket basket = new Basket(3);
       Bagel bagel1 = new Bagel(7);
       int expected = 1;

       //Act
        basket.add(bagel1, basket);
        int actual = basket.basketItems.size();
        // Assert
        assertEquals(expected, actual);
    }

    @Test // 2
    @DisplayName("Validate that the specific bagel has been added to the basket")
    void addValidBagel() {
        // Arrange
        Basket basket = new Basket(3);
        Bagel bagel1 = new Bagel(42);

        basket.add(bagel1, basket);
        int expected = (basket.basketItems.get(0)).id; // ((Bagel)basket.basketItems.get(0) alternative method to telling the array that it will take Bagel objects only.

        // Act

        int actual = bagel1.id;

        // Assert
        assertEquals(expected, actual);
    }

    @Test // 3
    @DisplayName("Verify that a bagel has been removed from the basket")
    void removeBagel() {
        // Arrange
        Basket basket = new Basket(3);
        Bagel bagel1 = new Bagel(7);
        basket.add(bagel1, basket);
        int expected = 0;

        //Act
        basket.remove(bagel1);
        int actual = basket.basketItems.size();
        // Assert
        assertEquals(expected, actual);
    }

    @Test // 4
    @DisplayName("Validate that the specific bagel has been removed from the basket")
    void removeValidBagel() {
        // Arrange
        Basket basket = new Basket(3);
        Bagel bagel1 = new Bagel(42);
        Bagel bagel2 = new Bagel(40);
        basket.add(bagel1, basket);
        basket.add(bagel2, basket);
        basket.remove(bagel1);
        Boolean expected = false;

        // Act
        Boolean actual = basket.checkRemovedBagel(bagel1);

        // Assert
        assertEquals(expected, actual);
    }

    @Test // 5
    @DisplayName("Check whether the basket is full")
    void isFull() {
        // Arrange
        Basket basket = new Basket(3);
        Bagel bagel1 = new Bagel(42);
        Bagel bagel2 = new Bagel(40);
        Bagel bagel3 = new Bagel(45);
        basket.add(bagel1, basket);
        basket.add(bagel2, basket);
        basket.add(bagel3, basket);
        Boolean expected = true;

        // Act
        Boolean actual = basket.isFull(basket);

        // Assert
        assertEquals(expected, actual);
    }

    @Test // 6
    @DisplayName("Check if it is possible to add a bagel to a full basket")
    void addWhenFull() {
        // Arrange
        Basket basket = new Basket();
        Bagel bagel1 = new Bagel(42);
        Bagel bagel2 = new Bagel(40);
        Bagel bagel3 = new Bagel(45);
        Bagel bagel4 = new Bagel(44);
        basket.add(bagel1, basket);
        basket.add(bagel2, basket);
        basket.add(bagel3, basket);
        basket.add(bagel4, basket);
        int expected = 3;

        // Act
        int actual = basket.basketItems.size();

        // Assert
        assertEquals(expected, actual);
    }

    @Test // 7
    @DisplayName("Check that the capacity can be increased")
    void increaseCapacityWhenFull() {
        // Arrange
        Basket basket = new Basket(4);
        Bagel bagel1 = new Bagel(42);
        Bagel bagel2 = new Bagel(40);
        Bagel bagel3 = new Bagel(45);
        Bagel bagel4 = new Bagel(44);
        basket.add(bagel1, basket);
        basket.add(bagel2, basket);
        basket.add(bagel3, basket);
        basket.add(bagel4, basket);
        int expected = 4;

        // Act
        int actual = basket.basketItems.size();

        // Assert
        assertEquals(expected, actual);
    }

}