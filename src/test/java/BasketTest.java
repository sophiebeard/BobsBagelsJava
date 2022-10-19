import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BasketTest {

    @Test
    @DisplayName("A bagel has been added to the basket")
    void addBagel() {
        // Arrange
       Basket basket = new Basket();
       Bagel bagel1 = new Bagel();
       int expected = 1;

       //Act
        basket.add(bagel1);
        int actual = basket.basketItems.size();
        // Assert
        assertEquals(expected, actual);
    }
}