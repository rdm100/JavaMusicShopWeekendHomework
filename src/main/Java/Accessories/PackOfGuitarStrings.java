package Accessories;

import Enums.InstrumentType;
import Items.Item;

public class PackOfGuitarStrings extends Item {

   private int numOfStrings;

    public PackOfGuitarStrings(String brand, double buyPrice, double sellPrice, String material, InstrumentType instrumentType, int numOfStrings) {
        super(brand, buyPrice, sellPrice, material, instrumentType);
        this.numOfStrings = numOfStrings;
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }

    public void setNumOfStrings(int numOfStrings) {
        this.numOfStrings = numOfStrings;
    }



}
