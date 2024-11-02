package ua.edu.ucu.apps.FlowerStore.flower;

import lombok.Getter;

@Getter
public abstract class Item {
    private double price;
    private String description;

    public Item(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public abstract double getPrice();
}
