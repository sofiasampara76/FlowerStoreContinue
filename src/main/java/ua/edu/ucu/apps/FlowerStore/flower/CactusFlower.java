package ua.edu.ucu.apps.FlowerStore.flower;

public class CactusFlower extends Item {
    private double price = 80;

    public CactusFlower() {
        super("Cactus Flower");
    }

    public double getPrice() {
        return this.price;
    }
}
