import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BasketTest {

    @Test
    @DisplayName("A bagel has been added to the basket")
    void addBagel() {
        // Arrange
       Basket basket = new Basket();
        String item = "item1";
       int expected = 1;

        //Act
        basket.add(item);
        int actual = basket.basketItems.length;
        // Assert
        assertEquals(expected, actual);
    }
}


