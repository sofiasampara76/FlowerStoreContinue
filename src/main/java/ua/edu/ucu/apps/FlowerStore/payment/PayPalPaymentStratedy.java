package ua.edu.ucu.apps.FlowerStore.payment;

import java.util.List;

import lombok.Getter;
import ua.edu.ucu.apps.FlowerStore.flower.Item;

@Getter
public class PayPalPaymentStratedy implements Payment{
    private String name;
    private String description;

    public PayPalPaymentStratedy() {
        this.name = "PayPal";
        this.description = "Paid with PayPal!";
    }

    @Override
    public void pay(List<Item> items) {
        double price = 0;
        for (Item item: items) {
            price += item.getPrice();
        }
        System.out.println(price);
    }
}
