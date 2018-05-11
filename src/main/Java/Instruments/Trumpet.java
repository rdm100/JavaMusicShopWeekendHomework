package Instruments;

import Enums.InstrumentType;
import Items.Item;

public class Trumpet extends Item.Instrument {

    private int numberOfValves;

    public Trumpet(String brand, double buyPrice, double sellPrice, String model, String material, InstrumentType instrumentType, int numberOfValves) {
        super(brand, buyPrice, sellPrice, model,  instrumentType, material);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }


}
