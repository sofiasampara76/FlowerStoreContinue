package ua.edu.ucu.apps.FlowerStore.payment;

import java.util.List;

import ua.edu.ucu.apps.FlowerStore.flower.Item;

public interface Payment {
    public void pay(List<Item> items);
}
