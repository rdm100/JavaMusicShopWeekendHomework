import Enums.InstrumentType;
import Instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {

    Trumpet trumpet;

    @Before
    public void setUp() throws Exception {
        trumpet = new Trumpet("Vincent Bach Corporation", 50.00, 100.00, "Brass", "Stradavarius",  InstrumentType.BRASS ,3);
    }

    @Test
    public void hasBrand(){
        assertEquals("Vincent Bach Corporation", trumpet.getBrand());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(100.00, trumpet.getSellPrice(), 0.1);
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(100.00, trumpet.getSellPrice(), 0.1);
    }

    @Test
    public void hasMaterial(){
        assertEquals("Brass", trumpet.getMaterial());
    }

    @Test
    public void hasModel(){
        assertEquals("Stradavarius", trumpet.getModel());
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(InstrumentType.BRASS, trumpet.getInstrumentType());
    }

}
