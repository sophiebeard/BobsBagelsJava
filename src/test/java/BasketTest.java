import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BasketTest {

    @Test
    @DisplayName("A bagel has been added to the basket")
    void addBagel() {
        // Arrange
        basket = new Basket();
        item = { id: 'item1' };
        expected = 1;

        //Act
        basket.add(item1);
        actual = basket.basketItems.length;
        // Assert
        assertEquals(Basket.length(), 1);

}


