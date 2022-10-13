import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BasketTest {

    @Test
    @DisplayName("A bagel has been added to the basket")
    void addBagel() {
        // Arrange

        // Assert
        assertEquals(Basket.length(), 1);

}


