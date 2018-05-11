import Accessories.SheetMusic;
import Enums.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void setUp() throws Exception {
        sheetMusic = new SheetMusic("Pages", 5.00, 10.00, "Paper", InstrumentType.BRASS, 100);
    }

    @Test
    public void hasBrand() {
        assertEquals("Pages", sheetMusic.getBrand());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(5.00, sheetMusic.getBuyPrice(), 0.1);
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(10.00, sheetMusic.getSellPrice(), 0.1);
    }

    @Test
    public void hasMaterial() {
        assertEquals("Paper", sheetMusic.getMaterial());
    }

    @Test
    public void hasInstrumentType() {
        assertEquals(InstrumentType.BRASS, sheetMusic.getInstrumentType());
    }

    @Test
    public void hasANumberOfPages() {
        assertEquals(100, sheetMusic.getNumberOfPages());
    }

}

