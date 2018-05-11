import Accessories.PackOfGuitarStrings;
import Enums.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PackOfGuitarStringsTest {

    PackOfGuitarStrings packOfGuitarStrings;

    @Before
    public void setUp() throws Exception {
        packOfGuitarStrings = new PackOfGuitarStrings("Stringos", 5.00, 10.00, "Nylon", InstrumentType.STRING, 5);
    }

    @Test
    public void hasBrand(){
        assertEquals("Stringos", packOfGuitarStrings.getBrand());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(5.00, packOfGuitarStrings.getBuyPrice(), 0.1);
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(10.00, packOfGuitarStrings.getSellPrice(), 0.1);
    }

    @Test
    public void hasMaterial(){
        assertEquals("Nylon", packOfGuitarStrings.getMaterial());
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.STRING, packOfGuitarStrings.getInstrumentType());
    }

    @Test
    public void hasANumberOfStrings(){
        assertEquals(5, packOfGuitarStrings.getNumOfStrings());
    }


}
