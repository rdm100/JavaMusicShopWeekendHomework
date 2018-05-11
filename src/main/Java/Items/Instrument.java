package Items;

import Enums.InstrumentType;

public class Instrument extends Item{

    private  String model;
    private String material;
    private InstrumentType instrumentType;

    public Instrument(String brand, double buyPrice, double sellPrice, String model, String material, InstrumentType instrumentType) {
        super(brand, buyPrice, sellPrice);
        this.model = model;
        this.material = material;
        this.instrumentType = instrumentType;
    }

}
