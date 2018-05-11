package Instruments;

import Behaviours.IPlay;
import Enums.InstrumentType;
import Items.Item;

public class Saxophone extends Item implements IPlay {

    private String reed;

    public Saxophone(String brand, double buyPrice, double sellPrice, String material, InstrumentType instrumentType, String reed) {
        super(brand, buyPrice, sellPrice, material, instrumentType);
        this.reed = reed;
    }
    public String play(){
        return "Saxophone noises";
    }
}
