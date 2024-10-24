package ua.edu.ucu.apps.FlowerStore.delivery;

import java.util.List;

import ua.edu.ucu.apps.FlowerStore.flower.Item;

public class PostDeliveryStrategy implements Delivery {
    private String name;
    private String description;

    public PostDeliveryStrategy() {
        this.name = "Post delivery";
        this.description = "Deliver after the payment";
    }

    public void deliver(List<Item> items) {

    }
}
