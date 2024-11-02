package ua.edu.ucu.apps.FlowerStore.flower;

public class RomashkaFlower extends Item {
    private double price = 80;

    public RomashkaFlower() {
        super("Romashka Flower");
    }

    public double getPrice() {
        return this.price;
    }
}
