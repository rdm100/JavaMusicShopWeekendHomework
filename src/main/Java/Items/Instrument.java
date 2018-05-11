package Items;

import Enums.InstrumentType;

public class Instrument extends Item{

    private String model;

    public Instrument(String brand, double buyPrice, double sellPrice, String material, InstrumentType instrumentType, String model) {
        super(brand, buyPrice, sellPrice, material, instrumentType);
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
