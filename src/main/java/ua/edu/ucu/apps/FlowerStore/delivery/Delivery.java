package ua.edu.ucu.apps.FlowerStore.delivery;

import java.util.List;

import ua.edu.ucu.apps.FlowerStore.flower.Item;

public interface Delivery {
    public void deliver(List<Item> items);
}
