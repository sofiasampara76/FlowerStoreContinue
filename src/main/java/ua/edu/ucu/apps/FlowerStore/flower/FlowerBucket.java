package ua.edu.ucu.apps.FlowerStore.flower;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket extends Item {
    private List<Item> flowers;

    public FlowerBucket() {
        super("Flower Bucket");
        flowers = new ArrayList<>();
    }

    public void addFlower(Item flower) {
        flowers.add(flower);
    }

    @Override
    public String getDescription() {
        return "Flower bucket with " + flowers.size() + " flowers";
    }

    @Override
    public double getPrice() {
        int price = 0;
        for (Item flower: flowers) {
            price += flower.getPrice();
        }
        return price;
    }

    public String searchFlower(Item flower) {
        for (Item flower_: flowers) {
            if (flower_ == flower) {
                return "The flower is in the bucket.";
            }
        }
        return "There is not such flower in the bucket.";
    }
}
