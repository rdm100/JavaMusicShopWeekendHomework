package Accessories;

import Enums.InstrumentType;
import Items.Item;

public class SheetMusic extends Item {
    private int numberOfPages;

    public SheetMusic(String brand, double buyPrice, double sellPrice, String material, InstrumentType instrumentType, int numberOfPages) {
        super(brand, buyPrice, sellPrice, material, instrumentType);
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }


}
