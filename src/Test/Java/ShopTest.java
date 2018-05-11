import Enums.InstrumentType;
import Instruments.Piano;
import Instruments.Trumpet;
import Shop.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Trumpet trumpet;
    Piano piano;

    @Before
    public void setUp() throws Exception {
        shop = new Shop("Muso");
        trumpet = new Trumpet("Vincent Bach Corporation", 50.00, 100.00, "Brass", InstrumentType.BRASS , "Stradavarius", 3);
        piano = new Piano("Yamaha", 500.00, 1000.00, "Wood", InstrumentType.KEYBOARD, 88, 3);

    }

    @Test
    public void getName() {
        assertEquals("Muso", shop.getName());
    }

    @Test
    public void hasNoStockInitially() {
        assertEquals(0, shop.countStock());
    }

    @Test
    public void canAddStockToShop() {
        shop.addStock(piano);
        assertEquals(1, shop.countStock());
    }

    @Test
    public void canRemoveStockToShop() {
        shop.addStock(piano);
        shop.addStock(trumpet);
        shop.removeStock(piano);
        assertEquals(1, shop.countStock());
    }

    @Test
    public void canGetPotentialProfit() {
        shop.addStock(piano);
        shop.addStock(trumpet);
        assertEquals(550, shop.profit(), 0.1);
    }

}
