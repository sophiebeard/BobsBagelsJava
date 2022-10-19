import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BasketTest {

    @Test // 1
    @DisplayName("Verify that a bagel has been added to the basket")
    void addBagel() {
        // Arrange
       Basket basket = new Basket();
       Bagel bagel1 = new Bagel(7);
       int expected = 1;

       //Act
        basket.add(bagel1);
        int actual = basket.basketItems.size();
        // Assert
        assertEquals(expected, actual);
    }

    @Test // 2
    @DisplayName("Validate that the specific bagel has been added to the basket")
    void addValidBagel() {
        // Arrange
        Basket basket = new Basket();
        Bagel bagel1 = new Bagel(42);

        basket.add(bagel1);
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
        Basket basket = new Basket();
        Bagel bagel1 = new Bagel(7);
        basket.add(bagel1);
        int expected = 0;

        //Act
        basket.remove(bagel1);
        int actual = basket.basketItems.size();
        // Assert
        assertEquals(expected, actual);
    }
}