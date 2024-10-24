package ua.edu.ucu.apps.FlowerStore.order;

import java.util.List;

import ua.edu.ucu.apps.FlowerStore.delivery.Delivery;
import ua.edu.ucu.apps.FlowerStore.flower.Item;
import ua.edu.ucu.apps.FlowerStore.payment.Payment;

public class Order {
    public List<Item> items;
    public Payment payment;
    public Delivery delivery;

    public void setPaymentStrategy(Payment new_payment) {
        payment = new_payment;
    }

    public void setDeliveryStrategy(Delivery new_delivery) {
        delivery = new_delivery;
    }

    public double calculateTotalPrice() {
        double price = 0;
        for (Item item: items) {
            price += item.getPrice();
        }
        return price;
    }

    public void addItem(Item newItem) {
        items.add(newItem);
    }

    public void removeItem(Item deleteItem) {
        items.remove(deleteItem);
    }

    public void processOrder() {
        payment.pay(items);
        delivery.deliver(items);
    }
}
