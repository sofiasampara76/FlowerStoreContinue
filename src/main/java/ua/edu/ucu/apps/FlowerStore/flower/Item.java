package ua.edu.ucu.apps.FlowerStore.flower;

import lombok.Getter;

@Getter
public class Item {
    private double price;
    private String description;

    public String getDescription() {
        return this.description;
    }
}
