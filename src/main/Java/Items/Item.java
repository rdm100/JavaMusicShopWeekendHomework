package Items;

import Enums.InstrumentType;

public abstract class Item {

    private String brand;
    private double buyPrice;
    private double sellPrice;
    private String material;
    protected InstrumentType instrumentType;

    public Item(String brand, double buyPrice, double sellPrice, String material, InstrumentType instrumentType) {
        this.brand = brand;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.material = material;
        this.instrumentType = instrumentType;
    }

    public String getBrand() {
        return brand;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public String getMaterial() {
        return material;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

}
