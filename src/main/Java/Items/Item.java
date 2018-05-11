package Items;

public abstract class Item {

    private String brand;
    private double buyPrice;
    private double sellPrice;

    public Item(String brand, double buyPrice, double sellPrice) {
        this.brand = brand;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }
}
