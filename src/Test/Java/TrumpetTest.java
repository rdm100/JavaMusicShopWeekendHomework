import Enums.InstrumentType;
import Instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {
    Trumpet trumpet;

    @Before
    public void setUp() throws Exception {
        trumpet = new Trumpet("Vincent Bach Corporation", 50.00, 100.00, "Brass", InstrumentType.BRASS , "Stradavarius", 3);
    }

    @Test
    public void hasBrand(){
        assertEquals("Vincent Bach Corporation", trumpet.getBrand());
    }



}
