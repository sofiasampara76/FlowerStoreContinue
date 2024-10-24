package ua.edu.ucu.apps.FlowerStore.delivery;

import java.util.List;

import ua.edu.ucu.apps.FlowerStore.flower.Item;

public class DHLDeliveryStrategy implements Delivery {
    private String name;
    private String description;

    public DHLDeliveryStrategy() {
        this.name = "DHLDelivery";;
        this.description = "Deliver before payment";
    }

    public void deliver(List<Item> items) {

    }
}
