package Instruments;

import Enums.InstrumentType;
import Items.Instrument;

public class Trumpet extends Instrument {

    private int numberOfValves;

    public Trumpet(String brand, double buyPrice, double sellPrice, String model, String material, InstrumentType instrumentType, int numberOfValves) {
        super(brand, buyPrice, sellPrice, model,  instrumentType, material);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }


}
