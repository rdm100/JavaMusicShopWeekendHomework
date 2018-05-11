package Instruments;

import Behaviours.IPlay;
import Enums.InstrumentType;
import Items.Item;

public class Piano extends Item implements IPlay {

    private int numberOfKeys;
    private int numberOfPedals;

    public Piano(String brand, double buyPrice, double sellPrice, String material, InstrumentType instrumentType, int numberOfKeys, int numberOfPedals) {
        super(brand, buyPrice, sellPrice, material, instrumentType);
        this.numberOfKeys = numberOfKeys;
        this.numberOfPedals = numberOfPedals;
    }

    public String play(){
        return "Piano noises";
    }

}
