package Instruments;

import Behaviours.IPlay;
import Enums.InstrumentType;
import Items.Item;

public class Trumpet extends Item implements IPlay {
    private String model;
    private int numberOfValves;

    public Trumpet(String brand, double buyPrice, double sellPrice, String material, InstrumentType instrumentType, String model, int numberOfValves) {
        super(brand, buyPrice, sellPrice, material, instrumentType);
        this.model = model;
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public String getModel() {
        return model;
    }

    public String play(){
        return "Trumpet noises";
    }

}
